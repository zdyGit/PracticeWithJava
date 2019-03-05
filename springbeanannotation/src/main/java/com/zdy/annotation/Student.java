package com.zdy.annotation;

public class Student {
    private int stuID;
    private String stuName;

    public Student(){
        System.out.println("Student 构造函数");
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }
}
