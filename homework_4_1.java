package com.example.demo4;

import java.util.ArrayList;

public class homework_4_1 {
    public static void  main (String[]args){
        ArrayList<Number> numbers=new ArrayList<>();
        numbers.add(565);
        numbers.add(444);
        numbers.add(34.5);
        numbers.add(355);
        numbers.add(233);
        System.out.println("Numbers"+"  "+numbers);
        shuffle(numbers);
        System.out.println("Shuffling numbers:"+numbers);
    }
    public static void shuffle(ArrayList<Number> list){
        for(int i = 0; i<list.size();i++){
            int s=(int)(Math.random()*list.size());
            Number temp = list.get(s);
            list.set(s, list.get(i));
            list.set(i, temp);
        }
    }
}
