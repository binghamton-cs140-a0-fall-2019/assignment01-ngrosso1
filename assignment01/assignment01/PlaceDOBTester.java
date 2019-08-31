///DONE

package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth DOBT1 = new DateAndPlaceOfBirth(1999, 01, 21, "Thornwood", "NY", "USA");
    DateAndPlaceOfBirth DOBT2 = new DateAndPlaceOfBirth(2002, 03, 06, "Jamestown", "MA", "USA");
    DateAndPlaceOfBirth DOBT3 = new DateAndPlaceOfBirth(1978, 05, 01, "White Plains", "CA", "USA");
    DateAndPlaceOfBirth DOBT4 = new DateAndPlaceOfBirth(1999, 01, 21, "Tokyo", "Japan");
    DateAndPlaceOfBirth DOBT5 = new DateAndPlaceOfBirth(1988, 03, 06, "London", "UK");

    System.out.println(DOBT1);
    System.out.println(DOBT2);
    System.out.println(DOBT3);
    System.out.println(DOBT4);
    System.out.println(DOBT5);
    //hasSameBirthDayAs
    System.out.println(DOBT1.hasSameBirthDayAs(DOBT2));
    System.out.println(DOBT1.hasSameBirthDayAs(DOBT3));
    System.out.println(DOBT1.hasSameBirthDayAs(DOBT4));
    System.out.println(DOBT1.hasSameBirthDayAs(DOBT5));
    System.out.println(DOBT2.hasSameBirthDayAs(DOBT3));
    System.out.println(DOBT2.hasSameBirthDayAs(DOBT4));
    System.out.println(DOBT2.hasSameBirthDayAs(DOBT5));
    System.out.println(DOBT3.hasSameBirthDayAs(DOBT4));
    System.out.println(DOBT3.hasSameBirthDayAs(DOBT5));
    System.out.println(DOBT4.hasSameBirthDayAs(DOBT5));
    //hasSameBirthDateAs
    System.out.println();
    System.out.println(DOBT1.hasSameBirthDateAs(DOBT2));
    System.out.println(DOBT1.hasSameBirthDateAs(DOBT3));
    System.out.println(DOBT1.hasSameBirthDateAs(DOBT4));
    System.out.println(DOBT1.hasSameBirthDateAs(DOBT5));
    System.out.println(DOBT2.hasSameBirthDateAs(DOBT3));
    System.out.println(DOBT2.hasSameBirthDateAs(DOBT4));
    System.out.println(DOBT2.hasSameBirthDateAs(DOBT5));
    System.out.println(DOBT3.hasSameBirthDateAs(DOBT4));
    System.out.println(DOBT3.hasSameBirthDateAs(DOBT5));
    System.out.println(DOBT4.hasSameBirthDateAs(DOBT5));
    //youngerThan
    System.out.println();
    System.out.println(DOBT1.youngerThan(DOBT2));
    System.out.println(DOBT1.youngerThan(DOBT3));
    System.out.println(DOBT1.youngerThan(DOBT4));
    System.out.println(DOBT1.youngerThan(DOBT5));
    System.out.println(DOBT2.youngerThan(DOBT3));
    System.out.println(DOBT2.youngerThan(DOBT4));
    System.out.println(DOBT2.youngerThan(DOBT5));
    System.out.println(DOBT3.youngerThan(DOBT4));
    System.out.println(DOBT3.youngerThan(DOBT5));
    System.out.println(DOBT4.youngerThan(DOBT5));
    //olderThan
    System.out.println();
    System.out.println(DOBT1.olderThan(DOBT2));
    System.out.println(DOBT1.olderThan(DOBT3));
    System.out.println(DOBT1.olderThan(DOBT4));
    System.out.println(DOBT1.olderThan(DOBT5));
    System.out.println(DOBT2.olderThan(DOBT3));
    System.out.println(DOBT2.olderThan(DOBT4));
    System.out.println(DOBT2.olderThan(DOBT5));
    System.out.println(DOBT3.olderThan(DOBT4));
    System.out.println(DOBT3.olderThan(DOBT5));
    System.out.println(DOBT4.olderThan(DOBT5));

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

      DateAndPlaceOfBirth DOBT12 = new DateAndPlaceOfBirth(1999, 01, 21, "Thornwood", "NY", "USA");
      DateAndPlaceOfBirth DOBT22 = new DateAndPlaceOfBirth(2002, 03, 06, "Jamestown", "MA", "USA");
      DateAndPlaceOfBirth DOBT32 = new DateAndPlaceOfBirth(1978, 05, 01, "White Plains", "CA", "USA");
      DateAndPlaceOfBirth DOBT42 = new DateAndPlaceOfBirth(1999, 01, 21, "Tokyo", "Japan");
      DateAndPlaceOfBirth DOBT52 = new DateAndPlaceOfBirth(1988, 03, 06, "London", "UK");


      output.println(DOBT12);
      output.println(DOBT22);
      output.println(DOBT32);
      output.println(DOBT42);
      output.println(DOBT52);
      //hasSameBirthDayAs
      output.println(DOBT12.hasSameBirthDayAs(DOBT22));
      output.println(DOBT12.hasSameBirthDayAs(DOBT32));
      output.println(DOBT12.hasSameBirthDayAs(DOBT42));
      output.println(DOBT12.hasSameBirthDayAs(DOBT52));
      output.println(DOBT22.hasSameBirthDayAs(DOBT32));
      output.println(DOBT22.hasSameBirthDayAs(DOBT42));
      output.println(DOBT22.hasSameBirthDayAs(DOBT52));
      output.println(DOBT32.hasSameBirthDayAs(DOBT42));
      output.println(DOBT32.hasSameBirthDayAs(DOBT52));
      output.println(DOBT42.hasSameBirthDayAs(DOBT52));
      //hasSameBirthDateAs
      output.println();
      output.println(DOBT12.hasSameBirthDateAs(DOBT22));
      output.println(DOBT12.hasSameBirthDateAs(DOBT32));
      output.println(DOBT12.hasSameBirthDateAs(DOBT42));
      output.println(DOBT12.hasSameBirthDateAs(DOBT52));
      output.println(DOBT22.hasSameBirthDateAs(DOBT32));
      output.println(DOBT22.hasSameBirthDateAs(DOBT42));
      output.println(DOBT22.hasSameBirthDateAs(DOBT52));
      output.println(DOBT32.hasSameBirthDateAs(DOBT42));
      output.println(DOBT32.hasSameBirthDateAs(DOBT52));
      output.println(DOBT42.hasSameBirthDateAs(DOBT52));
      //youngerThan
      output.println();
      output.println(DOBT12.youngerThan(DOBT22));
      output.println(DOBT12.youngerThan(DOBT32));
      output.println(DOBT12.youngerThan(DOBT42));
      output.println(DOBT12.youngerThan(DOBT52));
      output.println(DOBT22.youngerThan(DOBT32));
      output.println(DOBT22.youngerThan(DOBT42));
      output.println(DOBT22.youngerThan(DOBT52));
      output.println(DOBT32.youngerThan(DOBT42));
      output.println(DOBT32.youngerThan(DOBT52));
      output.println(DOBT42.youngerThan(DOBT52));
      //olderThan
      output.println();
      output.println(DOBT12.olderThan(DOBT22));
      output.println(DOBT12.olderThan(DOBT32));
      output.println(DOBT12.olderThan(DOBT42));
      output.println(DOBT12.olderThan(DOBT52));
      output.println(DOBT22.olderThan(DOBT32));
      output.println(DOBT22.olderThan(DOBT42));
      output.println(DOBT22.olderThan(DOBT52));
      output.println(DOBT32.olderThan(DOBT42));
      output.println(DOBT32.olderThan(DOBT52));
      output.println(DOBT42.olderThan(DOBT52));
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
