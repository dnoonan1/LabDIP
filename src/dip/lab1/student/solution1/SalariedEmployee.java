package dip.lab1.student.solution1;

/**
 * SalariedEmployee holds the data for an employee with a yearly salary and a
 * yearly bonus. From these two fields, the employee's annual wages are
 * calculated by getAnnualWages() (implemented from Employee interface).
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         dip.lab1.SalariedEmployee and dip.lab1.instructor.solution1
 *              .SalariedEmployee (for comparison), Employee (interface)
 */
public class SalariedEmployee implements Employee {
    
    // Static Fields
    private static double standardSalary = 50000; // $50k a year
    private static double standardBonus = 0; // no bonus by default
    
    // Instance Fields
    private double annualSalary;
    private double annualBonus;

    /* Constructors */
    
    public SalariedEmployee() {
        setAnnualSalary(standardSalary);
        setAnnualBonus(standardBonus);
    }
    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    /* Static Getters and Setters */
    
    public static double getStandardSalary() {
        return standardSalary;
    }

    public static void setStandardSalary(double standardSalary) {
        SalariedEmployee.standardSalary = standardSalary;
    }

    public static double getStandardBonus() {
        return standardBonus;
    }

    public static void setStandardBonus(double standardBonus) {
        SalariedEmployee.standardBonus = standardBonus;
    }

    /* Getters and Setters */
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    /* Employee Implementation */
    
    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

}
