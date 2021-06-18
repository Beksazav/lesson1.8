package com.company;

public class Car extends Transport implements Drawable{

    @Override
    public void move(int var) {
        System.out.println("машина едет со скоростью " + var + " км/ч");
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE97");
    }

    @Override
    public String draw3D() {
        return "Машина нарисована в 3D";
    }
}
