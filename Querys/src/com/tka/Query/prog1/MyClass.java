package com.tka.Query.prog1;						// Can class be a return type of any method?

public class MyClass {
    private int value;

    // Constructor
    public MyClass(int value) {
        this.value = value;
    }

    // A method that returns an instance of MyClass
    public static MyClass createInstance(int value) {
        return new MyClass(value);
    }

    // Another method that uses an instance of MyClass
    public void printValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Create an instance of MyClass using the createInstance method
        MyClass obj = createInstance(42);

        // Use the object
        obj.printValue();
    }
}