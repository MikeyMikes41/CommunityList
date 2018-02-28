/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseLibrary;

import java.sql.*;

/**
 *
 * @author Toffer
 */
public class JavaDataBaseExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection myConn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/DataBaseName", "dbAdmin", "adminPass");
            
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("select * from public.\"TableNames\"");
            
            while(myRs.next()){
                System.out.println(myRs.getString("Task"));
            }
        }catch(Exception e){
            
        }
    }
    
}
