package com.reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    public static void printApiKey() {
        System.out.println("API_KEY = " + API_KEY);
    }
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        // Print original value
        Configuration.printApiKey();

        // Step 1: Get Class object
        Class<Configuration> clazz = Configuration.class;

        // Step 2: Get the private static field
        Field field = clazz.getDeclaredField("API_KEY");

        // Step 3: Make the private field accessible
        field.setAccessible(true);

        // Step 4: Modify the value (null because it's static, not instance-specific)
        field.set(null, "NEW_SECRET_KEY");

        // Print modified value
        Configuration.printApiKey();
    }
}