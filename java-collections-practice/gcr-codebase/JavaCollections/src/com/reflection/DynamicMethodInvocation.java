package com.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    private int add(int a, int b) {
        return a + b;
    }
    private int subtract(int a, int b) {
        return a - b;
    }
    private int multiply(int a, int b) {
        return a * b;
    }
}
public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MathOperations obj = new MathOperations();

        Class<?> c = obj.getClass();
        Method m = c.getDeclaredMethod(methodName, int.class, int.class);

        m.setAccessible(true);
        
        int result = (int) m.invoke(obj, a, b);
        System.out.println("Result: " + result);

        sc.close();
    }
}
