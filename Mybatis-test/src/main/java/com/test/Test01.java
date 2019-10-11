package com.test;

import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.ClassPath;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) {

        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();

            User user = session.selectOne("com.mapper.UserMapper.selectById", 1);

            if (user!=null){
                System.out.println(user.toString());
            }

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
