package assessment2;

/**
 * Date is associated with a prescription 
 * @author Józef
 *
 */
public class Date {
	
	//FIELDS
	/**
	 * Day  is a day of when prescription was prescribed 
	 * Month   is a day of when prescription was prescribed  
	 * Year  is a year of when prescription was prescribed 
	 */
	private int day;
	private int month;
	private int year;
	
	
	//CONSTRUCTORS
	/**
	 * @param day  is a day of when prescription was prescribed 
	 * @param month  is a month of when prescription was prescribed 
	 * @param year  is a year of when prescription was prescribed 
	 */
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}


	//METHODS
	/**
	 * @return the day 
	 */
	public int getDay() {
		return day;
	}


	/**
	 * @param day sets day
	 */
	public void setDay(int day) {
		this.day = day;
	}


	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}


	/**
	 * @param month sets a month
	 */
	public void setMonth(int month) {
		this.month = month;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year sets the year
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**
	 * String representation for fields
	 */
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	

	

}
