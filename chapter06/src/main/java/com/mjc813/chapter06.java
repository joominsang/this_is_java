package com.mjc813;

public class chapter06 {
    public void StudentExample() {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
    public void CarExample() {
        Car myCar = new Car();

        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
    }
    public void CarExample1() {
        Car1 myCar = new Car1();

        System.out.println("제작회사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색깔: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);
    }
    public void KoreanExample() {
        Korean k1 = new Korean("박자바", "011225-1234567");

        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        Korean k2 = new Korean("김자바", "930525-0654321");

        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
    }
    public void CarExample2() {
        Car2 car1 = new Car2();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        Car2 car2 = new Car2("자가용");
        System.out.println("car2.compnay : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        Car2 car3 = new Car2("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        Car2 car4 = new Car2("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
    public void CarExample3() {
        Car3 car1 = new Car3("자가용");
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println();

        Car3 car2 = new Car3("자가용", "빨강");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Car3 car3 = new Car3("택시", "검정", 200);
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println("car3.maxSpeed : " + car3.maxspeed);
    }
    public void CalculatorExample() {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        int x = 10;
        int y = 4;

        double result2 = myCalc.divide(x,y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();
    }
    public void ComputerExample() {
        Computer myCom = new Computer();

        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1: " + result1);

        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2: " + result2);

        int[] values = {1, 2, 3, 4, 5};
        int result3 = myCom.sum(values);
        System.out.println("result3: " + result3);

        int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result4: " + result4);
    }
    public void CarExample4() {
        Car4 myCar = new Car4();

        myCar.setGas(5);

        if(myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
    public void CalculatorExample2() {
        Calculator2 myCalcu = new Calculator2();

        double result1 = myCalcu.areaRectangle(10);

        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println("정가각형 넓이 =" + result1);
        System.out.println("직사각형 넓이=" + result2);
    }
    public void SmartphoneExample() {
        Smartphone sp1 = new Smartphone("애플", "아이폰 14 pro" , 150);
        System.out.println("회사 이름: " + sp1.company);
        System.out.println("모델명: " + sp1.model);
        System.out.println("가격 : " + sp1.price + "만원");

        Smartphone sp2 = new Smartphone("삼성", "갤럭시 s25+", 120);
        System.out.println("회사 이름: " + sp2.company);
        System.out.println("모델명: " + sp2.model);
        System.out.println("가격 : " + sp2.price + "만원");
    }
    public void NintendoExample() {
        Nintendo nin1 = new Nintendo("마리오카트", "액션", "전체이용", 40000, "aaabbbccc");
        System.out.println("게임제목: " + nin1.gameTitle);
        System.out.println("장르: " + nin1.jangre);
        System.out.println("등급: " + nin1.rank);
        System.out.println("가격: " + nin1.price + "원");
        System.out.println("주소: " + nin1.addr);
    }
    public void CharacterExample() {
        Character ca = new Character("도적고양이", "전사", "남자", "2021.01.01", 10, 10, 10, 10);
        System.out.println("이름: " + ca.name);
        System.out.println("직업: " + ca.job);
        System.out.println("성별: " + ca.gender);
        System.out.println("생일: " + ca.birthday);
        System.out.println("STR: " + ca.str);
        System.out.println("INT: " + ca.intt);
        System.out.println("DEX: " + ca.dex);
        System.out.println("LUX: " + ca.lux);
    }
    public void carExample5() {
        car5 myCar = new car5("포르쉐");
        car5 yourCar = new car5("벤츠");

        myCar.run();
        yourCar.run();
    }
    public void Calculator3Example() {
        double result1 = 10 * 10 * Calculator3.pi;
        int result2 = Calculator3.plus(10,5);
        int result3 = Calculator3.minus(10,5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
    public void TelevisionExample() {
        System.out.println(Television.info);
    }
    public void Car6Example() {

        Car6 myCar = new Car6();
        myCar.speed = 60;
        myCar.run();
    }
    public void Korean1Example() {
        Korean1 k1 = new Korean1("123456-1234567", "감자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name = "김자바";
    }
    public void EarthExample() {
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");
    }
    public void Car7Example() {
        Car7 myCar = new Car7();

        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도: " + myCar.getSpeed());

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
    public void SingletonExample() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
    public void Car8Example() {
        Car7 myCar = new Car7();

        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도: " + myCar.getSpeed());

        if(!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재 속도: " + myCar.getSpeed());
    }
    public void Member1Example() {
        Member1 user1 = new Member1("홍길동", "hong");
    }
    public void MemberServiceExample() {
        MemberService memberService = new MemberService();
        boolean result = memberService.logijn("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다.");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
    public void PrinterExample() {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
    public void Printer1Example() {
        Printer1.println(10);
        Printer1.println(true);
        Printer1.println(5.7);
        Printer1.println("홍길동");
    }
    public void ShopServiceExample() {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
    public void AccountExample() {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재잔고: " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재잔고: " + account.getBalance());
    }
}