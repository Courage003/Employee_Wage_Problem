public class EmployeeAttendance {
    private static final int wage_per_hour=20;
    private static final int full_time=1;
    private static final int part_time=2;
    public static void main(String[] args){
        System.out.println("Welcome to WageComputation Program: ");


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
        int dailyWage = wage_per_hour*empHours;
        System.out.println("Employee worked for " + empHours + " hours. Daily Wage: $" + dailyWage);
    }
}
