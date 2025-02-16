package com.tit.week04.day06.annotations.advancedlevel.roleallowed;

public class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }
}