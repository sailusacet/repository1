package com.package4;

public class SubClass extends Person {
    public void accessParentFields() {
        // Accessing inherited protected field 'age'
        System.out.println("Age: " + age);
        
        // Accessing default/package-private field 'address'
        System.out.println("Address: " + address);
    }
}