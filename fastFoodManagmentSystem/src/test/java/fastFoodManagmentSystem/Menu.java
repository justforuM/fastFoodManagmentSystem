package fastFoodManagmentSystem;

public class Menu {
    // instance variables
    private List<MenuItem> items;

    // constructor
    public Menu() {
        this.items = new ArrayList<>();
    }

    // getters and setters for instance variables
    public List<MenuItem> getItems() { return items; }
    public void setItems(List<MenuItem> items) { this.items = items; }

    // other methods
    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }
    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
    }
    public List<MenuItem> getAvailableMenuItems() {
        return this.items;
    }
}