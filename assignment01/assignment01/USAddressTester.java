//DONE

package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
public static void main(String[] args) {
  StreetUSAddress test1 = new StreetUSAddress("427 Linington Ave.", "Apt 2C", "Thornwood", "New York", "10456");
  StreetUSAddress test2 = new StreetUSAddress("Zooloo 223 Dr.", "", "Queens", "New York", "11102");
  System.out.println(test1); //With 2nd address included
  System.out.println();
  System.out.println(test2); //Without 2nd address

  try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

      StreetUSAddress test12 = new StreetUSAddress("427 Linington Ave.", "Apt 2C", "Thornwood", "New York", "10456");
      StreetUSAddress test22 = new StreetUSAddress("Zooloo 223 Dr.", "", "Queens", "New York", "11102");
      output.println(test12); //With 2nd address included
      output.println();
      output.println(test22); //Without 2nd address
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
}
}
