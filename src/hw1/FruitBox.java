package hw1;

import hw1.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private List<T> list;
    private int count;
    private float boxWeight;

    public FruitBox() {
        count = 0;
        boxWeight = 0;
        list = new ArrayList<>();
    }

    public void fruitAdd(T fruit) {
        list.add(fruit);
        count++;
        boxWeight = fruit.getWeight();
    }

    public float getWeight() {
        return count * boxWeight;
    }

    public int getCount() {
        return count;
    }

    public boolean compare(FruitBox<?> fruitBox) {
        return Math.abs(getWeight() - fruitBox.getWeight()) < 0.000001;
    }

    public void pourItOver(FruitBox<T> fruitBox, int quantity) {
        if (quantity > list.size()){
            return;
        }else {
            while (quantity>0){
                fruitBox.fruitAdd(list.get(0));
                list.remove(0);
                count--;
                quantity--;
            }
        }

    }
}
