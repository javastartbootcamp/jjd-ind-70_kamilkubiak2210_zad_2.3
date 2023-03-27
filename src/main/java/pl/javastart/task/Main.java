package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.setName("Mojito");
        drink1.setPrice(13.0);
        drink1.alcohol = true;
        System.out.println("Drink: " + drink1.getName());
        System.out.println("Cena: " + drink1.getPrice() + "zł");
        System.out.println("Czy zawiera alkohol?" + " " + drink1.alcohol);
        System.out.println("Składniki:");
        System.out.println(drink1.getWaterName());
        System.out.println(drink1.getLemonJuiceName());
        System.out.println(drink1.getVodkaName());
        int ingredientsCapacity = drink1.getLemonJuiceCapacity() + drink1.getWaterCapacity() + drink1.getVodkaCapacity();
        System.out.println("Pojemność: " + ingredientsCapacity + "ml");
    }
}
