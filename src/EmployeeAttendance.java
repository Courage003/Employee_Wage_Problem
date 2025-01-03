public class EmployeeAttendance {

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program!");

        // Create an instance of EmpWageBuilder
        IEmployeeWage empWageBuilder = new EmpWageBuilder();

        // Add multiple companies
        empWageBuilder.addCompany("Company A", 20, 20, 100);
        empWageBuilder.addCompany("Company B", 25, 22, 120);
        empWageBuilder.addCompany("Company C", 15, 18, 80);

        // Compute wages for all companies
        empWageBuilder.computeWages();

        // Display summary of wages
        empWageBuilder.displayAllCompanyWages();
    }
}

