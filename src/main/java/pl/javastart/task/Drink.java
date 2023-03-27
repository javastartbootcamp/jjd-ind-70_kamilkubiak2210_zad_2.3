package pl.javastart.task;


public class Drink {
    private String name;
    private double price;
    boolean alcohol;

    public String getWaterName() {
        return "woda";

    }

    public int getWaterCapacity() {
        return 100;
    }

    public String getLemonJuiceName() {
        return "sok cytrynowy";
    }

    public int getLemonJuiceCapacity() {
        return 40;
    }

    public String getVodkaName() {
        return "wódka";
    }

    public int getVodkaCapacity() {
        return 70;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
