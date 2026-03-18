package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Member mem = new Member("blue");
        System.out.println(mem.id);

        HashCodeExample example = new HashCodeExample();
        example.ch02();

        ToStringExample example1 = new ToStringExample();
        example1.ch03();

        RecordExample example2 = new RecordExample();
        example2.ch04();

        ReflectionExample example3 = new ReflectionExample();
        example3.ch06();

        GetResourceExample example4 = new GetResourceExample();
        example4.ch07();

        PrintAnnotationExample example5 = new PrintAnnotationExample();
    }
}