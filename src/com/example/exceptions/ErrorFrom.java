package com.example.exceptions;

public class ErrorFrom {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        System.out.println(getCallerClassAndMethodName2());
        System.out.println("--");
        anotherMethod();
        anotherMethod2();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
    private static void anotherMethod2() {
        anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        if (new Exception().getStackTrace().length < 3) {
            return null;
        } else {
            StackTraceElement element = new Exception().getStackTrace()[2];
            return element.getClassName() + "#" + element.getMethodName();
        }
    }
    public static String getCallerClassAndMethodName2() {
        StackTraceElement[] element = new Exception().getStackTrace();
        if (element.length < 3) { return null; }
        else {return element[2].getClassName()+"#"+element[2].getMethodName();}
    }
}
