package org.example.main;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();

        System.out.println(classOne.greet());
        System.out.println(classTwo.greet());
        System.out.println(classThree.greet());

    }
}