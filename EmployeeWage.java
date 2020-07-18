import java.util.Random;

class EmployeeWage {

	public static void main(String args[]){

	int isPresent=1;
	int salary=0;

	// create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int randomCheck = rand.nextInt(3);


	if(randomCheck == isPresent){
		int empRatePerHour=20;
		int hour=8;
		salary=hour*empRatePerHour;
	     }

	else{
		salary=0;
	   }
	System.out.println(salary);

	}


}
