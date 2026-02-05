package sabatinoprovenza.BE_S5_L4.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Drink extends MenuItem {
    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }
}
