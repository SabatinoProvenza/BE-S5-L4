package sabatinoprovenza.BE_S5_L4.services;

import sabatinoprovenza.BE_S5_L4.repositories.PizzaRepository;

public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }
}
