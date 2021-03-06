package assessment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * A set of Tests and Use Cases that represents the Hospital Booking System. 
 * 
 * IMPORTANT: This class is divided into two part: Use cases 2,3,4 and Use case 1.
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * @author J?zef
 *
 */
public class PrescriptionTests {

	
	/**
	 * Sets the main method
	 * @param args is  a variable of data type String Array
	 */
	public static void main(String[] args) {
		
		System.out.println("USE CASES 2, 3, 4");		
		
		/*
		 * An ArrayList that accepts a data type of class Name.
		 * Class Name is in a composition association with Patient.
		 * Patient has a Name and therefore can fetch data from the Name.
		 * Hence whenever we create a Patient object we can use the data given (below
		 * in the arrayList) data from the Name class. 
		 * 
		 */
		LinkedList<Name> namesList = new LinkedList<Name>();
		namesList.add(new Name("J?zef", "Yika" ));
		namesList.add(new Name("Alicia", "Yika"));
		namesList.add(new Name("Aleksander","Yika" ));
		namesList.add(new Name("Samuel","Hodgson"));
		namesList.add(new Name("Julius", "Korbella"));
		
		Administrator admin1 = new Administrator();
		
		ArrayList<Patient> patient = new ArrayList<Patient>();
		patient.add(new Patient(namesList.get(0),15)) ;
		patient.add(new Patient(namesList.get(1),80));
		patient.add(new Patient(namesList.get(2),20));
		patient.add(new Patient(namesList.get(3),67));
		patient.add(new Patient(namesList.get(3),70));
		
		System.out.println("This is the first patient with the following details:");
		System.out.println(patient.get(0).toString() + "\n");
		System.out.println("The Administrator has assigned " + namesList.get(0).getFirstName() + " the following ID:");
		patient.get(0).setPatientID(admin1.patientID_Generator());  // fetch data from patientID_Generator into a set method
		System.out.println(patient.get(0).getPatientID());
		
		System.out.println("\n" + "This is the second patient with the following details:");
		System.out.println(patient.get(1).toString() + "\n");
		System.out.println("The Administrator has assigned " + namesList.get(1).getFirstName() + " the following ID:" );
		patient.get(1).setPatientID(admin1.patientID_Generator());  
		System.out.println(patient.get(1).getPatientID() + "\n");
		
		System.out.println("The list of patients admitted to the hospital sorted by age from youngest to oldest:");
		Collections.sort(patient); // sort the 'patient' list 
		
		for (Patient element : patient) {
		    System.out.println(element);
		}
		System.out.println("");
		
		System.out.println("The list of patients admitted to the hospital sorted by their names alphabetically:");
		Collections.sort(namesList); // sort the 'namesList' list 
		for (Name element : namesList) {
		    System.out.println(element);
		}
		
		System.out.println("\n" + "Can two patients have the same ID?");
		Patient patient1 = new Patient(namesList.get(0),15);
		Patient patient2 = new Patient(namesList.get(1),80);
		
		patient1.setPatientID(admin1.patientID_Generator());
		patient2.setPatientID(admin1.patientID_Generator());
		
		boolean value = patient1.getPatientID().equals(patient2.getPatientID());
		
		while (value == false) {
			
			if (value == false) {
				
				System.out.println("Two patients will never have the same ID! For example:");
				System.out.println(namesList.get(0).getFirstName() + " have been assigned this ID: " + patient1.getPatientID());
				System.out.println(namesList.get(1).getFirstName() + " have been assigned this ID: " + patient2.getPatientID());
				
				
				break;

			} else {
				/*
				 * whenever the setPatientID method is used the patientID_Generator is also used
				 * because it fetches data into setPatientID, this means that we can use only one
				 * patient to determine the next ID if IDs were the same
				 */
				patient1.setPatientID(admin1.patientID_Generator()); 
			}
		}
		
		
		
		// setting the names of doctors 
		LinkedList<Name> names = new LinkedList<Name>();
		names.add(new Name("Joseph", "Lucian"));
		names.add(new Name("Adam", "Krowley"));
		names.add(new Name("John", "Lorenz"));
		names.add(new Name("Hazel", "Owosu"));
		names.add(new Name("Maurice", "Pavorlo"));
		
		// creating doctors 
		JuniorDoctor doc1 = new JuniorDoctor(names.get(0), "Unknown ID", 5000);
		JuniorDoctor doc2 = new JuniorDoctor(names.get(1), "Unknown ID", 4000);
		Doctor doc3 = new ConsultantDoctor(names.get(2), "Unknown ID",true,"Acute internal medicine", 6000);
		JuniorDoctor doc4 = new JuniorDoctor(names.get(3), "Unknown ID", 2500);
		Doctor doc5 = new ConsultantDoctor(names.get(4), "Unknown ID",false, "Allergy", 4500);
		
		// adding doctors to the list
		ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
		doctorList.add(doc1);
		doctorList.add(doc2);
		doctorList.add(doc3);
		doctorList.add(doc4);
		doctorList.add(doc5);
		
		//setting doctors' ID
		doc1.setDoctorID(doc1.generateDoctorID());
		doc2.setDoctorID(doc2.generateDoctorID());
		doc3.setDoctorID(doc3.generateDoctorID());
		doc4.setDoctorID(doc4.generateDoctorID());
		doc5.setDoctorID(doc5.generateDoctorID());
		
		//sorting the doctors' list 
		Collections.sort(doctorList);
		
		System.out.println("\n" + "List of doctors working at the hospital sorted by salary (lowest - highet ) and their associated ID:");
		for(Doctor element : doctorList) {
			System.out.println(element);
		}
		
		// medications
		Medication med1 = new Medication(1,"Paracetemol (for adults)",2.0);
		Medication med2 = new DiscountedMedication(2,"Paracetemol(for children)",2.0,1.0);
		Medication med3 = new Medication(3,"Migraitan (for adulst)",5.0);
		Medication med4 = new DiscountedMedication(4,"Migraitan (for children)",5.0,2.5);
		Medication med5 = new Medication(5,"Tamiflu - no discount",4.5);
		
		/*
		 * List of Medications.
		 * A medication usually needs  a description and HashMap helps us to achieve this. 
		 */
		
		HashMap<Medication, String> meds = new HashMap<>();
		meds.put(med1, " Medication used to treat fever");
		meds.put(med3, " Medication used to treat migraine");
		meds.put(med5, " Medication used to treat flu");
		
				
	
		List<HashMap<Medication, String>> medications = new LinkedList<>();
		medications.add(meds);
		
		System.out.println("\n" + "A list of Medications available at the hospital and their descriptions:");
		
		for(Map.Entry<Medication, String> word : meds.entrySet()) {
			System.out.println(word.getKey() + " : " + word.getValue()); 
			
		}
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("USE CASE 1");
		
		Date date1 = new Date (01,02,2022);
		Date date2 = new Date (01,03,2022);
		
		Appointment app1 = new Appointment(1, patient2, date1, false);
		Appointment app2 = new Appointment(1, patient2, date2, true);
		
		JuniorDoctor doctor1 = new JuniorDoctor(names.get(0), "Unknown ID", 5000);
		JuniorDoctor doctor2 = new JuniorDoctor(names.get(1), "Unknown ID", 4000);
		
		Prescription pres1 = new Prescription(1, medications, app1, doctor1);
		Prescription pres2 = new Prescription(2, medications, app2, doctor2);
		
		System.out.println(pres1);
		System.out.println(pres2);
		
		
		
		
		
		
	}

}
