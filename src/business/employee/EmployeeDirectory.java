/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;

/**
 * This class has the list of employees.
 *
 * @author rohan
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> EmployeeList) {
        this.employeeList = EmployeeList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setEmpployeeName(name);
        employeeList.add(employee);
        return employee;

    }
}
