package com.mjc813;

import static java.lang.Double.sum;

public class LambdaExample3 {
    public void ch05() {
        Person2 person2 = new Person2();

        person2.action((x, y) -> {
            double result = x + y;
            return result;
        });
        person2.action((x, y) -> (x + y));

        person2.action((x, y) -> sum(x, y));
    }
    public static double sum(double x, double y) {
        return (x + y);
    }
}
