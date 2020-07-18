import java.util.Random;

class EmployeeWage {

	public static void main(String args[]){

	int isPartTime=1;
	int isFullTime=2;
	int empRatePerHr=20;
	int hour=0;

	// create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 2
        int randomCheck = rand.nextInt(3);


	if(randomCheck == isPartTime){
		hour=4;
	     }
	else if(randomCheck == isFullTime){
		hour=8;
	}
	else{
		hour=0;
	   }
	System.out.println(empRatePerHr*hour);

	}


}
