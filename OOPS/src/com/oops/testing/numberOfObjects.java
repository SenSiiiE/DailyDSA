package com.oops.testing;

class obj{
    private static int i = 0;
    obj(){
        i++;
    }

    public static int getI(){
        return i;
    }
}
public class numberOfObjects {
    public static void main(String[] args) {
        obj A = new obj();
        obj B = new obj();
        obj C = new obj();
        System.out.println(obj.getI());
    }
}
