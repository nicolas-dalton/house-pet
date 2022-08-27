package asg3;

import java.io.PrintWriter;
import java.util.Scanner;

public class HousePetUtilsImpl 
{
	//receives: inFile - precondition:  inFile is open and ready to read data from
	 //     file format: pet name {newline} year born {newline} gender {newline} pet type {newline}
	 //returns:  a single populated HousePet instance with data from inFile if all data is there, 
	 //      returns null if no data found (end of input) for a house pet or if 
	 //      any mismatch of data or missing expected data occurs
	  public static HousePet readFromScanner(Scanner inFile) 
	  {
		  String name="";
		  int year=0;
		  String gender="";
		  String petT="";
		  if(inFile.hasNext()) 
		  {
			  name= inFile.nextLine();
		  }
//		  else 
//		  {
//			  return null;
//		  }
		  if(inFile.hasNextInt()) {
			  year= inFile.nextInt();
			  inFile.nextLine();
		  }
//		  else {
//			  return null;
//		  }
		  if(inFile.hasNext()) {
			  gender= inFile.nextLine();
		  }
//		  else {
//			  return null;
//		  }
		  if(inFile.hasNext()) {
			  petT=inFile.nextLine();
		  }
		  else {
			  return null;
		  }
		  GenderType genderType= GenderType.valueOf(gender);
		  PetType petType= PetType.valueOf(petT);
		  HousePet pet= new HousePet(name, year, genderType, petType);
		  return pet;
		  
	  }
	  
	 //receives: outFile - precondition : outFile is open and ready to receive output
	 // returns: nothing
	 // task : received housePet is written to outFile in program readable format (so that it could be read back in later)
	  public static void writeToFile(PrintWriter out, HousePet housePet) 
	  {
		  out.println(housePet.getPetName());
		  out.println(housePet.getYearBorn());
		  out.println(housePet.getGender());
		  out.println(housePet.getPetType());
	  }
}
