package com.oops.Polymorphism;

public class example {
    int a;
    example(int i){
        a = i;
    }
    example incrByTen(){
        example temp = new example(a + 10);
        return temp;
    }
}

class retOb{
    public static void main(String[] args) {
        example ob1 = new example(2);
        example ob2;
        ob2 = ob1.incrByTen();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
    }
}
