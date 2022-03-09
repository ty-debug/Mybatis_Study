package com.zjh.dao;

import com.zjh.bean.User;
import com.zjh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int addUser = mapper.addUser(new User(4, "测试1", "123123123"));
//        增删改必须提交事务
        sqlSession.commit();

        System.out.println(addUser);

//        根据id查找
//        User userById = mapper.getUserById(1);
//        System.out.println(userById);

//        查询表信息
//        List<User> userList = mapper.getUserList();
//        for (User user : userList) {
//            System.out.println(user);
//        }
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int updateUser = mapper.updateUser(new User(4, "更新1", "123111"));
        sqlSession.commit();
        System.out.println(updateUser);
        sqlSession.close();

    }
    @Test
    public void SearchUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();

    }

}
