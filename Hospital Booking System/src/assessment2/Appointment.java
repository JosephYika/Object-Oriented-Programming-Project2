package assessment2;

import java.util.Objects;

/**
 * 
 * An appointment is made by a patient 
 * 
 * @author J?zef
 * 
 *
 */
public class Appointment {
	
	// FIELDS
	/**
	 *  Variable appointmentID is an id for an appointment
	 *  variable patient represents a patient 
	 *  Variable date represents a date
	 *  Variable completed checks if the appointment is completed or not 
	 */
	private int appointmentID;
	private Patient patient;
	private Date date;
	private boolean completed;
	
	
	
	
	//CONSTRUCTORS
	/**
	 * @param appointmentID is appointmentID is an id for an appointment
	 * @param patient is patient represents a patient 
	 * @param date represents a date
	 * @param completed checks if the appointment is completed or not 
	 */
	public Appointment (int appointmentID, Patient patient, Date date, boolean completed) {
		this.appointmentID = appointmentID;
		this.patient = patient;
		this.date = date;
		this.completed = completed; 
		
	}

	//METHODS 

	/**
	 * @return the appointmentID
	 */
	public int getAppointmentID() {
		return appointmentID;
	}

	/**
	 * @param appointmentID sets the appointmentID
	 */
	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	/**
	 * @return the patient 
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient sets the patient 
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the date 
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date sets the date 
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return true or false 
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * @param completed sets true or false 
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	/**
	 * checks for equality based on data and patient
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(patient, other.patient);
	}

	/**
	 * String representation for the fields 
	 */
	@Override
	public String toString() {
		return "Appointment [appointmentID=" + appointmentID + ", patient=" + patient + ", date=" + date
				+ ", completed=" + completed + "]";
	}

	
	
	
	
	
	

}
