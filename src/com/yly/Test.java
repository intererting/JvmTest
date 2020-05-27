package com.yly;


public class Test {
    public static void main(String[] args) throws NoSuchMethodException {

    }
}


class CompareAnnotationClass implements CompareAnnotationInterface {

    @CompareAnnotation(param1 = "param1", param2 = "param2")
    @Override
    public void testAnnotation(int param1, int param2) {
        System.out.println(param1 + param1);
    }
}

interface CompareAnnotationInterface {
    void testAnnotation(int param1, int param2);
}