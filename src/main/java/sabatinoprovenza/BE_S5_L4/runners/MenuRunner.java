package sabatinoprovenza.BE_S5_L4.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sabatinoprovenza.BE_S5_L4.services.DrinkService;
import sabatinoprovenza.BE_S5_L4.services.PizzaService;
import sabatinoprovenza.BE_S5_L4.services.ToppingService;

@Component
public class MenuRunner implements CommandLineRunner {

    private final PizzaService pizzaService;
    private final DrinkService drinkService;
    private final ToppingService toppingService;

    public MenuRunner(PizzaService pizzaService, DrinkService drinkService, ToppingService toppingService) {
        this.pizzaService = pizzaService;
        this.drinkService = drinkService;
        this.toppingService = toppingService;
    }

    @Override
    public void run(String... args) {

        printMenu();

//        // TOPPINGS
//        Topping mozzarella = new Topping("Mozzarella", 1.00, 150);
//        Topping prosciuttoCotto = new Topping("Prosciutto cotto", 1.50, 200);
//        Topping prosciuttoCrudo = new Topping("Prosciutto crudo", 2.00, 220);
//        Topping funghi = new Topping("Funghi", 1.20, 50);
//        Topping salamePiccante = new Topping("Salame piccante", 1.80, 250);
//        Topping wurstel = new Topping("Wurstel", 1.50, 230);
//        Topping patatine = new Topping("Patatine fritte", 2.00, 300);
//        Topping olive = new Topping("Olive", 1.00, 80);
//        Topping tonno = new Topping("Tonno", 1.70, 180);
//        Topping cipolla = new Topping("Cipolla", 0.80, 40);
//
//        toppingService.saveAll(List.of(
//                mozzarella, prosciuttoCotto, prosciuttoCrudo, funghi,
//                salamePiccante, wurstel, patatine, olive, tonno, cipolla
//        ));
//
//        // PIZZAS
//        Pizza margherita = new Pizza("Margherita", 6.00, 800);
//        margherita.getToppings().add(mozzarella);
//
//        Pizza prosciuttoEFunghi = new Pizza("Prosciutto e Funghi", 7.50, 950);
//        prosciuttoEFunghi.getToppings().addAll(List.of(mozzarella, prosciuttoCotto, funghi));
//
//        Pizza diavola = new Pizza("Diavola", 8.00, 1100);
//        diavola.getToppings().addAll(List.of(mozzarella, salamePiccante));
//
//        Pizza capricciosa = new Pizza("Capricciosa", 8.50, 1200);
//        capricciosa.getToppings().addAll(List.of(mozzarella, prosciuttoCotto, funghi, olive));
//
//        Pizza tonnoECipolla = new Pizza("Tonno e Cipolla", 8.00, 1050);
//        tonnoECipolla.getToppings().addAll(List.of(mozzarella, tonno, cipolla));
//
//        Pizza wurstelEPatatine = new Pizza("Wurstel e Patatine", 8.50, 1300);
//        wurstelEPatatine.getToppings().addAll(List.of(mozzarella, wurstel, patatine));
//
//        Pizza crudoERucola = new Pizza("Crudo e Rucola", 9.00, 1000);
//        crudoERucola.getToppings().addAll(List.of(mozzarella, prosciuttoCrudo));
//
//        pizzaService.saveAll(List.of(
//                margherita, prosciuttoEFunghi, diavola,
//                capricciosa, tonnoECipolla, wurstelEPatatine, crudoERucola
//        ));
//
//        // DRINKS
//        Drink acquaNaturale = new Drink("Acqua naturale", 1.50, 0);
//        Drink acquaFrizzante = new Drink("Acqua frizzante", 1.50, 0);
//        Drink cocaCola = new Drink("Coca-Cola", 2.50, 150);
//        Drink fanta = new Drink("Fanta", 2.50, 160);
//        Drink birraMoretti = new Drink("Birra Moretti", 3.50, 180);
//        Drink vinoRosso = new Drink("Vino rosso (calice)", 4.00, 120);
//
//        drinkService.saveAll(List.of(
//                acquaNaturale, acquaFrizzante, cocaCola,
//                fanta, birraMoretti, vinoRosso
//        ));
//
//        System.out.println("Menu creato e salvato nel DB!");
    }

    public void printMenu() {
        System.out.println("=== MENU ===\n");

        System.out.printf("%-60s %10s %10s%n", "Pizzas", "Calories", "Price");

        pizzaService.findAll().forEach(p -> {

            System.out.printf("%-60s %10d %10.2f%n",
                    p.getName(),
                    p.getCalories(),
                    p.getPrice()
            );
        });


        System.out.println();

        System.out.printf("%-60s %10s %10s%n", "Toppings", "Calories", "Price");

        toppingService.findAll().forEach(t -> System.out.printf(
                "%-60s %10d %10.2f%n",
                t.getName(),
                t.getCalories(),
                t.getPrice()
        ));

        System.out.println();

        System.out.printf("%-60s %10s %10s%n", "Drinks", "Calories", "Price");

        drinkService.findAll().forEach(d -> System.out.printf(
                "%-60s %10d %10.2f%n",
                d.getName(),
                d.getCalories(),
                d.getPrice()
        ));
    }

}
