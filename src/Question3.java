public class Question3 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("Testing savings");
		System.out.println(savings(20000, 4.5, 15));
		
		System.out.println("----------------------");
		System.out.println("Testing computeTip");
		System.out.println(computeTip(33.57, "Great"));
		
		System.out.println("----------------------");
		System.out.println("Testing return change");
		returnChange(18, 17.18);

	}
	
	public static double savings(double princible, double ratePercentage, double years)
	{
		return princible * (1 + ratePercentage / 100 * years);
	}
	
	public static double computeTip(double bill, String quality)
	{		
		if (quality == "Poor") return bill * 0.16;
		
		if (quality == "Good") return bill * 0.22;
		
		if (quality == "Great") return bill * 0.26;
		
		throw new IllegalArgumentException("Quality must be Poor, Good, or Great");
	}
	
	public static void returnChange(double received, double bill)
	{
		int change = (int)((received - bill) * 100);
		if (change < 0) throw new IllegalArgumentException("Did not recieve enough money");
		
		int quarters = (change / 25);
		change = change % 25;
		
		int dimes = (change / 10);
		change = change % 10;
		
		int nickels = (change / 5);
		change = change % 5;
				
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + change);
	}

}
