package com.example.demo4;

import java.util.ArrayList;

public class homework_4_2{
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(565);
        numbers.add(444);
        numbers.add(34.6);
        numbers.add(355);
        numbers.add(233);
        System.out.println("Unsorted: "+numbers);
        sort(numbers);
        System.out.println("Sorted: " + numbers);
    }
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}