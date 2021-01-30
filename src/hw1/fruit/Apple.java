package hw1.fruit;

public class Apple extends Fruit {
    private float weight;

    public Apple() {
        weight = 1.0f;
    }

    @Override
    public float getWeight() {
        return this.weight;
    }
}
