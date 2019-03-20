package com.zdy.springmybatis;

public interface StudentMapper {
    Student getStudent(int id);
    void addStudent(Student stu);
    void updateStudent(Student stu);
    void delStudent(int id);
}
