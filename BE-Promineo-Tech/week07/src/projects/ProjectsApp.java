
// package com.week07;
package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

public class ProjectsApp {
    public static void main(String[] args) {
        Connection conn = DbConnection.getConnection();

    }
}

/*

IF THE PROGRAM IS HAVING TROUBLE CONNECTING WITH THE DATABASE:

Navigate to the Java Projects tab in the bottom left of VS Code.
Find Referenced Libraries
Press the "+" symbol
File Explorer will then open up.
Navigate to the mysql connector.

It should be located here
            v
C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.3.0

*/