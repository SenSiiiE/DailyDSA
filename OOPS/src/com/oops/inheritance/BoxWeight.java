package com.oops.inheritance;

public class BoxWeight extends Box {
    static void run(){
        System.out.println("Boxweight is running..");
    }
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        this.weight = weight;
    }


}
