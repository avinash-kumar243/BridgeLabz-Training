package com.reflection;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class GetPrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        Class<?> c = calc.getClass();
        Method m = c.getDeclaredMethod("multiply", int.class, int.class);

        m.setAccessible(true);              // allow access to private method
        int result = (int) m.invoke(calc, 5, 4);

        System.out.println("Result: " + result);
    }
}