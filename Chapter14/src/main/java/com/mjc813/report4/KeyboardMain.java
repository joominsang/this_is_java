package com.mjc813.report4;

import java.util.Scanner;

public class KeyboardMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Thread th = null;
		while(true) {
        String input = scanner.nextLine();
        if ( th != null ) {
            th.interrupt();
        }
        th = new Thread(new Keyboard(input));
        th.start();
        }
    }
}
