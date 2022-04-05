package assessment2;

import java.util.Random;

/**
 * JuniorDoctor class is a child of Doctor 
 * It has to implement all of the methods from Doctor and Comparable interface, because 
 * Doctor implements this interface. 
 * It also has to implement the constructor.
 * Junior Doctor is assigned to a single team and has an ID that starts with J followed by 4 digits
 * @author Józef
 *
 */
public class JuniorDoctor extends Doctor{

	
	//FIELDS
	
	/**
	 * Instance variable teamAssigned represents the junior doctors' team
	 */
	private String teamAssigned;
	
	
	

	//CONSTRUCTORS
	/**
	 * @param doctorName represents the name of a doctor
	 * @param doctorID represents doctors' ID
	 * @param salary represents doctors' salary
	 */
	public JuniorDoctor(Name doctorName, String doctorID, int salary) {
		super(doctorName, doctorID,salary);
		
		
	}
	
	//METHODS
	/**
	 * 
	 * @return assigned team
	 */
	public String getTeamAssigned() {
		return teamAssigned;
	}

	/**
	 * @param teamAssigned sets the assigned teams
	 */
	public void setTeamAssigned(String teamAssigned) {
		this.teamAssigned = teamAssigned;
	}

	/**
	 * Generates Doctors' ID 
	 * ID start with J ( Junior ) followed by 4 digit number
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
		
		return "J" + doctorID;
	}

	
	
	//METHODS
	
}
