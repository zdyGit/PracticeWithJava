package com.zdy.springmybatis;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentMapperImp implements StudentMapper {

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    private SqlSessionTemplate sqlSessionTemplate;

    public Student getStudent(int id) {
        return sqlSessionTemplate.selectOne("com.zdy.springmybatis.StudentMapper.getStudentByID",id);
    }

    public void addStudent(Student stu) {

    }

    public void updateStudent(Student stu) {

    }

    public void delStudent(int id) {

    }
}
