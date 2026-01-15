package com.mjc813;

public class IntegerType {
    public void useInteger() {
        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);

        byte bvar1 = -128;
        byte bvar2 = -30;
        byte bvar3 = 0;
        byte bvar4 = 30;
        byte bvar5 = 127;
        byte bvar6 = -128;
        System.out.println(bvar1);
        System.out.println(bvar2);
        System.out.println(bvar3);
        System.out.println(bvar4);
        System.out.println(bvar5);

        long vvar1 = 10;
        long vvar2 = 20L;
        long vvar3 = 1000000000000L;
        long vvar4 = 1000000000000L;
        System.out.println(vvar1);
        System.out.println(vvar1);
        System.out.println(vvar1);

    }
}
