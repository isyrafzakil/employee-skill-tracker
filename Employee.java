import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String department;
    private Set<String> skills;

    public Employee(int id, String name, String department) {
        // TODO: Add your implementation here
         this.id = id;
        this.name = name;
        this.department = department;
        this.skills = new HashSet<>();  // Initialize the skills set to an empty HashSet
        
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
        skills.add(skill);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
