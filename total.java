package marks.scores;
import java.util.Scanner;
import marks.cie.*;
import marks.see.*;
public class total {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of students: ");
      int n = sc.nextInt();

      internals[] in = new internals[n];
      externals[] ex = new externals[n];

      for (int i = 0; i < n; i++) {
          System.out.println("\nEnter details for student " + (i + 1));
          System.out.print("USN: ");
          String usn = sc.next();
          System.out.print("Name: ");
          String name = sc.next();
          System.out.print("Semester: ");
          int sem = sc.nextInt();

          int[] internalMarks = new int[5];
          System.out.println("Enter 5 internal marks:");
          for (int j = 0; j < 5; j++) {
              internalMarks[j] = sc.nextInt();
          }

          int[] seeMarks = new int[5];
          System.out.println("Enter 5 SEE marks:");
          for (int j = 0; j < 5; j++) {
              seeMarks[j] = sc.nextInt();
          }

          in[i] = new internals(internalMarks);
          ex[i] = new externals(usn, name, sem, seeMarks);
      }

      System.out.println("\nTotal Marks:");
      for (int i = 0; i < n; i++) {
          System.out.println("\nStudent " + (i + 1) + ": " +ex[i].name + " (" + ex[i].usn + ")");
          for (int j = 0; j < 5; j++) {
              int finalMark = in[i].internalMarks[j] + ex[i].seeMarks[j];
              System.out.println("Subject " + (j + 1) + ": " + finalMark);
          }
      }
      sc.close();
  }
}
