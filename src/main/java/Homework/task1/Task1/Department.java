package Homework.task1.Task1;

import java.util.Arrays;

public class Department implements DepartmentOperations {
    private String departmentName;
    private Employee[] employees;
    private int currentSize;
    private int maxSize;

    public Department(String departmentName, int currentSize, int maxSize,Employee[] employees) {
        this.departmentName = departmentName;
        this.currentSize = currentSize;
        this.maxSize = maxSize;
        this.employees=employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", currentSize=" + currentSize +
                ", maxSize=" + maxSize +
                '}';
    }

    @Override
    public void addEmployee(Employee employee) {
        Employee[] addemploy = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            addemploy[i] = employees[i];
        }
        addemploy[employees.length] = employee;
        System.out.println( addemploy[employees.length]);
    }
    public void printinformation() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Override
    public void removeEmployee(String name) {
            Employee[] uuu=new Employee[employees.length-1];
        for (int i = 0; i <employees.length ; i++) {
           Employee uuup=employees[i];
           uuup.setName(name);
            System.out.println(uuu);
            System.out.println(uuup.getName());
        }
    }
}

