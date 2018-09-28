package main;


import connection.ConnectionFactory;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
         Connection connection = ConnectionFactory.getConnection();

    }
}
