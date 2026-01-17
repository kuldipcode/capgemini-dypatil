package com.oopexamples;

public abstract class Vehicle {
    // Abstract method (no body)
    public abstract void speedUp();
    
    // Regular method
    public void applyBrakes() {
        System.out.println("Applying brakes.");
    }
}
