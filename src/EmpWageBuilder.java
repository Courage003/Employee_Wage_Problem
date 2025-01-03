import java.util.ArrayList;
import java.util.List;

class EmpWageBuilder implements IEmployeeWage{
    private static class Company{
        String name;
        int wagePerHour;
        int maxWorkingDays;
        int maxWorkingHours;
        int totalWage;

        Company(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
            this.name = name;
            this.wagePerHour = wagePerHour;
            this.maxWorkingDays = maxWorkingDays;
            this.maxWorkingHours = maxWorkingHours;
            this.totalWage = 0;
        }
    }

    private final List<Company> companies= new ArrayList<>();

    @Override
    public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours){
        companies.add(new Company(companyName,wagePerHour,maxWorkingDays,maxWorkingHours));
    }

    @Override
    public void computeWages(){
        for(Company company: companies){
            company.totalWage=computeWageForCompany(company);
        }
    }

    private int computeWageForCompany(Company company){
        int totalHours=0, totalDays=0;
        while(totalHours<=company.maxWorkingHours && totalDays< company.maxWorkingDays){
            int hoursWorked= (int)(Math.random()*10)%9; //Random hours (0-8)
            totalHours+=hoursWorked;
            totalDays++;
        }
        return totalHours*company.wagePerHour;
    }

    @Override
    public void displayAllCompanyWages(){
        for(Company company: companies){
            System.out.println("Total Wage for " + company.name + ": " + company.totalWage);
        }
    }
}

