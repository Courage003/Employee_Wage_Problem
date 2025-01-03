public class EmployeeAttendance {

    // Main method
    public static void main(String[] args) {
        // Create instances of EmpWageBuilder for each company
        EmpWageBuilder companyA = new EmpWageBuilder("Company A", 20, 20, 100);
        EmpWageBuilder companyB = new EmpWageBuilder("Company B", 25, 22, 120);
        EmpWageBuilder companyC = new EmpWageBuilder("Company C", 15, 18, 80);

        // Compute and display employee wages for each company
        companyA.computeEmployeeWage();
        companyB.computeEmployeeWage();
        companyC.computeEmployeeWage();

        System.out.println("\nSummary of Wages:");
        companyA.displayDetails();
        companyB.displayDetails();
        companyC.displayDetails();
    }
}

