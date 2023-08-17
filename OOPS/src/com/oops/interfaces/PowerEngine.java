package com.oops.interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("power engine starting");
    }

    @Override
    public void stop() {
        System.out.println("power engine stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("power engine accelerating");
    }
}
