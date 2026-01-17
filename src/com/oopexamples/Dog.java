package com.oopexamples;

public class Dog extends Animal {
	@Override
    public void eat() {
        System.out.println("** Dog eats dog food.");
    }
	
    public void bark() {
        System.out.println("Dog barks.");
    }
}
