package com.mjc813;

import java.util.Scanner;

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
    public void Third04() {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);

        int banana = 1;
        int totalPieces = banana * 10;
        int num = 7;

        int result1 = totalPieces - num;
        System.out.println("10조각에서 남은 조각: " + result1);
        System.out.println("사과 1개에서 남은 양: " + result1 / 10.0);
    }
        public int equationFirst(int a, int b) {
        // int x = -b / a;
        return -b / a;
    }
    public void Third05() {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2);
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
    public void Third06() {
        int charCode = 'A';
        // int chatCode = 'a';
        // int charCode = '5';

        if( (65<=charCode) & (charCode<=90) ) {
            System.out.println("대문자이군요.");
        }
        if( (97<=charCode) & (charCode<=122) ) {
            System.out.println("소문자이군요.");
        }
        if( (48<=charCode) & (charCode<=57) ) {
            System.out.println("0~9 숫자이군요.");
        }
        int value = 6;
        // int value = 7;

        if( (value%2==0) & (value%3==0) ) {
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value%2==0) || (value%3==0);
        if(!result) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }
    public void Third07() {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("------------------------");

        byte receiveData = -120;

        //방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(receiveData);

        //방법2: 자바 API를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }
    public void Third08() {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2,3);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2,3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
    public void Third09() {
        int value = 772;
        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

        byte byte2 = (byte) (value >>> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번째 바이트 부호 없는 값: " + int2);

        byte byte3 = (byte) (value >>> 8);
        int int3 = byte1 & 255;
        System.out.println("세 번째 바이트 부호 없는 값: " + int3);

        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값: " + int4);
    }
    public void Third10() {
        int result = 0;
        result += 10;
        System.out.println("result=" + result);
        result -= 5;
        System.out.println("result=" + result);
        result *= 3;
        System.out.println("result=" + result);
        result /= 5;
        System.out.println("result=" + result);
        result %= 3;
        System.out.println("result=" + result);
    }
    public void Third11() {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score>80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
    public void Third12() {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
    public void Third13() {
        int score = 85;
        String result = (!(score>90))? "가":"나";
        System.out.println(result);
    }
    public void Third14() {
        int pencil = 534;
        int students = 30;

        int pencilPerStudent = pencil / students;
        System.out.println(pencilPerStudent);

        int pencilsLeft = pencil % students;
        System.out.println(pencilsLeft);
    }
    public void Third15() {
        int value = 356;
        System.out.println(value / 100 * 100);
    }
    public void Third16() {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        // double area = (double)((lengthTop + lengthBottom) * height / 2); x
         double area = (lengthTop + lengthBottom) * height * 1.0 / 2; // o
        // double area = (lengthTop + lengthBottom) * height / 2.0; o
        // double area = (double)(lengthTop + lengthBottom) * height / 2; o
        System.out.println(area);
    }
    public void Third17() {
        int x = 10;
        int y = 5;

        System.out.println( (x>7) && (y<=5));
        System.out.println( (x%3 == 2) || (y%2 != 1));
    }
    public void Third18() {
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if(Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }
    }
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
