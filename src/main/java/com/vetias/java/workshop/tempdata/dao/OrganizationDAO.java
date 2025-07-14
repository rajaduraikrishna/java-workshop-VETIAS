package com.vetias.java.workshop.tempdata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import org.h2.jdbcx.JdbcDataSource;
import com.vetias.java.workshop.tempdata.beans.Organaization;
public class OrganizationDAO {


    public void createTable(Connection dbConnection) {

        try(Statement statement = dbConnection.createStatement()) {
                statement.execute(""" 
                    create table organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    DESCRIPTION VARCHAR(255))
                """);
            } catch (SQLException sqlException) {
                System.out.println("Error Creating table : " + sqlException);
            }
    }


    public int save(Connection dbConnection, Organaization vet) {
            
        try( PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            insert into organization(name, website, email, contact_number, 
            registration_no, description) 
            values(?,?,?,?,?,?)
            """)) {
                preparedStatement.setString(1, vet.name());
                preparedStatement.setString(2, vet.website());
                preparedStatement.setString(3, vet.email());
                preparedStatement.setString(4, vet.contactNumber());
                preparedStatement.setLong(5, vet.registrationNumber() );
                preparedStatement.setString(6, vet.description());
                preparedStatement.executeUpdate();
  
    }catch (SQLException sqlException) {
        System.out.println("Error inserting into table :" + sqlException);
    }
    return 0;
}
}
