package com.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box =new Box(4, 6, 7);
        System.out.println(box.l + box.h + box.w);

        BoxWeight boxWeight = new BoxWeight(1,2,3,4);
        System.out.println(boxWeight.weight);

        BoxPrice boxPrice = new BoxPrice();
        System.out.println(boxPrice.weight);

        Box b1 = new BoxPrice();
        b1.run();
    }
}
