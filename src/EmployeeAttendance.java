public class EmployeeAttendance {
    public static void main(String[] args){
        System.out.println("Welcome to WageComputation Program: ");
        int full_time=1;
        int part_time=2;

        int empCheck=(int)(Math.random()*3);
        int wage_per_hour=20;
        int empHours=0;

        if(empCheck==full_time){
            empHours=8;
        }
        else if(empCheck==part_time){
            empHours=4;
        }
        else{
            empHours=0;
        }
        int dailyWage = wage_per_hour*empHours;
        System.out.println("Employee worked for " + empHours + " hours. Daily Wage: $" + dailyWage);
    }
}
