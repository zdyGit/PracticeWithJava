package com.zdy.annotation;

import java.util.List;

public class Teacher {
    private int techID;
    private String techName;
    private List<Student> studentList;

    public Teacher(){
        System.out.println("Teacher 构造函数");
    }

    public void setTechID(int techID) {
        this.techID = techID;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getTechID() {
        return techID;
    }

    public String getTechName() {
        return techName;
    }

    public void init(){
        System.out.println("Teacher init-method");
    };

}
