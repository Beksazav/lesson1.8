package com.company;

public class Eagle extends Bird{


    @Override
    public void draw() {
        System.out.println("\uD83E\uDD85");

    }

    @Override
    public String draw3D() {
        return "Орёл нарисован в 3D";
    }

    @Override
    public void fly() {
        System.out.println("Орёл летит");

    }
}
