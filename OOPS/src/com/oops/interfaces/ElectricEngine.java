package com.oops.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine starting");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerating");
    }
}
