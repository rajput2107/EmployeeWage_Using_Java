import java.util.Random;

class EmployeeWage {

	public static final int isPartTime=1;
	public static final int isFullTime=2;

	public static void main(String args[]){


	int empRatePerHr=20;
	int hour=0;
	int numWorkingDays=20;
	int salary=0;
	int totalSalary=0;
	int maxHrInMonth=100;

	int totalEmpHrs=0;
	int totalWorkingDays=0;
	while( totalEmpHrs < maxHrInMonth && totalWorkingDays < numWorkingDays){
	// create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int empCheck = rand.nextInt(3);

	totalWorkingDays+=1;
	switch(empCheck){
	case isPartTime:
		hour=4;
		break;
	case isFullTime:
		hour=8;
		break;
	default:
		hour=0;
	   }

	totalEmpHrs = totalEmpHrs+hour;
	}

	totalSalary = totalEmpHrs*empRatePerHr;
	System.out.println("Salary is: "+totalSalary);

}


}
