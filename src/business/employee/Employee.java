/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

/**
 * This is the employee class.
 *
 * @author Admin
 */
public class Employee {

    private String empployeeName;
    private int employeeID;
    private int count;

    public Employee() {
        employeeID = count;
        count++;
    }

    public String getEmpployeeName() {
        return empployeeName;
    }

    public void setEmpployeeName(String empployeeName) {
        this.empployeeName = empployeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return empployeeName;
    }
}
