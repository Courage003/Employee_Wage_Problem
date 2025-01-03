public class CompanyEmpWage {
    private String company;
    private int wagePerHour;
    private int workingDaysPerMonth;
    private int totalWorkingHours;
    private int totalWage;

    // Constructor to initialize company details
    public CompanyEmpWage(String company, int wagePerHour, int workingDaysPerMonth, int totalWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.totalWorkingHours = totalWorkingHours;
        this.totalWage = 0;
    }

    // Getter and Setter for totalWage
    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() {
        return totalWage;
    }

    // Display details of the company and its wage
    public void displayDetails() {
        System.out.println("Company: " + company + ", Total Wage: $" + totalWage);
    }

    // Getters for other fields (if needed)
    public String getCompany() {
        return company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

}
