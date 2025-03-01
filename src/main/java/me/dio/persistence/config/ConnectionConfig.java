package me.dio.persistence.config;


import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class ConnectionConfig {

    public static Connection getConnection() throws SQLException {
        var url = "jdbc:mysql://localhost/board_db";
        var user = "root";
        var password = "Di@2025";
        var connection = DriverManager.getConnection(url,user,password);
        connection.setAutoCommit(false);
        return connection;
    }
}
