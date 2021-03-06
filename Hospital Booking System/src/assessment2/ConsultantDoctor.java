package assessment2;

import java.util.Random;

/**
 * 
 * ConsultantDoctor can be a team leader or not
 * Consultant Doctor has some kind of specialisation 
 * Consultant Doctor has an ID that start with C followed by a 4 digit number
 * @author J?zef
 *
 */
public class ConsultantDoctor extends Doctor{

	
	
	//FIELDS
	/**
	 * Instance variable teamLeader checks if the given doctor is a team leader
	 * Instance variable specialisation represents doctors' specialisation 
	 */
	private boolean teamLeader;
	private String specialisation;
	
	
	
	
	
	//CONSTRUCTOR
	/**
	 * @param doctorName is the name of a doctor
	 * @param doctorID is a doctors' id
	 * @param teamLeader checks if a doctor is a team leader
	 * @param specialisation is a doctors' specialisation
	 * @param salary represents the salary 
	 */
	public ConsultantDoctor(Name doctorName, String doctorID, boolean teamLeader, String specialisation, int salary) {
		super(doctorName, doctorID, salary);
		this.teamLeader = teamLeader;
		this.specialisation = specialisation;
			
	}
	
	

	// METHODS
	/**
	 * Returns true or false based on the input
	 * @return the true or false 
	 */
	public boolean isTeamLeader() {
		return teamLeader;
	}


	/**
	 * @param teamLeader sets a doctor to be a team leader
	 */
	public void setTeamLeader(boolean teamLeader) {
		this.teamLeader = teamLeader;
	}


	/**
	 * @return the specialisation of a doctor
	 */
	public String getSpecialisation() {
		return specialisation;
	}


	/**
	 * @param specialisation sets the specialisation of a doctor
	 */
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	
	

	/**
	 * Generates doctors' ID . 
	 * An ID starts with C and is followed by a 4 digit number 
	 * 
	 */
	@Override
	public String generateDoctorID() {
		String numbers = "0123456789";
		String doctorID = "";
		Random rand = new Random();
		

		char[] itirateNumbers = new char[4];

		/*
		 * Note: See comments for patientID_Generator in the Administrator class. 
		 */
		
		for (int i = 0; i < itirateNumbers.length; i++) {
			itirateNumbers[i] = numbers.charAt(rand.nextInt(numbers.length()));
			doctorID = doctorID + itirateNumbers[i];
		}
		
		return "C" + doctorID;
		
	}
	
}
