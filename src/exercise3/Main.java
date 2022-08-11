package exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Fruit> fruitMap = new HashMap<>();
        Apricot apricot = new Apricot("абрикос");
        Apple apple = new Apple("€блоко");
        Pear pear = new Pear("груша");
        for (int i = 0; i <= 5; i++) {
            fruitMap.put(i, apple);
            fruitMap.remove(i);
            for (int j = 6; j <= 10; j++) {
                fruitMap.put(j, apricot);
            }
            for (int d = 11; d <= 15; d++) {
                fruitMap.put(d, pear);
            }
        }
        List<Map<Integer, Fruit>> fruitList = new ArrayList<>();
        for (Map.Entry fruitEntry : fruitMap.entrySet()) {
            System.out.println(fruitEntry.getKey() + " - " + fruitEntry.getValue());
        }
        fruitList.add(fruitMap);

        System.out.println(fruitList);
    }
}