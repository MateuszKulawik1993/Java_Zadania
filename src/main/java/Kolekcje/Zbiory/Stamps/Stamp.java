package Kolekcje.Zbiory.Stamps;

import java.util.Objects;

public class Stamp {
    private String name;
    private String quantity;
    private boolean isStamped;

    public Stamp(String name, String quantity, boolean isStamped) {
        this.name = name;
        this.quantity = quantity;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped && Objects.equals(name, stamp.name) && Objects.equals(quantity, stamp.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", quantity='" + quantity + '\'' +
                ", isStamped=" + isStamped +
                '}';
    }
}
