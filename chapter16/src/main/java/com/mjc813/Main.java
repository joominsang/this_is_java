package com.mjc813;

import com.mjc813.lamda.LamdaUseInterface;
import com.mjc813.lamda.NormalUseInterface;
import org.xml.sax.ext.Locator2;

public class Main {
    public static void main() {
        NormalUseInterface nui = new NormalUseInterface();
        nui.doSome();

        LamdaUseInterface lui = new LamdaUseInterface();
        lui.doSome( (str, n) -> {
            System.out.println(str.length() == n ? str + "같다" + n : "다르다");
        }, "def", 3);

        lui.doSome( (sss, i) -> {
            for(int m = 0; m < i; m++) {
                System.out.print(sss);
            }
            System.out.println();
        }, "def", 3);

        LambdaExample ex01 = new LambdaExample();
        ex01.ch01();

        LambdaExample1 ex02 = new LambdaExample1();
        ex02.ch02();

        ButtonExample ex03 = new ButtonExample();
        ex03.ch03();

        LambdaExample2 ex04 = new LambdaExample2();
        ex04.ch04();

        LambdaExample3 ex05 = new LambdaExample3();
        ex05.ch05();

        MethodReferenceExample ex06 = new MethodReferenceExample();
        ex06.ch06();

        MethodReferenceExample1 ex07 = new MethodReferenceExample1();
        ex07.ch07();
    }
}
