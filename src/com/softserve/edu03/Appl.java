package com.softserve.edu03;

public class Appl {

    private String name = "Ivan";

    // Overload
    public void print() {
        System.out.println("name = " + name);
    }

    // Overload
    public void print(String s) {
        System.out.println("s = " + s + "  name = " + name);
    }

    // Overload
    public void print(int... keys) {
        System.out.println("print(int... key), keys:");
        for (int key : keys) {
            System.out.println("key = " + key);
        }
    }

    public void print2(Object... keys) {
        System.out.println("print(Object... key), keys:");
        for (Object key : keys) {
            System.out.println("key2 = " + key); // key.toString()
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Ok12");
        /*-
        byte b = 1; // b = (byte) 1;
        //b = b + 1; // Compile Error; 1 - int type; b - byte type;
        b = (byte) (b + 1); // (b + 1) is int
        System.out.println("b = " + b);
        //
        float f = 1;
        //f = f + 311.5; // Compile Error; 311.5 - double type
        f = f + 311.5f;
        System.out.println("f = " + f);
        b = (byte) f; // Code Smell;  // f = 1 0011 1000 = 312
        System.out.println("new b = " + b); // 0011 1000 = 56
        //
        f = (float) Math.sqrt(2.25);
        System.out.println("f = " + f);
        */
        // /*-
        int k; // Not dafault
        //Student student = new Student();
        Student student = new Student("Ivan", "Ivanov", 25);
        k = student.getAge();
        System.out.println("k = " + k);
        // */
        // /*
        Appl app = new Appl();
        app.print();
        app.print("hello");
        //
        app.print(1, 2, 3);
        app.print(10, 20, 30, 40);
        app.print2("abc", 1.1, 123, student); // 1.1->double->Double;  123->int->Integer
        // */
    }
}
