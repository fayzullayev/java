package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    public static Connection getConnection() throws SQLException {
        final String URL = "jdbc:postgresql://localhost:5432/postgres";
        final String USER = "postgres";
        final String PASSWORD = "1q2w3e4r";
        DriverManager.registerDriver(new org.postgresql.Driver());

        Properties props = new Properties();
        props.put("user", USER);
        props.put("password", PASSWORD);

        Connection conn = DriverManager.getConnection(URL, props);

        return conn;

    }
}
