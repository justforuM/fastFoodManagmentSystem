package fastFoodManagmentSystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create a new Restaurant object
        Restaurant restaurant = new Restaurant("My Restaurant", "123 Main St", "555-555-1212");

        // create some MenuItem objects
        MenuItem burger = new MenuItem("Burger", 5.99, 650, 26, 780);
        MenuItem fries = new MenuItem("Fries", 2.99, 330, 15, 270);
        MenuItem shake = new MenuItem("Shake", 3.99, 540, 32, 120);

        // add the MenuItem objects to the menu
        restaurant.addMenuItem(burger);
        restaurant.addMenuItem(fries);
        restaurant.addMenuItem(shake);

        // create a Customer object
        Customer customer = new Customer("John Smith", "555-555-1212", "john@example.com");

        // create a list of MenuItem objects for the order
        List<MenuItem> orderItems = new ArrayList<>();
        orderItems.add(burger);
        orderItems.add(fries);
        orderItems.add(shake);

        // create an Order object
        Order order = new Order(orderItems, customer, LocalDateTime.now());

        // place the order
        restaurant.placeOrder(order);

        // print out the total cost of the order
        System.out.println("Total cost: $" + order.getTotalCost());
    }
}
