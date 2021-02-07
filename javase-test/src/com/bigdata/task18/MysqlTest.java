package com.bigdata.task18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlTest {
    public static void main(String[] args)  throws Exception{
        //1.注册驱动 (可以省略)
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.获取连接 connection连接对象
        String url = "jdbc:mysql://192.168.0.103:3306/test?characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(url, "root", "root123");

        //打印 连接对象 com.mysql.jdbc.JDBC4Connection@7c729a55
        //System.out.println(con);

        //3.获取语句执行平台 Statement
        Statement statement = con.createStatement();

        //3.1 通过 statement对象的 executeUpdate 方法 创建一张表
        //String sql = "create table test(id int,name varchar(20),age int);";
        //String sql = "desc /*description table test*/ test.test;";
        Thread.sleep(10000);
        String sql = "SELECT * /*description table test*/ FROM test;";
        ResultSet  rs = statement.executeQuery(sql);
        //int i = statement.executeUpdate(sql); // 返回值是int类型 表示受影响的行数
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");

            System.out.println("id is " + id);
            System.out.println("name is " + name);
            System.out.println("age is " + age);

        }
      // System.out.println(i);

        //4.关闭流
        statement.close();
        con.close();
    }
}
