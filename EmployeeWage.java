import java.util.Random;
import java.util.*;

public class EmployeeWage implements IComputeEmpWage {

	public static final int isPartTime=1;
	public static final int isFullTime=2;

	private int numOfCompany=0;
	private ArrayList<CompanyEmpWage> companyEmpWageList;

	public EmployeeWage(){
	companyEmpWageList = new ArrayList<>();
	}
	//Storing data
	 public void addCompanyEmpWage(String company, int empRatePerHr, int 
					numWorkingDays, int maxHrInMonth){
 
	CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHr, numWorkingDays, maxHrInMonth);
	companyEmpWageList.add(companyEmpWage);
       }


	public void employeeWageCalculator(){
	for(int i=0; i<companyEmpWageList.size(); i++){
	CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
	    companyEmpWage.setTotalEmpWage(this.employeeWageCalculator(companyEmpWage));
	System.out.println(companyEmpWage);
	}
	}


	public int employeeWageCalculator(CompanyEmpWage companyEmpWage){


	int hour=0;
	int salary=0;
	int counter=0;
	int totalEmpHrs=0;
	int totalWorkingDays=0;

	while( totalEmpHrs < companyEmpWage.maxHrInMonth && totalWorkingDays < companyEmpWage.numWorkingDays){
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

	System.out.println("Day "+counter+"  Emp Hour= "+hour+" salary is: "+(companyEmpWage.empRatePerHr)*hour);
	totalEmpHrs = totalEmpHrs+hour;
	}



	return totalEmpHrs*companyEmpWage.empRatePerHr;
	//return totalSalary;

    }
	

	public static void main(String args[]){

	IComputeEmpWage empWageBuilder = new EmployeeWage();
	empWageBuilder.addCompanyEmpWage("Google",30,20,100);
	empWageBuilder.addCompanyEmpWage("Goldman",25,24,80);
	empWageBuilder.employeeWageCalculator();

	}


}
