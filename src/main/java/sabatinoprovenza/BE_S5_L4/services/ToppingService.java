package sabatinoprovenza.BE_S5_L4.services;

import sabatinoprovenza.BE_S5_L4.repositories.ToppingRepository;

public class ToppingService {
    private final ToppingRepository toppingRepository;

    public ToppingService(ToppingRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }
}
