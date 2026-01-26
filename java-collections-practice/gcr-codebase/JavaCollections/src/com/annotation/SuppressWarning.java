package com.annotation;

import java.util.ArrayList;

public class SuppressWarning {

    @SuppressWarnings("unchecked") // Suppresses unchecked warnings for this method
    public static void main(String[] args) {

        // Creating ArrayList without generics (raw type)
        ArrayList list = new ArrayList();

        // Adding elements of different types
        list.add("Hello");
        list.add(100);
        list.add(3.14);

        // Retrieving elements (cast required)
        String str = (String) list.get(0);
        int num = (Integer) list.get(1);
        double d = (Double) list.get(2);

        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);
    }
}
 