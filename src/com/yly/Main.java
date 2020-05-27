package com.yly;

public class Main {

    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader("out/production/JvmTest/com/yly/");
        Class studentClazz = myClassLoader.loadClass("Student");
        Common common = (Common) studentClazz.newInstance();
        common.test();
    }
}
