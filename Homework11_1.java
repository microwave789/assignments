package demo4;

import java.util.LinkedHashSet;
import java.util.Set;

// union, difference, intersection

public class Homework11_1 {
    public static void main(String[] args){
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        set1.addAll(set2); // Union

        System.out.print("The Union of set1 and set2 is: ");

        for (String x : set1) {
            System.out.print(x + " ");
        }

        set1.clear();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        System.out.println();

        set1.removeAll(set2); // Difference

        System.out.print("The Difference of set1 and set2 is: ");

        for (String x : set1) {
            System.out.print(x + " ");
        }

        set1.clear();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        System.out.println();

        set1.retainAll(set2); // Intersection

        System.out.print("The Intersection of set1 and set2 is: ");

        for (String x : set1) {
            System.out.print(x + " ");
        }
    }
}
