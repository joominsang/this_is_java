package com.mjc813;

public class GenericExample3 {
    public void ch07() {
        Box1<String> box1 = new Box1<>();
        box1.content = "100";

        Box1<String> box2 = new Box1<>();
        box2.content = "100";

        boolean result1 = box1.compare(box2);
        System.out.print("result1: " + result1);
    }
}
