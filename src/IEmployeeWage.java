public interface IEmployeeWage {
    void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    void computeWages();
    void displayAllCompanyWages();

}
