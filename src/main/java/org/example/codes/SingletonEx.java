package org.example.codes;

public class SingletonEx {
    private static SingletonEx singletonEx;

    private SingletonEx() {
    }

    public static SingletonEx getInstance() {
        if (singletonEx == null) {
            singletonEx = new SingletonEx();
        }
        return singletonEx;
    }
}

class SingleMain{
    public static void main(String[] args) {
        System.out.println(SingletonEx.getInstance());
    }
}
