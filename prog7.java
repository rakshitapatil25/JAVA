/*Write a program that demonstrates handling of
exceptions in inheritance tree. Create a base class called
“Father” and derived class called “Son” which extends the
base class. In Father class, implement a constructor which
takes the age and throws the exception WrongAge( ) when
the input age<0. In Son class, implement a constructor
that uses both father and son’s age and throws an
exception if son’s age is >=father’s age. */

class WrongAge extends Exception{
  public WrongAge(String msg){
    super(msg);
  }
}
class Father{
  int fatherAge;
  Father(int age) throws WrongAge{
    if(age<=0){
      throw new WrongAge("Father's age must be positive");
    }
    else{
      this.fatherAge=age;
      System.out.println("Father's age: " + fatherAge);
    }
  }
}
class Son extends Father{
  int sonAge;
  Son(int fatherAge, int sonAge) throws WrongAge{
    super(fatherAge);
    if (sonAge >= fatherAge) {
      throw new WrongAge("Son's age cannot be greater than or equal to father's age!");
    }
    if (sonAge < 0) {
        throw new WrongAge("Son's age cannot be negative!");
    }
    this.sonAge = sonAge;
    System.out.println("Son's age: " + sonAge);
  }
}
public class prog7 {
  public static void main(String[] args) {
      System.out.println("");
      try {
          System.out.println("Case 1: ");
          Son s1 = new Son(40,20);
          System.out.println("\nCase 2: ");
          Son s2 = new Son(20, 40);
      } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
      }
      try {
          System.out.println("\nCase 3: ");
          Son s3 = new Son(-20,10);
      } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
      }
      System.out.println("");
  }
  
}
