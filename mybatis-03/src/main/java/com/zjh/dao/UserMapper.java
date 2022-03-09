package com.zjh.dao;

import com.zjh.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM mybatis_test.user")
    List<User> getUserById();


}
