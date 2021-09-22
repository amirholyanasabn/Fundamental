package com.gucci;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.voice();

//        Animal dog = new Dog();
//        dog.voice();
//
//        Animal cat = new Cat();
//        cat.voice();
//
//        Animal[] animals = new Animal[2];
//        animals[0] = dog;
//        animals[1] = cat;
//
//        for(Animal animal : animals){
//            animal.voice();
//            System.out.println(animal);
        IAnimal cat = new Cat();
        IAnimal dog = new Dog();

        cat.voice();
        dog.voice();


        JFrame frame = new JFrame("JAVA SE");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton btn = new JButton("OK");
        btn.addActionListener(new MyActionListener());
        frame.add(btn);


    }
}
