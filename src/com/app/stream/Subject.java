package com.app.stream;

public class Subject {
    private String subjectName;
    private int marks;


    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
