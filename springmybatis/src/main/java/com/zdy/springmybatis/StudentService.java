package com.zdy.springmybatis;

public class StudentService {

    private StudentMapper  studentMapper;

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student getStudent(int id){

        return studentMapper.getStudent(id);

    }

}
