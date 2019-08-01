package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Ignore
public class DbManagerTestSuite {

    @Before
    public void before(){
        System.out.println("Starting new test case:");
    }
    @Test
    public void testConnect() throws SQLException {
        //Given
        // When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
        System.out.println("Connection ok!!!");
    }

    @Test
    public void testSelectUsers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }


    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT U.ID,U.FIRSTNAME,U.LASTNAME,I.NAME,COUNT(*)AS ISSUE_QUANTITY\n" +
                "FROM USERS U JOIN ISSUES I ON I. USER_ID_ASSIGNEDTO= U.ID\n" +
                "GROUP BY U.ID\n" +
                "HAVING COUNT(*) > 2" +" "
                ;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(  +rs.getInt("U.ID")+", "  +rs.getString("U.FIRSTNAME") + ", "+
                    rs.getString("U.LASTNAME")+ ", " +
                   rs.getString("ISSUE_QUANTITY"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(4, counter);

    }
}

