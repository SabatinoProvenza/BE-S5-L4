package sabatinoprovenza.BE_S5_L4.services;

import sabatinoprovenza.BE_S5_L4.repositories.DrinkRepository;

public class DrinkService {
    private final DrinkRepository drinkRepository;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }
}
