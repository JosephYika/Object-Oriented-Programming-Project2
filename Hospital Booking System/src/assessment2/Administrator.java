package assessment2;

import java.util.Random;

/**
 * Administrator has a name and can generate patients' IDs
 * 
 * 
 * 
 * @author J?zef
 */
public class Administrator {
	
	//FIELDS
	/**
	 * Instance variable name represents the name of the Administrator
	 * 
	 */
	private String name;
	
	
	
	//CONSTRUCTORS
	/**
	 * Constructor that sets the default name of the administrator
	 */
	public Administrator() {
		
		this("Alice");
	}
	
	/**
	 * @param name represents the name of the administrator 
	 */
	public Administrator(String name) {
		
		this.name = name;
	}
	
	
	// METHODS 
	/**
	 * @param name sets the name of administrator
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return Name of the administrator 
	 */
	public String getName() {
		return name;
	}
	/**
	 * Returns the ID of a patient in a String format 
	 * @return the ID of a patient in a String format 
	 */
	public String patientID_Generator() {
		/*
		 * Random ID generator. A 4 digit number is generated and 'P' letter is added to
		 * the number each time it is generated. P stands for Patient. The same approach
		 * is used for Doctors' ID generator. 
		 * 
		 * In the test PrescriptionTest class This method fetches data into 'setPatientID', which 
		 * sets the id of a patient and at the same time changes the patientID attribute in Patient
		 * class. 
		 * 
		 */
		String numbers = "0123456789";
		String patientID = "";
		Random rand = new Random();
		

		char[] itirateNumbers = new char[4];

		/*
		 * Under each index ( From 0 - 3) we assign a value from the 'patientID' String.
		 * charAt returns the number at the specified Index, nextInt returns the number
		 * between the specified (in the bracket) values. In this case we pass the
		 * length of our 'patientID' variable, which is 10 So in this case our specified
		 * index in the charAt is a random integer from 0-9. A very simple approach, but
		 * it works.
		 * 
		 */
		
		for (int i = 0; i < itirateNumbers.length; i++) {
			itirateNumbers[i] = numbers.charAt(rand.nextInt(numbers.length()));
			patientID = patientID + itirateNumbers[i];
		}
		
		return "P" + patientID;
		
	}
	
	
	

}
