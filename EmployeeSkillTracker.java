
import java.util.*;

public class EmployeeSkillTracker {
    // TODO: Add your implementation
    private Map<Integer, Employee> employeeMap;

    public EmployeeSkillTracker() {
        // TODO: Add your implementation here
        this.employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        // TODO: Add your implementation here
          employeeMap.put(employee.getId(), employee);
    }

    public void addSkill(int employeeId, String skill) {
        // TODO: Add your implementation here
         Employee employee = findEmployeeById(employeeId);  
        if (employee != null) {
            employee.addSkill(skill);  
            System.out.println("Skill added successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void viewAllEmployees() {
        // TODO: Add your implementation here
        displayAllEmployees();
    }

    public void viewSkills(int employeeId) {
        // TODO: Add your implementation here
         Employee employee = findEmployeeById(employeeId);  
        if (employee != null) {
            System.out.println("Skills of " + employee.getName() + ": " + employee.getSkills());
        } else {
            System.out.println("Employee not found.");
        }
    }

    public Employee findEmployeeById(int id) {
        // TODO: Add your implementation here
        return employeeMap.get(id);
    }

    public void displayAllEmployees() {
        // TODO: Add your implementation here
        if (employeeMap.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee : employeeMap.values()) {
            System.out.println(employee); 
        }
    }
}
