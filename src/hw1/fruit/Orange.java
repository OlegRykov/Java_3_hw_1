package hw1.fruit;

public class Orange extends Fruit {
    private float weight;

    public Orange() {
        weight = 1.5f;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }
}
