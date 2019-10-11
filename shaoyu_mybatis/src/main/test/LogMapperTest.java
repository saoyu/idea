package test;

import domain.Log;
import mapper.LogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LogMapperTest {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();


        /*
            用getMapper获取接口

         */

		LogMapper logMapper = session.getMapper(LogMapper.class);
		List<Log> list = logMapper.selAll();
		for (Log log : list) {
			System.out.println(log);
		}


//        LogMapper logMapper = session.getMapper(LogMapper.class);
//        List<Log> list = logMapper.selByAccInAccout("3", "1");
//        for (Log log : list) {
//            System.out.println(log);
//        }

        session.close();
        System.out.println("程序执行结束");
    }

}
