package com.mjc813.chapter07;

public class StudentSubject {
    public Student student;
    public Subject subject;
    public int score;
    public String grade;

    public StudentSubject(int score, String grade) {
        Student student;
        Subject subject;
        this.score = score;
        this.grade = grade;
    }
}
