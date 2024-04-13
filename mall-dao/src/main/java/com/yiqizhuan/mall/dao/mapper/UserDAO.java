package com.yiqizhuan.mall.dao.mapper;

import com.yiqizhuan.mall.dao.model.UserExample;
import com.yiqizhuan.mall.dao.model.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}