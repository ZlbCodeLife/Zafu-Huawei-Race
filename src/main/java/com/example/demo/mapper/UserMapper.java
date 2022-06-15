package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from sys_user")
    List<User> findAll();

    Integer insert(User user);

    Integer update(User user);

    @Delete("delete from sys_user where id=#{id}")
    Integer delete(Integer id);
}
