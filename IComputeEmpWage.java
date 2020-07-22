public interface IComputeEmpWage{
        public void addCompanyEmpWage(String company, int 
empRatePerHr,int numWorkingDays, int maxHrInMonth);
        public void employeeWageCalculator();
	public int getTotalWage(String company);
}

