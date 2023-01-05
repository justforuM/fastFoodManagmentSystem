package fastFoodManagmentSystem;

public class Employee {
    // instance variables
    private String name;
    private EmployeeRole role;
    private List<LocalDate> schedule;

    // constructor
    public Employee(String name, EmployeeRole role) {
        this.name = name;
        this.role = role;
        this.schedule = new ArrayList<>();
    }

    // getters and setters for instance variables
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public EmployeeRole getRole() { return role; }
    public void setRole(EmployeeRole role) { this.role = role; }
    public List<LocalDate> getSchedule() { return schedule; }
    public void setSchedule(List<LocalDate> schedule) { this.schedule = schedule; }

    // other methods
    public void addShift(LocalDate date) {
        this.schedule.add(date);
    }
    public void removeShift(LocalDate date) {
        this.schedule.remove(date);
    }
}

public enum EmployeeRole {
    MANAGER, SERVER, COOK;
}
