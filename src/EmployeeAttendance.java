public class EmployeeAttendance {
    // Class constants
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 2;
    private static final int WORKING_DAYS_PER_MONTH = 20;
    private static final int TOTAL_WORKING_HOURS = 100;

    // Class method to compute employee wage
    public static void computeEmployeeWage() {
        System.out.println("Welcome to the Wage Computation Program:");

        // Local variables
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        // Compute wages while satisfying conditions
        while (totalHours < TOTAL_WORKING_HOURS && totalDays < WORKING_DAYS_PER_MONTH) {
            totalDays++;
            int empCheck = (int) (Math.random() * 3);

            int empHours = 0;
            switch (empCheck) {
                case FULL_TIME:
                    empHours = 8;
                    break;
                case PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }

            // Update total hours and wage
            totalHours += empHours;
            int dailyWage = WAGE_PER_HOUR * empHours;
            totalWage += dailyWage;
        }

        // Output the results
        System.out.println("Total Wage for " + totalDays + " days and " + totalHours + " hours: $" + totalWage);
    }

    // Main method
    public static void main(String[] args) {
        // Call the method to compute wages
        computeEmployeeWage();
    }
}
