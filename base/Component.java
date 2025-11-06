package base;
public abstract class Component {
    public String name;
    public double price;

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}