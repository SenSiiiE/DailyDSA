package com.oops.inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        this.price = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }
}
