import java.util.Scanner;
public class EmployeeWage{

	private static void employeeMonthlyWage(String companyName, int wagePerHour,int fullDayHour,int totalHours,int dayPerMonth) {
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
				case 1:
					dailyHours = fullDayHour;
					break;
				case 2:
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

		System.out.println("Monthly Wage of "+companyName+" is: "+monthlyWage);
	}

	public static void main(String args[]){
		System.out.println("Enter the number of Companies::");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		for (int i=1;i<=number;i++)
		{
		System.out.println("Enter the Company Name:");
		String companyName=scan.next();
		System.out.println("Enter Wage per Hour:");
		int wagePerHour=scan.nextInt();
		System.out.println("Enter Full day Hour:");
		int fullDayHour=scan.nextInt();
		System.out.println("Enter Total Hours:");
		int totalHours=scan.nextInt();
		System.out.println("Enter Day Per Month");
		int dayPerMonth=scan.nextInt();
		EmployeeWage company1 = new EmployeeWage();
		company1.employeeMonthlyWage(companyName, wagePerHour,fullDayHour,totalHours,dayPerMonth);

}

}

}
