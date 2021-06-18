package com.company;

public class Dog extends Animal {
    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");

    }

    @Override
    public String draw3D() {
        return "Собака нарисована в 3D";
    }
}
