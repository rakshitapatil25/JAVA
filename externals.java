package marks.see;
import marks.cie.*;

public class externals extends personals {
  public int seeMarks [] = new int[5];

  public externals(String usn, String name, int sem, int[] marks){
    super(usn,name,sem);
    seeMarks=marks;
  }
}
