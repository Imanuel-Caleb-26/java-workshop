package com.java.workshop.temp.dao;

import java.sql.Connection;

public class JDBCDAOApplication {
        public static void main(String[] args) {
        OrganizationDao organizationDao = new OrganizationDao();
        organizationDao.createTable();

     }
}
