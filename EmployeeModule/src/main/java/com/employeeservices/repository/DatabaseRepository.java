package com.employeeservices.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseRepository {
    private static DatabaseRepository databaseRepository;

    private DatabaseRepository() {
        databaseRepository = null;
    }

    public static DatabaseRepository getInstance() {
        if (databaseRepository == null) {
            databaseRepository = new DatabaseRepository();
        }
        return databaseRepository;
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EMPLOYEES_DB", "root", "Pavan@970");
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
