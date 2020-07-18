import java.util.Random;

class EmployeeWage {

	public static void main(String args[]){

	int isPresent=1;
	// create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 1
        int randomCheck = rand.nextInt(2);


	if(randomCheck == isPresent){
        System.out.println("Employee is Present");
	     }

	else{
        System.out.println("Employee is absent");
	    }


	}


}
