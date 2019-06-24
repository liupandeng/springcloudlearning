package com.xiaodeng.study.login.mapper;

import com.xiaodeng.study.login.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    @Results({
            @Result(property = "userName", column ="user_name",javaType = String.class)
    })
    User getUserById(Integer id);
}
