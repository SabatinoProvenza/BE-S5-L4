package sabatinoprovenza.BE_S5_L4.services;

import org.springframework.stereotype.Service;
import sabatinoprovenza.BE_S5_L4.entities.Pizza;
import sabatinoprovenza.BE_S5_L4.repositories.PizzaRepository;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void save(Pizza p) {
        pizzaRepository.save(p);
        System.out.println("L'elemento " + p.getName() + " è stato salvato!");
    }

    public void saveAll(List<Pizza> pizzas) {
        pizzaRepository.saveAll(pizzas);
        System.out.println("Pizze salvate: " + pizzas.size());
    }


    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }
    
}
