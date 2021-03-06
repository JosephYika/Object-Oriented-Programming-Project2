package assessment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Appointments - a list of appointments
 * 
 * @author J?zef
 *
 */
public class Appointments implements Iterable<Appointments>, Comparator<Appointments>{
	
	//FIELDS
	/**
	 * Variable appointments represents the list of appointments
	 */
	private List<Appointment> appointments;
	
	
	//CONSTRUCTORS
	public Appointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	
	
	//METHODS
	public Appointment getAppointmentByID (int appointment, Patient patient, Date date, boolean check) {
		Appointment app1 = new Appointment(appointment,patient , date, false);
		return app1;
		
		
	}
	public List<Appointment> getAppointmentByPatientID (String app){
		List<Appointment> add = new ArrayList();
		return add;
		
	}
	
	public List<Appointment> getCompletedAppointment (){
		List<Appointment> add = new ArrayList();
		return add;
		
	}
	public List<Appointment> getPendingAppointment (){
		List<Appointment> add = new ArrayList();
		return add;
		
	}
	
	public List<Appointment> sortAppointments (){
		List<Appointment> add = new ArrayList();
		return add;
		
	}
	public List<Appointment> sortAppointments (Comparator<Appointment> comp){
		List<Appointment> add = new ArrayList();
		return add;
		
	}







	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int compare(Appointments o1, Appointments o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
