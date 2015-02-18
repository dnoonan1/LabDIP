package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 * Startup is a driver to test the Employee interface and its implementations
 * (HourlyEmployee and SalariedEmployee). It uses polymorphism to easily
 * calculate the annual wages of each employee.
 * 
 * @author      Dan Noonan
 * @version     1.00
 * @see         dip.lab1.Startup and dip.lab1.instructor.solution1.Startup (for 
 *              comparison)
 */
public class Startup {
        
    public static void main(String[] args) {
        
        Employee[] employees = {
            new HourlyEmployee(10.50, 2020),
            new SalariedEmployee(45000, 1250),
            new SalariedEmployee(90000, 0)
        };
        
        HRService hr = new HRService();
        
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d annual compensation: $%,.2f\n",
                    i + 1, hr.getEmployeeAnnualWages(employees[i]));
        }
        
    }
    
}
