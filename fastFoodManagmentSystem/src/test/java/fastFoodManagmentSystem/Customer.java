package fastFoodManagmentSystem;

public class Customer {
    // instance variables
    private String name;
    private String phoneNumber;
    private String email;
    private List<Order> orders;

    // constructor
    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // getters and setters for instance variables
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }

    // other methods
    public void placeOrder(Order order) {
        this.orders.add(order);
    }
}
