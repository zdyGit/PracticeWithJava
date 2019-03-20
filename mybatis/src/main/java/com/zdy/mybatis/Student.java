package com.zdy.mybatis;

public class Student {
    private int stuID;
    private String stuName;
    private int stuAge;

    public Student(){}

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString(){
        String str = String.format("stuID:%d,stuName:%s,stuAge:%d",this.getStuID(),this.getStuName(),this.getStuAge());
        return str;
    }
}
