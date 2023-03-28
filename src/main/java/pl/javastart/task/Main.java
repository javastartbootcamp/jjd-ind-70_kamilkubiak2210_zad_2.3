package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.price = 13.0;
        drink1.alcohol = true;
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.name = "woda";
        drink1.ingredient1.volume = 90;
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.name = "sok cytrynowy";
        drink1.ingredient2.volume = 60;
        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.name = "wódka";
        drink1.ingredient3.volume = 60;

        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.price + "zł");
        System.out.println("Czy zawiera alkohol?" + " " + drink1.alcohol);
        System.out.println("Składniki:");
        String ingredient1Name = drink1.ingredient1.name;
        String ingredient2Name = drink1.ingredient2.name;
        String ingredient3Name = drink1.ingredient3.name;
        System.out.println(ingredient1Name);
        System.out.println(ingredient2Name);
        System.out.println(ingredient3Name);

        System.out.println("Pojemność: " + (drink1.ingredient1.volume + drink1.ingredient2.volume + drink1.ingredient3.volume) + "ml");
    }
}
