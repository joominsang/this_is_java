package com.mjc813;

public class chapter03 {
    public void Third01() {
        int x = -100;
        x = -x;
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);

        int x1 = 10;
        int y1 = 10;
        int z;

        x1++;
        ++x1;
        System.out.println("x1=" + x1);

        System.out.println("-----------------");
        y1--;
        --y1;
        System.out.println("y1=" + y1);

        System.out.println("-----------------");
        z = x1++;
        System.out.println("z=" + z);
        System.out.println("x1=" + x1);

        System.out.println("-----------------");
        z = ++x1;
        System.out.println("z=" + z);
        System.out.println("x1=" + x1);

        System.out.println("-----------------");
        z = ++x1 + y1++;
        System.out.println("z=" + z);
        System.out.println("x1=" + x1);
        System.out.println("y1=" + y1);
    }
    public void Third02() {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4;
        System.out.println("result2: " + result2);

        double result3 = (double) v1 / v2;
        System.out.println("result3: " + result3);

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }
    public void Third03() {
        byte var1 = 125;
        for(int i=0; i<5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }

        System.out.println("--------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }
    }
}
