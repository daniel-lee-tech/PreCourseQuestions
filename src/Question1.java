public class Question1 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("Testing Classroom Ratios: 2 staff, 11 boys, 16 girls");
		getClassRoomRatios(2, 11, 16);
		
		System.out.println("----------------------");
		System.out.println("Testing Stock Purchase & CD Calculator : savings 25000, stock price 989");
		stockCalculator(25000, 989);
		
		System.out.println("----------------------");
		System.out.println("Testing Marathon Race Time: seconds 7724");
		convertMarathonTime(7724);
		// bonus
		averageMarathonPace(7724);

	}
	
	public static void getClassRoomRatios(int staff, int boys, int girls)
	{
		double students = boys + girls;
		double girlPercent = girls / students * 100;
		System.out.println(girlPercent+"% of the class are girls");
		System.out.println("The Student-Teach ratio is " + students / staff);
	}
	
	public static void stockCalculator(double savings, double stockPrice)
	{
		int stockPurchasable = (int)(savings / stockPrice);
		double savingsLeftOver = savings - stockPurchasable * stockPrice;
		System.out.println("Buy " + stockPurchasable + " shares of stock\nInvest $" + savingsLeftOver + " in CD account");
		
	}
	
	public static void convertMarathonTime(int raceTimeInSeconds)
	{
		final int secondsInHour = 3600;
		final int secondsInMin = 60;
		
		int numHours = raceTimeInSeconds / secondsInHour;
		raceTimeInSeconds -= numHours * secondsInHour;
		
		int numMinutes = raceTimeInSeconds / secondsInMin;
		raceTimeInSeconds -= numMinutes * secondsInMin;
		
		System.out.println(numHours+"hrs:"+numMinutes+"mins:"+raceTimeInSeconds+"secs");
	}
	
	// bonus
	public static void averageMarathonPace(int raceTimeInSeconds)
	{
		final double miles = 26.2;
		double raceTimeInMinutes = raceTimeInSeconds / 60.0;
		double minutesPerMile = raceTimeInMinutes / miles;
		System.out.println("Average pace: " + minutesPerMile + " minutes per mile");
	}

}
