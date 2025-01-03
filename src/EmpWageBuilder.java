import java.util.ArrayList;

public class EmpWageBuilder {
    private ArrayList<CompanyEmpWage> companyEmpWageList;

    // Constructor to initialize the list
    public EmpWageBuilder() {
        companyEmpWageList = new ArrayList<>();
    }

    // Add a company to the list
    public void addCompany(String company, int wagePerHour, int workingDaysPerMonth, int totalWorkingHours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, wagePerHour, workingDaysPerMonth, totalWorkingHours);
        companyEmpWageList.add(companyEmpWage);
    }

    // Compute wages for all companies
    public void computeWages() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            computeWageForCompany(companyEmpWage);
        }
    }

    // Compute wage for a specific company
    private void computeWageForCompany(CompanyEmpWage companyEmpWage) {
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        while (totalHours < companyEmpWage.getTotalWorkingHours() && totalDays < companyEmpWage.getWorkingDaysPerMonth()) {
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

            totalHours += empHours;
            totalWage += empHours * companyEmpWage.getWagePerHour();
        }

        companyEmpWage.setTotalWage(totalWage);
        System.out.println("Computed Wage for " + companyEmpWage.getCompany() + ": $" + totalWage);
    }

    // Display all company wages
    public void displayAllCompanyWages() {
        System.out.println("\nSummary of Wages:");
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            companyEmpWage.displayDetails();
        }
    }
}
