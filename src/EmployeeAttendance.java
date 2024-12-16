public class EmployeeAttendance {
    private static final int wage_per_hour=20;
    private static final int full_time=1;
    private static final int part_time=2;
    private  static final int workingDaysPerMonth = 20;
    private  static final int totalWorkingHrs = 100;
    public static void main(String[] args){
        System.out.println("Welcome to WageComputation Program: ");
        int totalWage=0;
        int totalHours=0;
        int totalDays=0;

        while(totalHours<totalWorkingHrs && totalDays<workingDaysPerMonth){
            totalDays++;
            int empCheck=(int)(Math.random()*3);

            int empHours=0;

            switch (empCheck) {
                case full_time:
                    empHours = 8;
                    break;
                case part_time:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalHours+=empHours;
            int dailyWage = wage_per_hour*empHours;
            totalWage+=dailyWage;

        }


        System.out.println("Total Wage for " + totalDays + " days and " + totalHours + " hours: $" + totalWage);
    }
}
