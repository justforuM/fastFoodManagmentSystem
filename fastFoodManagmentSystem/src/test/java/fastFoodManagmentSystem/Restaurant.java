package fastFoodManagmentSystem;

public class Restaurant {
    // instance variables
    private String name;
    private String address;
    private String phoneNumber;
    private Menu menu;
    private List<Order> orders;
    private List<Employee> employees;
    private List<Customer> customers;

    // constructor
    public Restaurant(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.menu = new Menu();
        this.orders = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // getters and setters for instance variables
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public Menu getMenu() { return menu; }
    public void setMenu(Menu menu) { this.menu = menu; }
    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
    public List<Customer> getCustomers() { return customers; }
    public void setCustomers(List<Customer> customers) { this.customers = customers; }

    // other methods
    public void addMenuItem(MenuItem item) {
        this.menu.addMenuItem(item);
    }
    public void removeMenuItem(MenuItem item) {
        this.menu.removeMenuItem(item);
    }
    public void placeOrder(Order order) {
        this.orders.add(order);
    }
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
    public void removeCustomer(Customer customer) {
        this.customers.remove(customer);
    }
}