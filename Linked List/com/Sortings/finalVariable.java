package com.Sortings;

import java.lang.reflect.Field;

public class finalVariable {
    public static void main(String[] args) throws Exception {
        // Create an instance of the class
        MyClass obj = new MyClass();

        // Get the field using reflection
        Field field = MyClass.class.getDeclaredField("myFinalField");
        field.setAccessible(true); // Override access restrictions

        // Attempt to change the value of the final field
        field.set(obj, "New Value"); // This might not work due to compiler optimizations

        // Print the updated value
        System.out.println(obj.getMyFinalField());
    }
}

class MyClass {
    private final String myFinalField = "Initial Value";

    public String getMyFinalField() {
        return myFinalField;
    }
}

