/* Develop a Java program to create a class Student with
members usn, name, an array credits and an array marks.
Include methods to accept and display details and a
method to calculate SGPA of a student. */
import java.util.Scanner;
class Student{
  public static int gradePoints(int score){
    int points;
    if(score>=90){
      points=10;
    }
    else if(score>=80){
      points=9;
    }
    else if(score>=70){
      points=8;
    }
    else if(score>=60){
      points=7;
    }
    else if(score>=50){
      points=6;
    }
    else{
      points=0;
    }
    return points;
  }
}
public class prog2 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("\n");
      int credSum=0;
      int pointsSum=0;
      System.out.print("Enter Name: ");
      String name = sc.nextLine();
      System.out.print("Enter USN: ");
      String usn = sc.nextLine();
      System.out.print("Enter number of subjects: ");
      int n = sc.nextInt();
      int cred[]= new int[n];
      int marks[]=new int[n];

      for(int i=0;i<n;i++){
        System.out.print("Enter subject "+ (i+1) + " credits: ");
        cred[i] = sc.nextInt();
        credSum+=cred[i];
        System.out.print("Enter subject "+ (i+1) + " marks: ");
        marks[i] = sc.nextInt();
        pointsSum+=Student.gradePoints(marks[i])*cred[i];
      }
      float SGPA = (float)pointsSum/credSum;
      System.out.println("\nName : " + name);
      System.out.println("USN : " + usn);
      System.out.printf("SGPA : %.3f",SGPA);
      System.out.println("\n");

      sc.close();
  }
}
