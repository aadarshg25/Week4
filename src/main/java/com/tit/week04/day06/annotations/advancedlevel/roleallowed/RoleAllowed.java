package com.tit.week04.day06.annotations.advancedlevel.roleallowed;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}
