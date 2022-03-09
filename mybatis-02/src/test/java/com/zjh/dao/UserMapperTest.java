package com.zjh.dao;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.zjh.bean.User;
import com.zjh.utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void SearchUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserById(1);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> list = mapper.getUserByLimit(map);
        for (User user : list) {
            System.out.println(user);
        }

        sqlSession.close();

    }

}
