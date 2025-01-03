public class EmployeeAttendance {
    // Class method to compute employee wage for a specific company
    public static void computeEmployeeWage(String company, int wagePerHour, int workingDaysPerMonth, int totalWorkingHours) {
        System.out.println("Welcome to the Wage Computation Program for " + company + ":");

        // Local variables
        int totalWage = 0;
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

    // Main method
    public static void main(String[] args) {
        // Call the method for different companies
        computeEmployeeWage("Company A", 20, 20, 100);
        computeEmployeeWage("Company B", 25, 22, 120);
        computeEmployeeWage("Company C", 15, 18, 80);
    }
}

