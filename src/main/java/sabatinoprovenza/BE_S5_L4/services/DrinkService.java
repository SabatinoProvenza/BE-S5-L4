package sabatinoprovenza.BE_S5_L4.services;

import org.springframework.stereotype.Service;
import sabatinoprovenza.BE_S5_L4.entities.Drink;
import sabatinoprovenza.BE_S5_L4.repositories.DrinkRepository;

import java.util.List;

@Service
public class DrinkService {
    private final DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public void save(Drink d) {
        drinkRepository.save(d);
        System.out.println("L'elemento " + d.getName() + " è stato salvato!");
    }

    public void saveAll(List<Drink> drinks) {
        drinkRepository.saveAll(drinks);
        System.out.println("Drink salvati: " + drinks.size());
    }


    public List<Drink> findAll() {
        return drinkRepository.findAll();
    }
}
