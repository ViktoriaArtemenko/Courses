package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final long ITERATION_NUMBER = 1000000L;

    public static void main(String[] args) {
        List<Tank> tankArrayList = new ArrayList<Tank>();
        List<Tank> tankLinkedList = new LinkedList<Tank>();
        calkTime(tankArrayList);
        calkTime(tankLinkedList);

//        long beginTime = System.currentTimeMillis();
//        fillList(tankArrayList);
//        System.out.println("ARRAYLIST TIME=" + (System.currentTimeMillis() - beginTime));
//
//        beginTime = System.currentTimeMillis();
//        fillList(tankLinkedList);
//        System.out.println("LinkedLIST TIME=" + (System.currentTimeMillis() - beginTime));
    }

    private static  void calkTime(List<Tank> list){
        long beginTime = System.currentTimeMillis();
        fillList(list);
        System.out.println("ARRAYLIST TIME=" + (System.currentTimeMillis() - beginTime));

    }

    private static void fillList(List list) {
        for (long i = 0; i < ITERATION_NUMBER; i++) {
            list.add(new Tank());
        }
    }
}
