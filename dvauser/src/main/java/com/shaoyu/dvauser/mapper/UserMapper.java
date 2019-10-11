package com.shaoyu.dvauser.mapper;

import com.shaoyu.dvauser.DO.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/9/22
 */

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User selete(Long id);

    @Select("delete from user where id = #{id}")
    Integer delete(Long id);

    @Update("update user set name=#{name}, website=#{website}, email=#{email} where id = #{id}")
    Integer update(User user);

    @Insert("insert into user (name, website,email) values(#{name}, #{website},#{email})")
    Integer insert(User user);

    @Select("select * from user")
    List<User> list();
}
