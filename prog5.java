class Account{
  String customerName;
  int accountNumber;
  String accountType;
  double balance;
  Account(String name, int accNum, String type, double initialBalance) {
    customerName = name;
    accountNumber = accNum;
    accountType = type;
    balance = initialBalance;
  }
  void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
  }
  void displayBalance() {
    System.out.println("Current Balance: " + balance);
  }

}
class savAccount extends Account{
  double interestRate = 0.05;

  savAccount(String name, int accNum, String type, double initialBalance){
    super(name, accNum, type, initialBalance);
  }

  void computeAndDepositInterest(int years){
    double interest = balance * Math.pow((1 + interestRate), years) - balance;
    balance+=interest;
    System.out.println("Interest added: " + interest);
  }

  void withdraw(double amount){
    if (amount <= balance) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } 
    else {
      System.out.println("Insufficient balance for withdrawal.");
    }
  }
}
class curAccount extends Account{
  double minimumBalance = 500.0;
  double serviceCharge = 50.0;
  curAccount(String name, int accNum, double initialBalance) {
    super(name, accNum, "Current", initialBalance);
  }
  void checkMinimumBalance(){
    if (balance < minimumBalance) {
      balance -= serviceCharge;
      System.out.println("Balance below minimum. Service charge imposed: " + serviceCharge);
    }
  }
  void withdraw(double amount){
    if (amount <= balance) {
      balance -= amount;
      checkMinimumBalance();
      System.out.println("Withdrawn: " + amount);
    } 
    else {
      System.out.println("Insufficient balance for withdrawal.");
    }
  }
  void chequeBookFacility() {
    System.out.println("Cheque book facility is available.");
  }

}

public class prog5 {
  public static void main(String[] args) {
    System.out.println("\n");
    System.out.println("Savings Account: ");
    savAccount A1 = new savAccount("Alice", 1001, "gen", 1000.0);
    A1.deposit(500);
    A1.computeAndDepositInterest(2);
    A1.withdraw(300);
    A1.displayBalance();
    System.out.println("");
    System.out.println("Current Account: ");
    curAccount A2 = new curAccount("Tina", 1002, 2000.0);
    A2.deposit(300);
    A2.chequeBookFacility();
    A2.withdraw(2000);
    A2.displayBalance();
    System.out.println("");
  }
}
