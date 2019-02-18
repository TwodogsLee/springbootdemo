package com.example.springbootdemo.dao;

import com.example.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User selectUserByName(String name);

    User selectUserByAge(Integer age);
}
