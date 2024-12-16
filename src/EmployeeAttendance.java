public class EmployeeAttendance {
    public static void main(String[] args){
        System.out.println("Welcome to WageComputation Program: ");
        int present=1;

        int empCheck=(int)(Math.random()*2);
        int wage_per_hour=20;
        int full_day_hour=8;
        if(empCheck==present){
            int dailyWage = wage_per_hour*full_day_hour;
            System.out.println("Employee is Present. Daily Wage: $" + dailyWage);
        }
        else{
            System.out.println("Employee is absent");
        }

    }
}
