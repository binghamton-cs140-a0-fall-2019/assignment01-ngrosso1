//DONE

package assignment01;
import java.time.LocalDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
  public static void main(String[] args) {
    DateAndPlaceOfBirth citee = new DateAndPlaceOfBirth(1999, 01, 21, "Tampa", "FL", "USA");
    StreetUSAddress address1 = new StreetUSAddress("783 Highland Ave.", "", "Tampa", "FL", "10576");
    Person John = new Person("Brian", "Owls", "0097547862", citee, address1);
    ComputerOwner x = new ComputerOwner(John);
    Computer comp1 = new Computer("Samsung", "Intel i5", 8, 1500, true, 1200.00);
    Computer comp2 = new Computer("Apple", "Intel i5", 12, 4000, true, 2200.00);
    Computer comp3 = new Computer("Lenovo", "Intel i5", 8, 1500, true, 1250.00);
    Computer comp4 = new Computer("IBM", "AMD Ryzen 3", 16, 1500, false, 1300.00);
    x.addComputer(comp1);
    x.addComputer(comp2);
    x.addComputer(comp3);
    x.addComputer(comp4);
    System.out.println("Added 4 computers to Computer Owner: ");
    System.out.println(x);
    x.removeComputer(0);
    x.removeComputer(1);
    System.out.println("Removed 2 computers: ");
    System.out.println(x);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");

      DateAndPlaceOfBirth citee2 = new DateAndPlaceOfBirth(1999, 01, 21, "Tampa", "FL", "USA");
      StreetUSAddress address12 = new StreetUSAddress("783 Highland Ave.", "", "Tampa", "FL", "10576");
      Person John2 = new Person("Brian", "Owls", "0097547862", citee2, address12);
      ComputerOwner x2 = new ComputerOwner(John2);
      Computer comp12 = new Computer("Samsung", "Intel i5", 8, 1500, true, 1200.00);
      Computer comp22 = new Computer("Apple", "Intel i5", 12, 4000, true, 2200.00);
      Computer comp32 = new Computer("Lenovo", "Intel i5", 8, 1500, true, 1250.00);
      Computer comp42 = new Computer("IBM", "AMD Ryzen 3", 16, 1500, false, 1300.00);
      x2.addComputer(comp12);
      x2.addComputer(comp22);
      x2.addComputer(comp32);
      x2.addComputer(comp42);
      output.println("Added 4 computers to Computer Owner: ");
      output.println(x2);
      x2.removeComputer(0);
      x2.removeComputer(1);
      output.println("Removed 2 computers: ");
      output.println(x2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  }
}
