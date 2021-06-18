package com.company;

public class Cat extends Animal{
    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");

    }

    @Override
    public String draw3D() {
        return "Кот нарисован в 3D";
    }
}
