package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.move(100);
        car.draw();
        System.out.println(car.draw3D());

        Transport plane = new Transport() {
            @Override
            public void move(int var) {
                System.out.println("Самолёт летит со скоростью " + var + " км/ч");
            }
        };
        plane.move(600);
        Cat cat = new Cat();
        cat.draw();
        System.out.println(cat.draw3D());

        Eagle eagle = new Eagle();
        eagle.draw();
        eagle.fly();
        System.out.println(eagle.draw3D());

        Dog dog = new Dog();
        dog.draw();
        System.out.println(dog.draw3D());
        System.out.println("___________________________-");

        Animal[] animal = {cat, eagle, dog};
        for (int i = 0; i < animal.length; i++) {
            animal[i].draw();

        }
        System.out.println("_______________________________");
        Drawable[] drawables = {cat, eagle, dog, car};
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if(drawables[i] instanceof Flyble){
                ((Flyble) drawables[i]).fly();
            }
        }

        double num = 7.6;
        System.out.println((int) num);
    }
}
