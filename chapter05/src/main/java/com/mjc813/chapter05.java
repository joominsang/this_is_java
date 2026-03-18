package com.mjc813;

import com.sun.jdi.IntegerValue;

import java.awt.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class chapter05 {
    public void chp01() {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);

        System.out.println(arr2 == arr3);
    }

    public void chp02() {
        int[] array = null;
        //int array[0] = 10;

        String str = null;
        //System.out.println("총 문자 수: " + str.length());
    }

    public void chp03() {
        String hobby = "여행";
        hobby = null;

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2);
    }

    public void chp04() {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }
    }

    public void chp05() {
        String hobby = "";
        if (hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
        }
    }

    public void chp06() {
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }

    public void chp07() {
        String ssn = "9506241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }

    public void chp08() {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }

    public void chp09() {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }

    public void chp10() {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }

    public void chp11() {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] tokens = board.split(",");

        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println();

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }

    public void chp12() {
        String[] season = {"spring", "summer", "fall", "winter"};

        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);

        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }

    public void chp13() {
        int[] scores;
        scores = new int[]{83, 90, 87};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        printItem(new int[]{83, 90, 87});
    }

    public static void printItem(int[] scores) {
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }

    public void chp14() {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println("\n");

        double[] arr2 = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println();

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println("\n");

        String[] arr3 = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
        }
        System.out.println();

        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";

        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i] + ", ");
        }
    }

    public void chp15() {
        int[] scores = {84, 90, 96};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }

    public void chp16() {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };
        System.out.println("1차원 배열 길이(반의 수): " + scores.length);
        System.out.println("1차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
        System.out.println("1차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);

        System.out.println("scores[0][2]: " + scores[0][2]);

        System.out.println("scores[1][1]: " + scores[1][1]);

        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수: " + class1Avg);

        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두 번째 반의 평균 점수: " + class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int k = 0; k < scores[i].length; k++) {
                totalSum += scores[i][k];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
    }

    public void chp17() {
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {

                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }
        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int k = 0; k < mathScores[i].length; k++) {

                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {

                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }
        System.out.println();
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {

                totalEnglishSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }

    public void runarray() {
        char[][] lines = new char[5][];
        for (int i = 1; i < lines.length; i++) {
            lines[i] = new char[i + 1];
            for (int k = 1; k < lines[i].length; k++) {
                lines[i][k] = '*';
            }
        }
        for (int i = 1; i < lines.length; i++) {
            for (int k = 1; k < lines[i].length; k++) {
                System.out.printf("%c", lines[i][k]);
            }
            System.out.println();
        }
    }

    public void acmicpcNet_problem_10818() {
        int[] count = this.getIntArrayFromScanner("처리할 갯수를 입력", 1);
        if (count == null || count.length <= 0 || count[0] == 0) {
            return;
        }

        int[] intArray = this.getIntArrayFromScanner("3 -1 5..., 이런식으로 공백으로 숫자를 띄워서 입력", count[0]);
        if (intArray == null || intArray.length <= 0) {
            return;
        }
        int[] resArray = this.findMinMax(intArray);
        System.out.printf("acmicpcNet_problem_10818 = %d, %d\n", resArray[0], resArray[1]);
    }

    private int[] findMinMax(int[] intArray) {
        int[] arrResult = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int number : intArray) {
            if (number < arrResult[0]) {
                // 최솟값 구하기
                arrResult[0] = number;
            }
            if (arrResult[1] < number) {
                // 최댓값 구하기
                arrResult[1] = number;
            }
        }
        return arrResult;
    }

    private int[] getIntArrayFromScanner(String title, int length) {
        System.out.printf("%s : ", title);
        Scanner scanner = new Scanner(System.in);

        int[] nResult = new int[length];
        int number = 0;
        String sInput = scanner.nextLine();
        try {
            String[] arrItem = sInput.split(" ");
            for (int i = 0, j = 0; i < nResult.length && j < arrItem.length; i++, j++) {
                nResult[i] = Integer.parseInt(arrItem[j]);
            }
            int j = 0;  // 예외가 발생하면 다음 문장을 실행 안하고 catch 블록으로 이동한다.
            j = 10 + j;
            // try 블록은 예외가 발생할수도 있는 문장을 try 블록으로 감싸는 역할을 한다.
        } catch (Exception e1) {
            // try 블록에서 예외가 발생되면 catch (예외클래스 객체이름) 블록으로 자동 실행된다.
            System.err.println(e1.getMessage() + ": 숫자 값을 입력하세요 !");
            nResult = null;
        }
        // 키보드 입력으로 정수형 문자열 입력받아서 정수로 변환하고 리턴
        return nResult;
    }

    //1번 : 10개의 boolean 값이 원소인 1차원 배열의 짝수번째 인덱스가 true 이고 다른 인덱스는 false 로 만들어서 출력하세요
    //입력 =>
    //boolean[] boolArray = new boolean[10];
    //처리 => 반복문을 사용하세요, 짝수번째 인덱스의 원소를 true, 홀수는 false 로 할당
    //한줄에 출력 =>
    //true, false, true, false, ..., true, false
    public void chp18() {
        Scanner s = new Scanner(System.in);
        boolean[] boolArray = new boolean[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                boolArray[i] = true;
            } else {
                boolArray[i] = false;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(boolArray[i]);
            if (i < boolArray.length - 1) {
                System.out.print(", ");
            }
        }
    }

    // 1-1 : 30개의 int형 배열을 선언하고 모든 원소의 값을 인덱스 번호로 대입하세요.
    public void chp19() {
        int[] intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
            System.out.println(intArray[i]);
        }
    }

    // 1-2 : char형 1차원 배열을 선언하고 길이는 20개 입니다.
    public void chp20() {
        char[] charArray = new char[20];
    }

    // 1-3 : boolean형 2차원 배열을 3행 4열 만들고 값을 true로 모두 설정하세요.
    public void chp21() {
        boolean[][] boolArray = new boolean[3][4];
        for (int i = 0; i < boolArray.length; i++) {
            for (int j = 0; j < boolArray[i].length; j++) {
                boolArray[i][j] = true;
            }
        }
    }

    // 1-4 : String 형 1차원 배열을 선언하고 길이는 50개 입니다. 모든 원소를 "empty" 로 설정하세요.
    public void chp22() {
        String[] strArray = new String[50];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "empty";
        }
    }

    //2번 : 0,1 로 이루어진 2차원 직사각형 배열이 있습니다. 0의 갯수와 1의 갯수를 출력하세요
    //입력 =>
    //int[][] intDemention2 = {
    //{0, 0, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}
    //, {0, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 1}
    //, {1, 0, 0, 0, 1, 0}
    //};
    //처리 => 반복문을 사용하세요
    //한줄에 출력 =>
    //0의 갯수는 ?개, 1의 갯수는 ?개.
    public void chp23() {
        int sum0 = 0;
        int sum1 = 0;
        int[][] intDemention2 = {
                {0, 0, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}
                , {0, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 1}
                , {1, 0, 0, 0, 1, 0}
        };
        for (int i = 0; i < intDemention2.length; i++) {
            for (int j = 0; j < intDemention2[i].length; j++) {
                if (intDemention2[i][j] == 0) {
                    sum0++;
                } else if (intDemention2[i][j] == 1) {
                    sum1++;
                }
            }
        }
        System.out.println("0의 개수는? " + sum0 + " 1의 개수는? " + sum1);
    }

    //3번 : 입력이 아래와 같을때 출력을 아래와 같이 만드세요
    //입력 =>
    //char[][] chInput = {
    //        {'*', '*', '*', '*', ' '},
    //        {'*', '*', ' ', ' ', ' '},
    //        {'*', ' ', '*', '*', '*'}
    //};
    //****
    //        **
    //        * ***
    //처리 => 반복문 사용하세요
    //출력 배열 =>
    //char[][] chOutput = {
    //{'*', '*', '*'},
    //{'*', '*', ' '},
    //{'*', ' ', '*'},
    //{'*', ' ', '*'},
    //{' ', ' ', '*'},
    //};
    //***
    //        **
    //        * *
    //        * *
    //        *
    public void chp24() {
        char[][] chInput = {
                {'*', '*', '*', '*', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', ' ', '*', '*', '*'}
        };
        char[][] chOutput = new char[chInput[0].length][chInput.length];
        for (int i = 0; i < chInput.length; i++) {
            for (int k = 0; k < chInput[i].length; k++) {
                chOutput[k][i] = chInput[i][k];
            }
        }
        for (int i = 0; i < chOutput.length; i++) {
            for (int k = 0; k < chOutput[i].length; k++) {
                System.out.print(chOutput[i][k] + " ");
            }
            System.out.println();
        }
    }

    public double[] chp25() {
        double[] dArray = new double[25];
        for (int i = 0; i < dArray.length; i++) {
            dArray[i] = Math.random() * 100;
            System.out.println("배열의 값: " + dArray[i]);
        }
        return dArray;
    }

    public int[] chp26(double[] dArray) {
        int sum = 0;
        int[] nArray = new int[25];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = (int) dArray[i];
            sum += nArray[i];
        }
        System.out.println("총합: " + sum);

        double average = (double) sum / nArray.length;
        System.out.println("평균: " + average);
        return nArray;
    }

    public void chp27(double[] dArray, int[] nArray) {
        String[] strArray = new String[25];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = dArray[i] + " => " + nArray[i];
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        int[] arr1 = new int[30];
        for (int i = 0; i < 30; i++) {
            arr1[i] = i;
        }
        System.out.print("arr1: " + Arrays.toString(strArray));
        System.out.print("\n");
    }
    public void chp29(int n) {
//		int n = 7; // 반드시 홀수여야 예쁘게 나옵니다.
            if (n % 2 == 0) {
                n++;
            }
            int mid = n / 2;

            int space = mid; // 시작 줄의 공백 개수 (2개)
            int star = 1;    // 시작 줄의 별 개수 (1개)

            char[][] chDiamond1 = new char[n][n];
            char[][] chDiamond2 = new char[n][n];
            for (int i = 0; i < chDiamond1.length; i++) {
                // 1. 공백 출력
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                    chDiamond1[i][j] = ' ';
                }
                // 2. 별 출력
                for (int j = 0; j < star; j++) {
                    System.out.print("*");
                    chDiamond1[i][j] = '*';
                }
                for (int col = 0; col < chDiamond2[i].length; col++) {
                    chDiamond2[i][col] = (Math.abs(mid - i) + Math.abs(mid - col) <= mid) ? '*' : ' ';
                }
                System.out.println(); // 줄바꿈

                // 3. 변수 조절 (중앙 이전까지는 별 늘리고, 이후엔 줄이기)
                if (i < mid) {
                    space -= 1; // 공백은 1개씩 감소
                    star += 2;  // 별은 2개씩 증가
                } else {
                    space += 1; // 공백은 1개씩 증가
                    star -= 2;  // 별은 2개씩 감소
                }
            }

            for (char[] chArr1 : chDiamond1) {
                for (char ch : chArr1) {
                    System.out.printf("%s", ch);
                }
                System.out.println();
            }

            for (char[] chArr1 : chDiamond2) {
                for (char ch : chArr1) {
                    System.out.printf("%s", ch);
                }
                System.out.println();
        }
    }
    public void chp30() {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }
    public void chp31() {
        int[] oldIntArray = {1, 2, 3};

        int[] newIntArray = new int[5];

        for(int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        for(int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
    public void chp32() {
        String[] oldStrArray = {"Java", "Array", "copy"};

        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
    public void chp33() {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for(int score: scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
    public void chp34(String[] args) {
            if (args.length != 2) {
                System.out.println("프로그램 입력값이 부족");
                System.exit(0);
            }
            String strNum1 = args[0];
            String strNum2 = args[1];

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            int result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
    }
    public void chp35() {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        if(today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
    public void chp36() {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(i > max) {
                max = array[i];
            }
        }
        System.out.println("최대값은: " + max);
    }
    public void chp37() {
        int sum = 0;
        int count = 0;
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                count++;
            }
        }
        double avg = (double) sum / count;

        System.out.println("전체 합: " + sum);
        System.out.println("평균: " + avg);
    }
    public void chp38() {
        Scanner s = new Scanner(System.in);
        boolean student  = true;
        int count = 2;
        int[] scores = null;
        int max = scores[0];
        int sum = 0;

        while(student) {
            System.out.println("--------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------");
            System.out.println("선택>");

            String strNum = s.nextLine();

            if(strNum.equals("1")) {
                count++;
                System.out.println("학생수>" + count);
            }
            else if (strNum.equals("2")) {
                System.out.println("선택> 2");
                int i = 0;
                while (i < scores.length) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = Integer.parseInt(s.nextLine());
                    i++;
                }
            }
            else if(strNum.equals("3")) {
                System.out.println("잔고>" + count);
            }
            else if(strNum.equals("4")) {
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }

                double avg = (double) sum / scores.length;
            } else if (strNum.equals("5")) {
                student = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}