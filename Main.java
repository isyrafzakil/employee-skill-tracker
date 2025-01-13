
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final String ENTER_EMPLOYEE_ID = "Enter Employee ID: ";
        final String EMPLOYEE_NOT_FOUND = "Employee not found.";
        EmployeeSkillTracker tracker = new EmployeeSkillTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Employee Skill Tracker");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Skills to Employee");
            System.out.println("3. View Employee Skills");
            System.out.println("4. View All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print(ENTER_EMPLOYEE_ID);
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    tracker.addEmployee(new Employee(id, name, department));
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    System.out.print(ENTER_EMPLOYEE_ID);
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();
                    Employee employee = tracker.findEmployeeById(employeeId);
                    if (employee != null) {
                        System.out.print("Enter Skill to Add: ");
                        String skill = scanner.nextLine();

                        // TODO: Prevent duplicate skills for an employee
                        employee.addSkill(skill);
                        System.out.println("Skill added successfully.");
                    } else {
                        System.out.println(EMPLOYEE_NOT_FOUND);
                    }
                    break;
                case 3:
                    System.out.print(ENTER_EMPLOYEE_ID);
                    int empId = scanner.nextInt();
                    scanner.nextLine();
                    Employee emp = tracker.findEmployeeById(empId);
                    if (emp != null) {
                        System.out.println("Skills: " + emp.getSkills());
                    } else {
                        System.out.println(EMPLOYEE_NOT_FOUND);
                    }
                    break;
                case 4:
                    tracker.displayAllEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
