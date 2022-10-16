package com.example.demo;

import java.sql.*;

public class MysqlTest {
	 	 
	// MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/d311_study";
	 
    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    //static final String DB_URL = "jdbc:mysql://localhost:3306/d311_study?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	 
	 
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "123456";
	 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
        
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
	        
            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT user_id, user_name, sex, pwd FROM t_user_info";
            ResultSet rs = stmt.executeQuery(sql);
        
            // 展开结果集数据库
	            while(rs.next()){
                // 通过字段检索
                int user_id  = rs.getInt("user_id");
                String user_name = rs.getString("user_name");
                String sex = rs.getString("sex");
                String pwd = rs.getString("pwd");
    
                // 输出数据
                System.out.print("ID: " + user_id);
                System.out.print(", 姓名: " + user_name);
                System.out.print(", 性别: " + sex);
                System.out.print(", 密码: " + pwd);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
