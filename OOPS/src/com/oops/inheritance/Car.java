package com.oops.inheritance;

class Car {
    String carname;
    Car( String brand) {
        this.carname = brand;
    }
    String present() {
        return "I have a " + this.carname;
    }
}

class Model extends Car {
    private String model;
    Model(String brand, String mod) {
        super(brand);
        this.model = mod;
    }
    String show() {
        return this.present() + ", it is a " + this.model;
    }

    String getModel(){
        return this.model;
    }
}

class Main2{
    public static void main(String[] args) {
        Model car = new Model("Bmw", "S8");
        System.out.println(car.show());
        System.out.println(car.getModel());

        byte x = 64;
        int i;
        byte y;
        i = x << 2;
        y = (byte) (x << 2);
        System.out.print(i + " " + y);
    }
}