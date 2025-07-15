package com.java.workshop.temp.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.java.workshop.temp.bin.Orgranaization;

public class OrganizationDao {
    public void createTable (Connection connection){
        try(Statement statement = connection.createStatement()) {
            statement.execute("""
                    Create Table Organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    ADDRESS VARCHAR(255))
                    """);
        } catch (SQLException sqlException) {
            System.out.println("Error creating table:"+ sqlException );
        }
    }

    public int save(Connection connection, Orgranaization vet){
        try (PreparedStatement preparedStatement = connection.prepareStatement("""
            insert into organization(name, website, email, contact_number, 
            registration_no, address) values(?,?,?,?,?,?)
        """)){
            preparedStatement.setString(1,vet.name());
            preparedStatement.setString(2,vet.website());
            preparedStatement.setString(3,vet.email());
            preparedStatement.setInt(4,vet.contactNumber());
            preparedStatement.setInt(5,vet.registrationNumber());
            preparedStatement.setString(6,vet.address());
            preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            System.out.println("Error inserting into table :"+ sqlException);
        }
        return 0;
    }
}