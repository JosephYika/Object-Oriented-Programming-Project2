package assessment2;

/**
 * A Discounted Medication is a Medication with a discount rate applied. The discount rate 
 * is between 0 and 1.0, with 0.1 being a 10% discount, 0.2 being a 20% discount
 * 
 * @author J?zef
 *
 */
public class DiscountedMedication extends Medication{
	
	//FIELDS
	
	/**
	 * Variable discountedPrice is a discounted price of a original price 
	 */
	private double discountedPrice;
	


	// CONSTRUCTORS 
	/**
	 * @param medicationID is an ID of a medication 
	 * @param medicationName is name of a medication
	 * @param price is a price of a medication
	 * @param discountedPrice is a discounted price 
	 */
	public DiscountedMedication(int medicationID, String medicationName, double price,double discountedPrice) {
		super( medicationID, medicationName,price);
		this.discountedPrice = discountedPrice;
	}
	
	
	//METHODS
	/**
	 * @return the discounted price
	 */
	public double getDiscountedPrice() {
		return discountedPrice;
	}


	/**
	 * @param discountedPrice sets the discounted price 
	 */
	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}


	/**
	 * String representation of fields
	 */
	@Override
	public String toString() {
		return "DiscountedMedication [discountedPrice=" + discountedPrice + "]";
	}
	

}
