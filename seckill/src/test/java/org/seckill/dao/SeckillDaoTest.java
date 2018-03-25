package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void queryById() {
        long id = 1001;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }
    @Test
    public void queryAll() {
        List<Seckill> list = seckillDao.queryAll(0,100);
        for(Seckill seckill:list){
            System.out.println(seckill);
        }
    }
    @Test
    public void reduceNumber(){
        int res = seckillDao.reduceNumber(1000L,new Date());
        System.out.println(res);
        System.out.println(seckillDao.queryById(1000).getNumber());
    }
//    @Test
//    public void jdbcConnection() {
//        System.out.println("成功启动测试！");
//        /**
//         * 测试JDBC连接mysql
//         */
//        Connection conn = null;
//        String sql;
//        String url = "jdbc:mysql://localhost:3306/seckill?"
//                +"user=root&password=123456&useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");// 动态加载mysql驱动
//            System.out.println("成功加载MySQL驱动程序");
//            conn = DriverManager.getConnection(url);
//            Statement stmt = conn.createStatement();
//            sql = "select * from seckill";
//            boolean result = stmt.execute(sql);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//

}