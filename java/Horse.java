
import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private double weight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public String makeNoise() {
        return "Иго-го";
    }
}