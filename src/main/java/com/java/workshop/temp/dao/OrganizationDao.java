package com.java.workshop.temp.dao;

import org.h2.jdbcx.JdbcDataSource;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class OrganizationDao {
    public void createTable (){
        JdbcDataSource h2DataSource new JdbcDataSource();
        h2DataSource.setURL("jdbc:h2:mem:tempdatadb");
        h2DataSource.setUser("SA");
        try(Connection connection = h2DataSource.getConnection();
            Statement statement = dbConnection.createStatement()) {
            statement.execute("""
                    Create Table Organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    )""");
        } catch (SQLException sqlException) {
            System.out.println("Error creating table:"+ sqlException );
        }

    }
}