package dip.lab1.student.solution1;

/**
 * HRService represents the company's Human Resources division. It has a single
 * method, getEmployeeAnnualWages(), used to determine how much an employee
 * is compensated for the year.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         dip.lab1.HRService and dip.lab1.instructor.solution1.HRService
 *              (for comparison)
 */
public class HRService {
    
    // DN: These fields are not necessary
//    public static final String SALARIED_TYPE = "Salaried";
//    public static final String HOURLY_TYPE = "Hourly";
    
    /**
     * Alternatively to the above, we could use an enum. Does this improve
     * type safety?
     * 
     * DN: Yes, an enum does improve type safety, but we don't need it because 
     * we can use polymorphism instead of checking types.
     */
//    public enum WageType {
//        SALARIED,
//        HOURLY
//    }

    // DN: These static fields are also unnecessary
//    private static final String ERROR_MSG =
//            "Cannot get annual wages because no valid employee type provided";
//    private static final String ERROR_TITLE = "Employee Type Unknown";

    /**
     * This is a truly horrible way to make decisions. Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * employeeType - a String identifying the employee type. A constant
     * (see above) should be used for this, but can you guarantee it will be?
     * Are there other options? Hint: enum
     * @return the annual compensation for supported employee types
     * 
     * DN: I agree that this is rigid and fragile. We can eliminate the type
     * checking by using polymorphism (see getEmployeeAnnualWages() below).
     */
//    public double getAnnualCompensationForEmployee(Employee e,
//            String employeeType)
//    {
//        double annualCompensation = 0;
//
//        // One example of using fragile if logic to determine employee type.
//        // If only we could use polymorphism instead!
//        if(employeeType.equals(HOURLY_TYPE)) {
//            annualCompensation = e.getAnnualWages();
//
//        } else if(employeeType.equals(SALARIED_TYPE)) {
//            annualCompensation = e.getAnnualSalary();
//
//        } else {
//            JOptionPane.showMessageDialog(
//                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
//        }
//
//        return annualCompensation;
//    }


    /**
     * This is another truly horrible way to make decisions.
     * Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * @return the annual compensation for supported employee types
     * 
     * DN: Whether we use Strings (as above) or the instanceof operator (here) 
     * to check types, we are not taking advantage of polymorphism (see 
     * getEmployeeAnnualWages() below).
     */
//    public double getAnnualCompensationForEmployee(Employee e) {
//        double annualCompensation = 0;
//
//        // One example of using fragile if logic to determine employee type.
//        // If only we could use polymorphism!
//        // NOTE: you don't need both versions (the one above and this one).
//        // Find a single, better way, using DIP principles.
//        if(e instanceof HourlyEmployee) {
//            annualCompensation = e.getAnnualWages();
//
//        } else if(e instanceof SalariedEmployee) {
//            annualCompensation = e.getAnnualSalary();
//
//        } else {
//            JOptionPane.showMessageDialog(
//                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
//        }
//
//        return annualCompensation;
//    }
    
    // DN: This is the right way to do it
    public double getEmployeeAnnualWages(Employee e) {
        return e.getAnnualWages(); // simple!
    }
    
}
