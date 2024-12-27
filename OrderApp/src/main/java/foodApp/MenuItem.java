package foodApp;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
