package com.company;

public class Monkey implements Climbable, Eatable {
    @Override
    public void climb() {
        System.out.println("I can climb on other animal's back");
    }

    @Override
    public void eat() {
        System.out.println("I can eat fruits!");
    }

    public class Fruit implements Eatable {

        @Override
        public void eat() {
            System.out.println("I can be eatable!");
        }
    }
}
