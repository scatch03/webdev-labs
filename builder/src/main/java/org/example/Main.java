package org.example;

import org.example.implementation.MySQLBuilder;
import org.example.implementation.PostgreSQLBuilder;
import org.example.implementation.QueryDirector;

public class Main {
    public static void main(String[] args) {
        final QueryDirector director = new QueryDirector();

        final String mySqlQuery = director.getSql(new MySQLBuilder());
        final String postgreSqlQuery = director.getSql(new PostgreSQLBuilder());
    }
}
