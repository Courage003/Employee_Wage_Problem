public class EmpWageBuilder {
    //Instance varibales for company-specific data
    private String company;
    private int wagePerHour;
    private int workingDaysPerMonth;
    private int totalWorkingHours;
    private int totalWage;

    public EmpWageBuilder(String company, int wagePerHour, int workingDaysPerMonth, int totalWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.totalWorkingHours = totalWorkingHours;
        this.totalWage = 0;
    }



    // Method to compute the total employee wage for the company
    public void computeEmployeeWage() {
        System.out.println("Welcome to the Wage Computation Program for " + company + ":");

        int totalHours = 0;
        int totalDays = 0;

        // Compute wages while satisfying conditions
        while (totalHours < totalWorkingHours && totalDays < workingDaysPerMonth) {
            totalDays++;
            int empCheck = (int) (Math.random() * 3);

            int empHours = 0;
            switch (empCheck) {
                case 1: // Full-time
                    empHours = 8;
                    break;
                case 2: // Part-time
                    empHours = 4;
                    break;
                default: // Absent
                    empHours = 0;
            }

            // Update total hours and wage
            totalHours += empHours;
            int dailyWage = wagePerHour * empHours;
            totalWage += dailyWage;
        }

        // Output the results
        System.out.println("Total Wage for " + totalDays + " days and " + totalHours + " hours: $" + totalWage);
    }

    // Method to get the total wage
    public int getTotalWage() {
        return totalWage;
    }

    // Method to display company details and total wage
    public void displayDetails() {
        System.out.println("Company: " + company + ", Total Wage: $" + totalWage);
    }
}

