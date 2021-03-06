package assessment2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * A Prescription is for an appointment and has a unique id. 
 * It consists of a list of medications, and the doctor that made the prescription.
 * It has a set of methods to add/remove and retrieve a medication so that it can be modified or printed on a receipt, for example. 
 * 
 * @author J?zef
 *
 */
public class Prescription implements Iterable<Prescription>, Comparator<Prescription>{
	
	//FIELDS
	/**
	 * PrescriptionID is an id of a prescription
	 * 
	 */
	private int prescriptionID;

	private List<HashMap<Medication, String>> medications;
	private Appointment appointment;
	private Doctor doctor;
	
	
	//CONSTRUCTORS
	/**
	 * @param prescriptionID is an id of a prescription
	 * @param medications2 represents the list of medications associated with one prescription
	 * @param appointment represents appointment associated with one prescription
	 * @param doctor represents the doctor associated with the prescription
	 */
	public Prescription(int prescriptionID, List<HashMap<Medication, String>> medications2, Appointment appointment, Doctor doctor) {
		
		this.prescriptionID = prescriptionID;
		this.medications = medications2;
		this.appointment = appointment;
		this.doctor = doctor;
	}

	//METHODS
	/**
	 * Iterator
	 */
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the prescription id
	 */
	public int getPrescriptionID() {
		return prescriptionID;
	}

	/**
	 * @param prescriptionID sets the prescription id
	 */
	public void setPrescriptionID(int prescriptionID) {
		this.prescriptionID = prescriptionID;
	}
	


	/**
	 * Compare prescription based on ID
	 */
	@Override
	public int compare(Prescription o1, Prescription o2) {
		
		if(o1.getPrescriptionID() < o2.getPrescriptionID()) {
			
			return -1;
		}
		else if(o1.getPrescriptionID() > o2.getPrescriptionID()){
			return 1;
		}
					
		return 0;
	}

	/**
	 * String representation of fields
	 */
	@Override
	public String toString() {
		return "Prescription [prescriptionID=" + prescriptionID + ", medications=" + medications + ", appointment="
				+ appointment + ", doctor=" + doctor + "]";
	}
	
	
	
	
	
	

}
