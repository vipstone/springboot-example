package com.hello.springboot.dao;

import com.hello.springboot.entity.UserLog;
import java.util.List;

public interface UserLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLog record);

    UserLog selectByPrimaryKey(Long id);

    List<UserLog> selectAll();

    int updateByPrimaryKey(UserLog record);
}