package com.mjc813;

import java.util.Scanner;

public class chapter04 {
    public void Third19() {
        int score1 = 0;
        String grade = "B";
        switch (grade) {
            case "A" -> {
                score1 = 100;
            }
            case "B" -> {
                int result = 100 - 20;
                score1 = result;
            }
            default -> {
                score1 = 60;
            }
        }
    }
    public void Third20() {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public void Third21() {
        int num = (int)(Math.random());
        int sum = 0;
        while(sum == 5) {
            System.out.println("합이 5입니다.");
        }
    }
    public void Third22() {
        for(int x = 1; x <= 10; x++) {
            for (int y = 1; y<= 10; y++) {
                if(4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
        System.out.println();
    }
    public void Third23() {
        for(int i =1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void Third24() {
        Scanner s = new Scanner(System.in);
        boolean deposi  = true;
        int money = 10000;

        while(deposi) {
            System.out.println("--------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------");
            System.out.println("선택>");

            String strNum = s.nextLine();

            if(strNum.equals("1")) {
                money++;
                System.out.println("예금액>" + money);
            }
            else if (strNum.equals("2")) {
                money--;
                System.out.println("출금엑>" + money);
            }
            else if(strNum.equals("3")) {
                System.out.println("잔고>" + money);
            }
            else if(strNum.equals("4")) {
                deposi = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
