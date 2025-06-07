//https://www.tutorialspoint.com/jdbc/jdbc-data-types.htm
//https://www.tutorialspoint.com/jdbc/jdbc-data-types.htm
//https://www.tutorialspoint.com/jdbc/viewing-result-sets.htm
//https://www.tutorialspoint.com/jdbc/updating-result-sets.htm

package org.example;


import com.sun.net.httpserver.HttpServer;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String query = "SELECT * FROM users";

        try (
                Connection conn = DB.getConnection();
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet result = stmt.executeQuery(query);
        ) {


            result.last();

            int id = result.getInt("id");
            String name = result.getString("username");

            System.out.println(id + " " + name);

            result.first();

            id = result.getInt("id");
            name = result.getString("username");

            System.out.println(id + " " + name);

            result.next();

            id = result.getInt("id");
            name = result.getString("username");

            System.out.println(id + " " + name);

            result.first();
            result.absolute(6);

            id = result.getInt("id");
            name = result.getString("username");

            System.out.println(id + " " + name);
            result.next();

            result.absolute(-6);

            id = result.getInt("id");
            name = result.getString("username");

            System.out.println(id + " " + name);


        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }

    }
}