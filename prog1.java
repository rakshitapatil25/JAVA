/*  Develop a Java program that prints all real solutions
to the quadratic equation ax2+bx+c = 0. 
Read in a, b, c and use the quadratic formula. 
If the discriminate b^2-4ac is negative, display a message stating that there are no real solutions. */
import java.util.Scanner;

public class prog1 {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("\n\nFor a quadratic equation in the form ax^2+bx+c.");
      System.out.print("Enter a: ");
      double a = sc.nextDouble();
      System.out.print("Enter b: ");
      double b = sc.nextDouble();
      System.out.print("Enter c: ");
      double c = sc.nextDouble();

      double d = (b*b)-(4*a*c);

      if(d>0){
        System.out.println("The given Quadratic equation has two real roots");
        double r1 = (-b + Math.sqrt(d))/(2*a);
        double r2 = (-b - Math.sqrt(d))/(2*a);
        System.out.printf("Root 1: %.3f\n", r1);
        System.out.printf("Root 2: %.3f\n", r2);
      }
      else if(d<0){
        System.out.println("The given Quadratic equation has no real roots (imaginary roots)");
        double k1 = -b/(2*a);
        double k2 = Math.sqrt(-d)/(2*a);
        System.out.printf("Root 1: %.3f + %.3fi \n",k1,k2);
        System.out.printf("Root 2: %.3f - %.3fi \n",k1,k2);
      }
      else{
        System.out.println("The given Quadratic equation has one real root");
        System.out.printf("Root : %.3f\n", -b/(2*a));
      }
      System.out.println("");
      sc.close();
  }
}
