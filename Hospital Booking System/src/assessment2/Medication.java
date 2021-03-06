package assessment2;

import java.util.Objects;

/**
 * A Medication has unique ID , name and price .
 * One medication can have different price 
 * (e.g. Paracetamol for children is ?3.50, but same paracetamol for adults is ?3.80). 
 * Medication are comparable.They can be sorted into a natural order. 
 * They should firstly be compared by Medication id, if these are the same, then by price.
 * 
 * @author J?zef
 *
 */
public class Medication implements Comparable<Medication>{
	
	//FIELDS
	/**
	 * medicationID is an id of a medication
	 * medicationName is a name of a medication
	 * price is a price of a medication in pounds 
	 */
	private int medicationID;
	private String medicationName;
	private double price;
	
	
	
	//CONSTRUCTORS
	/**
	 * Default constructor with default values
	 */
	public Medication () {
		
		this(1, "Paracetemol", 3.80);
	}
	/**
	 * Custom constructor that accepts 3 arguments
	 * @param medicationID is an ID of a medication
	 * @param medicationName is a name of medication 
	 * @param price is a price of a medication
	 */
	public Medication(int medicationID, String medicationName, double price) {
		
		this.medicationID = medicationID;
		this.medicationName = medicationName;
		this.price = price;
		
	}
	
	
	// METHODS
	/**
	 * @return the value of medicationID
	 */
	public int getMedicationID() {
		return medicationID;
	}
	/**
	 * @param medicationID sets the value for medicationID
	 */
	public void setMedicationID(int medicationID) {
		this.medicationID = medicationID;
	}
	/**
	 * @return the medications' name
	 */
	public String getMedicationName() {
		return medicationName;
	}
	/**
	 * @param medicationName sets the name of the medication 
	 */
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	/**
	 * @return the price of the medication 
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price sets the price of a medication 
	 */ 
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Sorts the medication by mediciationID and price 
	 */
	@Override
	public int compareTo(Medication o) {
	
		if (this.medicationID < o.medicationID) {
			return -1;
		}
		else if (this.medicationID > o.medicationID) {
			return 1;
		}
		else if (this.price < o.price) {
			return -1;
		}
		else if (this.price > o.price) {
			return 1;
		}
		return 0;
	}
	
	
	/**
	 * Checks the equality of two medications based on medicationID and price
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medication other = (Medication) obj;
		return medicationID == other.medicationID
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	/**
	 * String representation for all the fields
	 */
	@Override
	public String toString() {
		return "Medication [medicationID=" + medicationID + ", medicationName=" + medicationName + ", price=" + price
				+ "]";
	}
	
	
}
