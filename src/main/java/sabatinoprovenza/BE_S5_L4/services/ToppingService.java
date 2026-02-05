package sabatinoprovenza.BE_S5_L4.services;

import org.springframework.stereotype.Service;
import sabatinoprovenza.BE_S5_L4.entities.Topping;
import sabatinoprovenza.BE_S5_L4.repositories.ToppingRepository;

import java.util.List;

@Service
public class ToppingService {
    private final ToppingRepository toppingRepository;

    public ToppingService(ToppingRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }

    public void save(Topping t) {
        toppingRepository.save(t);
        System.out.println("L'elemento " + t.getName() + " è stato salvato!");
    }

    public void saveAll(List<Topping> toppings) {
        toppingRepository.saveAll(toppings);
        System.out.println("Topping salvati: " + toppings.size());
    }


    public List<Topping> findAll() {
        return toppingRepository.findAll();
    }
}
