package com.mjc813.chapter07;

public class Chapter07 {

    public void SmartPhoneExample() {
        SmartPhone myPhone = new SmartPhone("겔럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
    public void SmartPhone1Example() {
        SmartPhone1 myPhone = new SmartPhone1("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
    public void SmartPhone2Example() {
        SmartPhone2 myPhone = new SmartPhone2("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
    public void ComputerExample() {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적: " + computer.areaCircle(r));
    }
    public void SupersonicAirplaneExample() {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
    public void PromotionExample() {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;
    }
    public void ChildExample() {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();
    }
    public void StudentExample() {
        Student student = new Student("홍길동", "2022123493", 24);
        Subject subject = new Subject("객체지향언어", "이순신");
        StudentSubject stusubject = new StudentSubject(90, "B");

        System.out.println(student.name + "이" + subject.subName + "를 수강하여" + stusubject.grade + "점을 받았습니다.");
    }
 }
