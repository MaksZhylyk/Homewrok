package lesson27;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    ArrayList<Employee> employees;
    private void addEmployee(Employee employeeToSave){
        if(checkEmployee(employeeToSave)){
            employees.add(employeeToSave);
            System.out.println("Employee " + employeeToSave.getName() + "added to the list");
        }
        else{
            System.out.println("Employee was not added to the list");
        }
    }
    private boolean checkEmployee(Employee employeeToCheck){
        for(Employee employee: employees){
            if(employeeToCheck.getEmployeeId() == employee.getEmployeeId()){
                System.out.println("Employee with ID " + employeeToCheck.getEmployeeId() + "already exist");
                return true;
            }
        }
        return false;
    }
    public void updateEmployee(int employeeId, String name, String department, double salary){
        for(Employee employee: employees){
            if(employee.getEmployeeId() == employeeId){
                employee.setName(name);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Employee information update");
                return;
            }
        }
        System.out.println("Employee with ID" + employeeId + "not found");
    }
    public void removeEmployee(int employeeId){
        boolean removeResult = employees.removeIf( employee -> employee.getEmployeeId() == employeeId);
        if(removeResult){
            System.out.println("employee " + employeeId + "has removed");
        }
        else {
            System.out.println("employee" + employeeId + "not found");
        }
    }
    public Employee findEmployeeById( int employeeId){
        for(Employee employee: employees){
            if(employee.getEmployeeId() == employeeId){
                System.out.println("Employee " + employeeId);
            return employee;
            }
        }
        System.out.println("not found");
        return null;
    }
}
