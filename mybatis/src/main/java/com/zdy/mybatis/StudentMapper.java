package com.zdy.mybatis;

import org.apache.ibatis.annotations.Select;

public interface StudentMapper {

    @Select("SELECT * FROM tb_Student t where t.stuID = #{id}")
    Student selectStudent(int id);

}
