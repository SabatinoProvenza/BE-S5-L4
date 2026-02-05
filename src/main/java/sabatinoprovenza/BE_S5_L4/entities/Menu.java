package sabatinoprovenza.BE_S5_L4.entities;

import lombok.Getter;
import org.springframework.stereotype.Component;
import sabatinoprovenza.BE_S5_L4.repositories.DrinkRepository;
import sabatinoprovenza.BE_S5_L4.repositories.PizzaRepository;
import sabatinoprovenza.BE_S5_L4.repositories.ToppingRepository;

@Component
@Getter
public class Menu {
    private final PizzaRepository pizzaRepo;
    private final DrinkRepository drinkRepo;
    private final ToppingRepository toppingRepo;

    public Menu(PizzaRepository pizzaRepo, DrinkRepository drinkRepo, ToppingRepository toppingRepo) {
        this.pizzaRepo = pizzaRepo;
        this.drinkRepo = drinkRepo;
        this.toppingRepo = toppingRepo;
    }


}
