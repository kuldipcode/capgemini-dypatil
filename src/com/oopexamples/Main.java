package com.oopexamples;

public class Main {
    public static void main(String[] args) {
        // Encapsulation Example
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setId(101);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());

        // Inheritance and Polymorphism Example
        Animal myAnimal = new Dog(); // Polymorphism
        myAnimal.eat(); // Calls the overridden method in Dog
        // myAnimal.bark(); would cause an error as bark is not in the Animal class

        // Abstraction Example
        Vehicle myCar = new Car();
        myCar.speedUp();
        myCar.applyBrakes();
    }
}
