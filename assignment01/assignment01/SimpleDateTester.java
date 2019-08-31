package assignment01;
import java.time.LocalDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
  public static void main(String[] args) {
    SimpleDate test1 = SimpleDate.of(1999, 05, 11);
    SimpleDate test2 = SimpleDate.of(1989, 02, 02);
    if( test1.before(test2) == true)
    {
      System.out.println("test2 Is before test1");
    }
    else
    {
      System.out.println("test1 is before test2");
    }
  }
}
