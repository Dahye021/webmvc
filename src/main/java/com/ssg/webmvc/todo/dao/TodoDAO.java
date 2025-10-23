package com.ssg.webmvc.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDAO {
    public String getTime(){
        String now = null;

        try(
                Connection connection = ConnectionUtil.INSTANCE.getConnection();
                PreparedStatement pstmt = connection.prepareStatement("select now()");
                ResultSet rs = pstmt.executeQuery();
            ){
                rs.next();
                now = rs.getString(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        return now;
    }
}
