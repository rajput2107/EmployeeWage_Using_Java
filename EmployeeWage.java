import java.util.Random;

class EmployeeWage {

	public static final int isPartTime=1;
	public static final int isFullTime=2;

	private final String company;
	private final int empRatePerHr;
	private final int numWorkingDays;
	private final int maxHrInMonth;


	public EmployeeWage(String company, int empRatePerHr, int 
					numWorkingDays, int maxHrInMonth){

		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numWorkingDays = numWorkingDays;
		this.maxHrInMonth = maxHrInMonth;
	}



	private int employeeWageCalculator(){


	int hour=0;
	int salary=0;
	int totalSalary=0;
	int counter=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;

	while( totalEmpHrs < maxHrInMonth && totalWorkingDays < numWorkingDays){
	// create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int empCheck = rand.nextInt(3);

	counter+=1;
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

	System.out.println("Day "+counter+"  Emp Hour= "+hour+" salary is: "+empRatePerHr*hour);
	totalEmpHrs = totalEmpHrs+hour;
	}



	totalSalary = totalEmpHrs*empRatePerHr;
	return totalSalary;

    }




	public static void main(String args[]){

	EmployeeWage google = new EmployeeWage("Google",30,20,100);
	EmployeeWage goldman = new EmployeeWage("Goldman",25,24,90);
	System.out.println("Total Emp wage for company "+ google.company +" is: "+google.employeeWageCalculator()+"\n");
	System.out.println("Total Emp wage for company "+ goldman.company +" is: "+goldman.employeeWageCalculator()+"\n");

	}


}
