package com.vetias.java.workshop.tempdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.vetias.java.workshop.tempdata.beans.Organaization;
import com.vetias.java.workshop.tempdata.dao.OrganizationDAO;

public class JDBCExample {

    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection = 
        DriverManager.getConnection(
            "jdbc:h2:mem:tempdataDB", "sa", null); 
        } catch (SQLException sqlException) {
            System.out.println("Error Creating table : " + sqlException);
        }
        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organaization vet = new Organaization("VET", 
        "Vellalar Educational Trust:", 
        "www.vet.com", 
        "contact@vet.com", 
        "+91-923847234", 
        12312324L, null);
        organizationDAO.save(dbConnection,vet);
        Organaization myOrganaization = organizationDAO.findByName(dbConnection, "VET");
        System.out.println("My Organization is :" + myOrganaization);

    }
}
