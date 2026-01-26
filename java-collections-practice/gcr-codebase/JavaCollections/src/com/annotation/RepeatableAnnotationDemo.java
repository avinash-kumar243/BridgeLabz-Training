package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class SoftwareModule {
    @BugReport(description = "NullPointerException")
    @BugReport(description = "ArrayIndexOutOfBounds")
    public void processData() {}
}

public class RepeatableAnnotationDemo {
    public static void main(String[] args) throws Exception {
        Method m = SoftwareModule.class.getMethod("processData");
        for (BugReport b : m.getAnnotationsByType(BugReport.class)) {
            System.out.println(b.description());
        }
    }
}