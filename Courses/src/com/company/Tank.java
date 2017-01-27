package com.company;

public class Tank {

    private int id = 9;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        ArrayList <Man> manList = new ArrayList<Man>();
//
//        for(int i =0; i < 100; i++){
//            manList.add(new Man("A", i));
//        }
//
//        long startTime = System.currentTimeMillis();
//        for(int i =0; i< manList.size(); i++){
//            manList.add(new Man("A", i+50));
//        }
//        long finishTime = System.currentTimeMillis();
//
//        long resulsSec = finishTime - startTime;
//
//        System.out.println("FINISH ARRAY LIST TIME " + resulsSec / 1000.0);
//
//
//        LinkedList<Man> linkedList = new LinkedList<Man>();
//
//
//        for(int i =0; i < 100; i++){
//            linkedList.add(new Man("A", i));
//        }
//
//        long startTime2 = System.currentTimeMillis();
//        for(int i =0; i< linkedList.size(); i++){
//            linkedList.add(new Man("A", i+50));
//        }
//        long finishTime2 = System.currentTimeMillis();
//
//        long resulsSec2 = finishTime2 - startTime2;
//
//        System.out.println("FINISH Linked LIST TIME " + resulsSec2 / 1000.0);
//
//    }
//}
