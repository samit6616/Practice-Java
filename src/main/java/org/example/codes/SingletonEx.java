package org.example.codes;

public class SingletonEx {
    private static SingletonEx instance;

    // Private constructor to prevent instantiation from outside
    private SingletonEx() {
    }

    // Static method to get the singleton instance
    public static SingletonEx getInstance() {
        if (instance == null) {
            // If the instance is null, create a new one
            instance = new SingletonEx();
        }
        // Return the singleton instance
        return instance;
    }

    // Other methods and properties of the Singleton class can be defined here
}
