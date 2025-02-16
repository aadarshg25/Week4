package com.tit.week04.day06.reflection.intermediatelevel.retrieveannotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}
