package dip.lab1.student.solution1;

/**
 * HourlyEmployee holds the data for an employee who is paid by the hour:
 * (1) his/her hourly pay rate, and (2) the total hours worked in a year.
 * From these two fields, the HourlyEmployee's annual wages are calculated by
 * getAnnualWages() (implemented from Employee interface).
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         dip.lab1.HourlyEmployee and dip.lab1.instructor.solution1 (for 
 *              comparison), Employee (interface)
 */
public class HourlyEmployee implements Employee {
    
    private static double standardWage = 7.25; // Wisconsin minimum wage
    private static double standardHrsForYear = 40 * 50;
        // 40 hours/week times 50 weeks (2 weeks vacation)
    
    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyEmployee() {
        setHourlyRate(standardWage);
        setTotalHrsForYear(standardHrsForYear);
    }
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.hourlyRate = hourlyRate;
        this.totalHrsForYear = totalHrsForYear;
    }

    /* Static Getters and Setters */
    
    public static double getStandardWage() {
        return standardWage;
    }

    public static void setStandardWage(double minimumWage) {
        HourlyEmployee.standardWage = minimumWage;
    }

    public static double getStandardHrsForYear() {
        return standardHrsForYear;
    }

    public static void setStandardHrsForYear(double standardHrsForYear) {
        HourlyEmployee.standardHrsForYear = standardHrsForYear;
    }
    
    /* Getters and Setters */
    
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    /* Employee Implementation */
    
    @Override
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
}
