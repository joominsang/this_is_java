package com.mjc813.report6;

import com.mjc813.report4.Keyboard;

import java.util.Scanner;

public class Report6Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Thread th = null;
        while (true) {
            String input = s.nextLine();
            if(th != null) {
                th.interrupt();
            }
            th = new Thread(new Keyboard(input));
            th.start();
        }
    }
}
