public class EmployeeAttendance {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Attendance Program: ");
        int present=1;

        int empCheck=(int)(Math.random()*2);
        if(empCheck==present){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }

    }
}
