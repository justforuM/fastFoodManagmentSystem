package fastFoodManagmentSystem;

public class Order {
    // instance variables
    private List<MenuItem> items;
    private Customer customer;
    private LocalDateTime orderTime;
    private OrderStatus status;

    // constructor
    public Order(List<MenuItem> items, Customer customer, LocalDateTime orderTime) {
        this.items = items;
        this.customer = customer;
        this.orderTime = orderTime;
        this.status = OrderStatus.PLACED;
    }

    // getters and setters for instance variables
    public List<MenuItem> getItems() { return items; }
    public void setItems(List<MenuItem> items) { this.items = items; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public LocalDateTime getOrderTime() { return orderTime; }
    public void setOrderTime(LocalDateTime orderTime) { this.orderTime = orderTime; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

    // other methods
    public double getTotalCost() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public enum OrderStatus {
    PLACED, PREPARING, READY, DELIVERED;
}
