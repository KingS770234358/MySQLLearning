package com.wq.demo1;

import java.sql.*;

/***
 * 第一个JDBC程序
 */
public class jdbcFirstDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); // 固定写法,加载驱动
        // 2.使用用户信息和url获得数据库连接对象
        String url = "jdbc:mysql://localhost:3306/school?useSSL=true&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,username,password);
        // 3.连接成功后,获得执行SQL语句的对象
        Statement statement = connection.createStatement();
        // 4.执行SQL语句 得到返回的结果集
        String Sql = "select * from subject";
        ResultSet resultSet = statement.executeQuery(Sql);
        while(resultSet.next()){
            System.out.println("subject id" + resultSet.getObject("id"));
            System.out.println("subject name" + resultSet.getObject("subjectName"));
        }
        // 5.关闭数据库,释放连接 先开的后关
        resultSet.close();
        statement.close();
        connection.close();
    }

}
