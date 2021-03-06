package assessment2; // We are working in the package 'assessmnet2' under HospitalBookingSystem folder

import java.util.Objects;


/**
 * When making an appointment to visit the hospital, 
 * a Patient with Name and patientID makes an Appointment with a Doctor.
 * A patient has an age and a description (toString method). 
 * A patient can also gain rewards (points) if he/she is a child (less than 18 ) and 
 * an adult older than 65. 
 * 
 * @author J?zef 
 */


public class Patient implements Comparable<Patient>{
	
	
	//FIELDS 
	/**
	 * Instance variable patientID represents the ID of a patient 
	 * Instance variable patientName represents the name of a patient
	 * Instance variable age represents the age of a patient
	 */
	private String patientID; 
	private Name patientName;
	private int age;
	private int rewardPoints;
	
	
	
	
	
	//CONSTRUCTORS
	
	/**
	 * @param patientName represent the name ( first Name and Last name ) of a patient
	 * @param age represents the age of a patient
	 */
	public Patient (Name patientName, int age) {
		
		
		this.patientName = patientName;
		this.age = age;
	}



	//METHODS

	/**
	 * Returns the ID of a patient 
	 * @return the ID of a patient 
	 */
	public String getPatientID() {
		return patientID;
	}





	/**
	 * Sets the ID of a patient 
	 * @param patientID represents the patients' ID
	 */
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}





	/**
	 * Returns the name of a patient
	 * @return the name of a patient 
	 */
	public Name getPatientName() {
		return patientName;
	}





	/**
	 * Sets the name of a patient 
	 * @param patientName represents the patients' name 
	 */
	public void setPatientName(Name patientName) {
		this.patientName = patientName;
	}





	/**
	 * Returns the age of a patient 
	 * @return the age of a patient 
	 */
	public int getAge() {
		return age;
	}





	/**
	 * Sets the age of a patient 
	 * @param age represents the age of a patient
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	


    
	/**
	 * String representation for Name and Age attributes.
	 * 
	 * 
	 */
	@Override
	public String toString() {
		return "Patient [Patient Full Name: " + patientName + ", Patient Age: " + age  + "]";
	}



	/**
	 * Compares Patients by age. This is needed in order to sort the list of patients 
	 * by age from youngest to oldest. 
	 */
	@Override
	public int compareTo(Patient o) {
		if(this.age < o.age) {
			return -1;
		}
		else if (this.age > o.age) {
			return 1;
		}
		return 0;
	}
	

	/**
	 * Overridden equals compares two different patients
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patientID, other.patientID);
	}



	/**
	 * @return reward points 
	 */
	public int getRewardsPoints() {
		
		return rewardPoints;
	}

	/**
	 * @param add  adds rewards points
	 */
	public void addRewardsPoints(int add) {
		
	}
	
}
