
public class Subscriber {
	
	public int accNumber = 0;
	public int phoneNumber = 0;
	public String subscriberName = "";
	public static double minServiceFee = 0.00;
	public static double freeMinApp = 0.00;
	public static double excessPerMinRate = 0.00;
	public double accBalance = 0.00;
	
	
	public Subscriber() {
		
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getSubscriberName() {
		return subscriberName;
	}
	
	public double getMinServiceFee() {
		return minServiceFee;
	}
	
	public double getExcessPerMinRate() {
		return excessPerMinRate;
	}
	
	public double getAccountBalance(){
		return accBalance;
	}
	
	public void setAccNumber(int accountNumber) {
		accountNumber = accNumber;
	}
	
	public void setPhoneNumber(int cellPhoneNumber) {
		cellPhoneNumber = phoneNumber;
	}
	
	public void setSubscriberName(String subName) {
		subName = subscriberName;
	}
	
	public void setMinServiceFee(double minService) {
		minService = minServiceFee;
	}
	
	public void setExcessPerMinRate(double excessRate) {
		excessRate = excessPerMinRate;
	}
	
	public void setAccountBalance(double accountBalance){
		accountBalance = accBalance;
	}
	
	public String toString() {
		return "Account Number: \n" + accNumber +
				"Phone Number: \n" + phoneNumber +
				"SubscriberName: \n" + subscriberName;
		
		//to do account balance
	}
	
	
	
	
}
