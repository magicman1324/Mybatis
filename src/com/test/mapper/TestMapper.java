package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    List<User> selectAllUser();
    User selectUserById(int id);
    List<User>selectUserByAge(int id);
    User selectUserByIdAndAge(@Param("id") int id,@Param("age") int age);
}
