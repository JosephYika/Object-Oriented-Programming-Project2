package assessment2;



/**
 * Name class represents the name of the patient. 
 * Patient has a name ( composition association). 
 * Patient can have a first name  and last name. 
 * 
 * 
 * @author J?zef
 */
public class Name implements Comparable<Name>{

	//FIELDS
	
	/**
	 * Instance variable surName represents the surname of a patient or doctor
	 * Instance variable firstName represents the first name of a patient or doctor
	 */
	private String surName;
	private String firstName;
	
	
	// CONSTRUCTORS
	
	
	/**	 
	 * This custom constructor accepts two parameters
	 * 
	 * @param surName   Patients' or doctors'surname 
	 * @param firstName First name of a patient  or doctor
	 */
	public Name (String firstName, String surName) {
		
		
		this.firstName = firstName;
		this.surName = surName;
	}
		
	
	// METHODS	
	/**
	 * Returns the first name of the patient or doctor
	 * @return The first name of the patient or doctor
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * Sets the first name of the patient or doctor
	 * @param firstName represents the first name of the patient or doctor
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Sets the surname of the patient 
	 * @param surName represents the surname of the patient 
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	/**
	 * Returns the surname of the patient 
	 * @return the surname of the patient -
	 */
	public String getSurName() {
	
		return surName;
	}


	/**
	 * Generates a string representation for the attributes firstName and surName
	 */
	@Override
	public String toString() {
		return "[Surname: " + surName + ", First name: " + firstName + "]";
	}


	/**
	 * Overridden compareTo method created to compare patients by their surnames and
	 * firstName. This is needed to list patients alphabetically. 
	 */
	@Override
	public int compareTo(Name o) {
		
		
		
		int check = this.surName.compareTo(o.surName);
		
		/*
		 * If both of the surnames that we are comparing are not the same 
		 * return the other result from it , meaning -1 or 1 
		 * If both of the surnames are exactly the same
		 * return the result 
		 * 
		 * 
		 * 
		 */
		if (check != 0) {
			return check;
		}
		else if (check == 0) {
			return this.firstName.compareTo(o.firstName);
		}
		
		return 0;
	}



	
}
