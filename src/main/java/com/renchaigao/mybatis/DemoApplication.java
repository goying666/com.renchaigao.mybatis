package com.renchaigao.mybatis;

import com.renchaigao.mybatis.user.userMapper;
import com.renchaigao.mybatis.user.users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {
    private static SqlSessionFactory getSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        String resource = "mybatis-config.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
	public static void main(String[] args) {
		System.out.println("*************begin**************");
//        创建一个sql的会议，标准格式；
        SqlSession sqlSession = getSessionFactory().openSession();
        //创建pojo的接口类，并用sql会议赋值，标准格式；
        userMapper usmapper = sqlSession.getMapper(userMapper.class);

        users usersUse = new users();
        String[] strArg = new String[3];
        strArg[0]="a";
        strArg[1]="b";
        strArg[2]="c";
        usersUse.setAddress(strArg);
        usersUse.setNickname("pig");
        usmapper.addUser(usersUse);
        sqlSession.commit();

//		String[] testString = new String[3];
//		testString[0] = "0 is 0";
//		testString[1] = "1is 0";
//		testString[2] = "2 is 0";
//		String retString = "";
//		for (String i : testString){
//			retString = retString + i;
//		}
//		System.out.println("retString is : " + retString);
		System.out.println("*************end****************");
//
//		SpringApplication.run(DemoApplication.class, args);
	}
}
