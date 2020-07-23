public class EmployeeWage
{
	private static final int FULLTIME = 1;
	private static final int PARTTIME = 2;

	private static int employeeMonthlyWage( int wagePerHour, int fullDayHour, int dayPerMonth, int totalHours ) {
		//variable
		int dailyWage;
		int dailyHours;
		int monthlyWage = 0;
		int hours = 0;
		int day = 0;

		while ( hours <= totalHours && day <= dayPerMonth )
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case FULLTIME:
					dailyHours = fullDayHour;
					break;
				case PARTTIME:
					dailyHours = fullDayHour / 2;
					break;
				default:
					dailyHours = 0;
					break;
			}
			hours = hours + dailyHours;
			day++;
			dailyWage = wagePerHour * dailyHours;
			monthlyWage = monthlyWage + dailyWage;
      }

			return monthlyWage;
	}

	public static void main(String args[]){
		System.out.println("Employee monthly wage is "+employeeMonthlyWage(20, 8, 20, 100));
}

}
