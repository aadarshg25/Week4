package com.tit.week04.day06.reflection.intermediatelevel.accessmodifystaticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<Configuration> configClass = Configuration.class;
        Field apiKeyField = configClass.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);
        apiKeyField.set(null, "NEW_API_KEY");

        String updatedKey = (String) apiKeyField.get(null);
        System.out.println("Updated API_KEY: " + updatedKey);
    }
}
