package dip.lab1.student.solution1;

/**
 * Employee is a simple interface with a single method: getAnnualWages(), which
 * returns how much the employee will be paid in a year.
 *
 * @author      Dan Noonan
 * @version     1.00
 * @see         dip.lab1.Employee and dip.lab1.instructor.solution1.Employee
 *              (for comparison), HourlyEmployee, SalariedEmployee,
 *              Startup (driver)
 */
public interface Employee { // interface, not concrete class!
    public abstract double getAnnualWages();
}
