import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String department;
    private Set<String> skills;

    public Employee(int id, String name, String department) {
        // TODO: Add your implementation here
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Set<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill) {
        // TODO: Add your implementation here
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
