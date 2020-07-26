
import java.util.*;
public class EmployeeWage {

		public static final int IS_ABSENT = 0;
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		
		 static String company;
		 static int WagePerHour;
		 static int MaxHrInMonth;
		 static int NumOfWorkingdays;
	
		EmployeeWage(String company,int WagePerHour,int MaxHrInMonth,int NumOfWorkingdays)
		 {
			  this.company=company;
			  this.WagePerHour=WagePerHour;
			  this.MaxHrInMonth=MaxHrInMonth;
			  this.NumOfWorkingdays=NumOfWorkingdays;
		 }
		  public static int monthlyWage()
		  {
			 int empHrs=0;
			 int empWage=0;
			 int totalWorkingHrs = 0;
			 int totalWorkingDays = 0;
			 int totalWage=0;
		
		//computation
		while(totalWorkingHrs <= MaxHrInMonth && totalWorkingDays <= NumOfWorkingdays)
		{
		
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10)%3;
			switch (empCheck)
			{
				case 0:
					empHrs=0;
					break;
				case 1:
					empHrs=4;
					break;
				case 2:
					empHrs=8;
					break;
			}
			
			totalWorkingHrs+=empHrs;
			empWage=empHrs*WagePerHour;
			totalWage+=empWage;
		}
		return totalWage;
		
          }
		public static void main(String[] args) {
			Map<String, Integer> company=new HashMap<>();
			EmployeeWage company1 = new EmployeeWage("DMart", 20, 100, 25);
			company.put("DMart",company1.monthlyWage());
			EmployeeWage company2 = new EmployeeWage("Reliance", 15, 120, 30);
			company.put("Reliance",company2.monthlyWage());
			System.out.println("DMart : "+company.get("DMart"));
			System.out.println("Reliance : "+company.get("Reliance"));
		}
}
