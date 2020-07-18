import java.util.Random;

class EmployeeWage {

	public static void main(String args[]){

	int isPartTime=1;
	int isFullTime=2;
	int empRatePerHr=20;
	int hour=0;
	int numWorkingDays=20;
	int salary=0;
	int totalSalary=0;

	for(int day=1; day<=numWorkingDays; day++){
	// create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int empCheck = rand.nextInt(3);

	switch(empCheck){
	case 1:
		hour=4;
		break;
	case 2:
		hour=8;
		break;
	default:
		hour=0;
	   }

	salary = (hour*empRatePerHr);
	totalSalary = (totalSalary + salary);
	}

	System.out.println("Salary is: "+totalSalary);

}


}
