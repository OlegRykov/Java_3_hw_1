package hw1;

import hw1.fruit.Apple;
import hw1.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "banana", "peach", "pineapple"};
        replaceElementsArr(arr, 0, 4);

        String[] arr2 = {"cat", "dog", "monkey", "crocodile", "mice"};
        List<String> list = new ArrayList<>(arrInArrayList(arr2));

        FruitBox<Apple> firstAppleBox = new FruitBox();
        FruitBox<Orange> firstOrangeBox = new FruitBox<>();
        FruitBox<Apple> secondAppleBox = new FruitBox<>();
        FruitBox<Orange> secondOrangeBox = new FruitBox<>();

        firstAppleBox.fruitAdd(new Apple());
        firstAppleBox.fruitAdd(new Apple());
        firstAppleBox.fruitAdd(new Apple());

        firstOrangeBox.fruitAdd(new Orange());
        firstOrangeBox.fruitAdd(new Orange());

        firstAppleBox.pourItOver(secondAppleBox, 3);
        firstOrangeBox.pourItOver(secondOrangeBox, 1);

        System.out.println(firstOrangeBox.getWeight());
        System.out.println(secondOrangeBox.getWeight());
        System.out.println(firstAppleBox.getWeight());
        System.out.println(secondAppleBox.getWeight());
        System.out.println(firstAppleBox.compare(firstOrangeBox));
    }

    public static <T> void replaceElementsArr(T[] arr, int i, int j) {
        if (i < 0 || i > arr.length || j < 0 || j > arr.length) {
            return;
        } else {
            List<T> list = new ArrayList<>(Arrays.asList(arr[i], arr[j]));
            arr[i] = list.get(1);
            arr[j] = list.get(0);
        }
    }

    public static <T> List<T> arrInArrayList(T... arr) {
        List<T> list = new ArrayList<T>(Arrays.asList(arr));
        return list;
    }
}
