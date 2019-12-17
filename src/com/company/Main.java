package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main (String[]args){
            ArrayList<Integer> list = new ArrayList<>();
        }
        int n = 15;
        ArrayList<Integer> list = new ArrayList<>();
        fillList(n, list){
        System.out.println(list);

        Filter filter = new FilterImpl();
        useFilter(list, filter);
        System.out.println(list);
    }

    public static void useFilter(List<Integer> list, Filter filter) {
        List<Integer> toRemove = new ArrayList<>();
        for (Integer n : list) {
            if (filter.condition(n)) {
                toRemove.add(n);
            }
        }
        list.removeAll(toRemove);
    }

    public static void fillList(int n, List list) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(20));
        }
    }


    private static void fillList(int n, ArrayList<Integer> list) {
    }

    interface Filter {
        public boolean condition(int el);
    }

    class FilterImpl implements Filter {
        public boolean condition(int el) {
            return el % 2 == 0;
        }
    }

    public class Temp {

    }

}
