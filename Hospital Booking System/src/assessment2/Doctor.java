package assessment2;

/**
 * An abstract class for Doctor. 
 * A doctor has a doctorID and name. 
 * It also has a method to generate the ID of a doctor.
 * @author J?zef 
 *
 */
public abstract class Doctor implements Comparable<Doctor>{

	
	//FIELDS
	/**
	 * Variable doctorID represents the doctor ID
	 * doctorName represents the name of a doctor
	 * salary represents the salary of a doctor 
	 */
	private String doctorID ;
	private Name doctorName;
	private int salary;
	
	
	
	
	//CONSTRUCTORS
	/**
	 * @param doctorName is the name of a doctor
	 * @param doctorID is the id of a doctor
	 * @param salary represents salary
	 */
	public Doctor(Name doctorName, String doctorID, int salary) {
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.salary = salary;
	}


	//METHODS

	/**
	 * Returns the ID of a doctor
	 * @return ID of a doctor
	 */
	public String getDoctorID() {
		return doctorID;
	}




	/**
	 * Sets the ID of a doctor
	 * @param doctorID sets the doctor id 
	 */
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}




	/**
	 * Returns doctors' name
	 * @return doctors' name
	 */
	public Name getDoctorName() {
		return doctorName;
	}




	/**
	 * 
	 * @param doctorName is a name of a doctor
	 */
	public void setDoctorName(Name doctorName) {
		this.doctorName = doctorName;
	}
	
	
	
	/**
	 * Returns doctors ID in a String format 
	 * @return doctors' ID
	 */
	public abstract String generateDoctorID();
	
	
	/**
	 * Compares doctors based on their salaries 
	 * This will be helpful to list doctors based on their salaries e.g. from lowest to highest
	 */
	@Override
	public int compareTo(Doctor o) {
		/*
		 * Note: This abstract class 'Doctor' doesn't need to implement directly this method, however since
		 * at the same time Doctor is a parent class for JuniorDoctor and ConsultantDoctor which are not abstract
		 * classes , meaning they would have to directly implement compareTo method. Instead of writing compareTo in
		 * both of the classes we can implement it here in the parent class.
		 */
		if (this.salary < o.salary) {
			return -1;
		}
		else if (this.salary > o.salary) {
			return 1;
		}
		return 0;
	}


	/**
	 * String representation for all the fields 
	 */
	@Override
	public String toString() {
		return "Doctor [doctorID=" + doctorID + ", doctorName=" + doctorName + ", salary=" + salary + "]";
	}
	
	
	
}
