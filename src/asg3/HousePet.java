package asg3;

public class HousePet {
	public static final String DEFAULT_NAME= "Aa$$$$";
	public static final int DEFAULT_YEARBORN= 2019;		
	private String petName;
	private int yearBorn;
	private PetType petType;
	private GenderType genderType;
	//default constructor, creates a default HousePet instance
	// receives: nothing
	// task : constructs a this HousePet with default values for name and year born and UNKNOWN as gender
	// sets name of this pet to DEFAULT_NAME
	// sets yearborn of this pet to DEFAULT_YEARBORN 
	// example use #1: HousePet pet1 = new HousePet();
	// example use #2: HousePet somePet = new HousePet();
	// example use #3: HousePet funPet = new HousePet();
	public HousePet()
	{
		this.setPetName(HousePet.DEFAULT_NAME);
		this.setYearBorn(HousePet.DEFAULT_YEARBORN);
		this.petType= PetType.UNKNOWN;
		this.genderType= GenderType.UNKNOWN;
	}
	
	//second constructor, creates a HousePet instance
	// receives: aPetName, aYearBorn
	// initializes this pet with received values, if invalid, uses defaults
	// with given data, uses default for any value that is invalid
	// example use #1: HousePet pet1 = new HousePet("Princess Anne", 2015);
	// example use #2: HousePet pet2 = new HousePet("Sport",2018);
	// example use #3: HousePet pet3 = new HousePet("TWEETY TWEET", 2017);
	public HousePet(String aPetName, int aYearBorn, GenderType aGenderType, PetType aPetType) 
	{
		this.setPetName(aPetName);
		this.setYearBorn(aYearBorn);
		this.setGender(aGenderType);
		this.setPetType(aPetType);
	}
	
	// receives: aName, the name to set this pet instance's name to
	// sets this HousePet's name to aName after proper formatting and checking it is valid
	// if not valid, uses DEFAULT_NAME instead, an empty string is not a valid name
	// valid names MUST have at least 2 letters and cannot be all whitespace, nor empty strings

	// use utils.MyUtils.properFormat() method  aName = utils.MyUtils.properFormat(aName); 

	// check all rules for validity

	// example use #1: pet1.setPetName("Minnesota FATS"); // stores as Minnesota Fats
	// example use #2: somePet.setPetName("8&%^$");  //stores name as DEFAULT_NAME
	// example use #3: funPet.setPetName("Jerry GERBIL");  // stores name as Jerry Gerbil
	public void setPetName(String aPetName) 
	{
		String temp="";
		temp= utils.MyUtils.properFormat(aPetName);
		if(temp.equals("")) 
		{
			this.petName = DEFAULT_NAME;
			return;
		}
		int letterCount=utils.MyUtils.countLetter(temp);
		if(letterCount<2) 
		{
			this.petName= DEFAULT_NAME;
		}
		else {
			this.petName=temp;
		}
	}
		
		// sets this pet's year born to be received value if
		// in range 1900 thru DEFAULT_YEARBORN
		// if not in range, uses DEFAULT_YEARBORN
		// fill in remaining appropriate comments 
		// example1: setyearBorn(2010) //this.yearborn will set equal to 2010
		// example2: setyearBorn(1888) //this.yearborn will set equal to the DEFAULT_YEARBORN which is 2019
		//example3: setyearBorn(2020) //this.yearborn will set equal to the DEFAULT_YEARBORN which is 2019
		public void setYearBorn(int aYearBorn) 
		{
			if(aYearBorn>=1900 && aYearBorn<=DEFAULT_YEARBORN) 
			{
				this.yearBorn=aYearBorn;
			}
			else 
			{
				this.yearBorn= DEFAULT_YEARBORN;
			}
		}
		 //sets this HousePet's gender to given gender
		public void setGender(GenderType aGenderType) 
		{
			this.genderType= aGenderType;
		}
		// sets this HousePet's pet type to given pet type.
		public void setPetType(PetType aPetType) 
		{
			this.petType= aPetType;
		}
		// For any HousePet instance, I can get the petName
		// example calls #1: myPet.getPetName(); //returns whatever the pet name assigned to the instance of myPet
		//example call #2: myPet2.getPetName(); //returns whatever the pet name assigned to the instance of myPet2
		//example call #3: myPet3.getPetName; //returns whatever the pet name assigned to the instance of myPet3
		
		public String getPetName()
		{
			return this.petName;
		}
		
		// For any HousePet instance, I can get the yearBorn of that pet
		// example calls #1: myPet.getYearBorn(); //returns whatever the year born assigned to the instance of myPet
		//example call #2: myPet2.getYearBorn(); //returns whatever the year born assigned to the instance of myPet
		//example call #3: myPet3.getYearBorn; //returns whatever the year born assigned to the instance of myPet
		public int getYearBorn() 
		{
			return this.yearBorn;
		}
		
		//This method overrides the default toString method
		//example calls #1: myPet.toString(); //returns "Name: Zoey Age: 10 year(s) old"
		//example calls #2: myPet2.toString(); //returns "Name: Fuzzy Age: 5 year(s) old"
		//example calls #3: myPet3.toString(); //returns "Name: Billy Age: 7 years old"
		public String toString() 
		{
			String temp="";
			temp+="Name: "+ this.getPetName()+ " Age: "+(DEFAULT_YEARBORN -this.getYearBorn()+ "year(s) old"+" Pet Type: "
					+ this.getPetType()+ " Gender: "+ this.getGender());
			return temp;
		}
		// returns the gender  of this HousePet
		public GenderType getGender() 
		{
			return this.genderType;
		}
		// returns the pet type  of this HousePet
		public PetType getPetType() {
			return this.petType;
		}

}
