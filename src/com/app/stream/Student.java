package com.app.stream;

import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private List<Subject> subjects;

    public Student(int studentId,String studentName, List<Subject> subjects){
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects= subjects;
    }


    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
