package tasca3Collections.n1.ejercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Integer valores [] = {1,2,3,4,5};

        list1.addAll(Arrays.asList(valores));

        list2.addAll(list1.reversed());
//
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }

        ListIterator iterator = list1.listIterator();

        while (iterator.hasNext()) {
            list2.add((Integer) iterator.next());
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
