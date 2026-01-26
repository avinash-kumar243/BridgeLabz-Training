package com.annotation;

class TestLegacyAPI {
    // Step 1: Old method marked as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature. Avoid using it!");
    }

    // Step 2: New recommended method
    public void newFeature() {
        System.out.println("This is the new feature. Use this instead!");
    }
}

public class LegacyAPI {
    public static void main(String[] args) {
    	TestLegacyAPI api = new TestLegacyAPI();

        // Calling deprecated method (will show warning in IDE)
        api.oldFeature();

        // Calling new method
        api.newFeature();
    }
}