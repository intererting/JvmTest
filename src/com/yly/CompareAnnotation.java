package com.yly;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CompareAnnotation {

    String param1();

    String param2();
}

