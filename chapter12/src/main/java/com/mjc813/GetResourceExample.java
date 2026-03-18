package com.mjc813;

public class GetResourceExample {
    public void ch07() {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.jpg").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.print(photo1Path);
        System.out.print(photo2Path);
    }
}
