package com.kozka.hospitaldepartmentservlet.services;

import com.kozka.hospitaldepartmentservlet.GlobalConsts;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Kozka Ivan
 */
public class ConnectionPool {

    private static Connection instance = null;

    public static Connection getConnection() {
        if (instance == null) {
            try {
                Class.forName("org.postgresql.Driver");
                instance = DriverManager.getConnection(
                        GlobalConsts.USER,
                        GlobalConsts.PASSWORD,
                        GlobalConsts.URL
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return instance;
    }

}
