package sabatinoprovenza.BE_S5_L4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Pizza extends MenuItem {

    @ManyToMany
    @JoinTable(
            name = "pizza_toppings"
    )
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    // aggiunge un topping
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    // aggiunge più volte lo stesso topping
    public void addTopping(Topping topping, int quantity) {
        for (int i = 0; i < quantity; i++) {
            toppings.add(topping);
        }
    }

    public double getTotalPrice() {
        double total = super.getPrice();

        for (Topping t : toppings) {
            total += t.getPrice();
        }

        return total;
    }


    public int getTotalCalories() {
        int total = super.getCalories();

        for (Topping t : toppings) {
            total += t.getCalories();
        }

        return total;
    }


    public String getDisplayName() {
        String name = super.getName();

        for (Topping t : toppings) {
            name += ", " + t.getName();
        }

        name += ")";
        return name;
    }
}
