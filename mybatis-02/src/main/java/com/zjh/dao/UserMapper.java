package com.zjh.dao;

import com.zjh.bean.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserById(int id);

    List<User> getUserByLimit(Map<String, Integer> map);

}
