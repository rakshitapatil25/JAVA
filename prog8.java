class CollegeThread extends Thread{
  public void run(){
    try {
      while(true){
        System.out.println("BMS College of Engineering");
        Thread.sleep(10000);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class CSEThread extends Thread{
  public void run(){
    try {
      while(true){
        System.out.println("CSE");
        Thread.sleep(2000);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

public class prog8 {
  public static void main(String[] args) {
    System.out.println("");
    CollegeThread t1=new CollegeThread();
    CSEThread t2=new CSEThread();
    t1.start();
    t2.start();
  }
}
