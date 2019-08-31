package assignment01;

public class PersonTester {
  public static void main(String[] args) {
  DateAndPlaceOfBirth city = new DateAndPlaceOfBirth(1999, 01, 21, "Yonkers", "New York", "USA");
  //DateAndPlaceOfBirth idk = city.getPlaceOfBirth(); //Yonkers, blah blah
  StreetUSAddress address = new StreetUSAddress("723 Highland Ave.", "", "Yonkers", "NY", "10596");
  //StreetUSAddress thing = address.getAddressLine1(); //723 Highland Ave.
  Person person1 = new Person("Jake", "Kingson", "090239872", city, address);
  System.out.println(person1);
 }
}

//DateAndPlaceOfBirth city = DateAndPlaceOfBirth(1999, 01, 21, "Yonkers", "New York", "USA");
//StreetUSAddress address = StreetUSAddress("723 Highland Ave.", "", "Yonkers", "NY", "10596");
