package com.zjh.dao;


import com.zjh.bean.User;
import com.zjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void SearchUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserById();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();

    }


}
