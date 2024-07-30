package EmployeeManagementSystem;


public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

 
    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Array is full, cannot add more employees.");
        }
    }


    public Employee searchEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; 
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

   
    public void deleteEmployeeById(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null; // Clear the last element
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

       
        ems.addEmployee(new Employee("E001", "John Doe", "Developer", 70000));
        ems.addEmployee(new Employee("E002", "Jane Smith", "Manager", 90000));
        ems.addEmployee(new Employee("E003", "Alice Johnson", "Designer", 65000));

      
        System.out.println("All Employees:");
        ems.traverseEmployees();

       
        System.out.println("\nSearching for Employee ID E002:");
        Employee employee = ems.searchEmployeeById("E002");
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee ID E003:");
        ems.deleteEmployeeById("E003");

    
        System.out.println("\nAll Employees After Deletion:");
        ems.traverseEmployees();
    }
}

