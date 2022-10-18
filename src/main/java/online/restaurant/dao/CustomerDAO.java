package online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "app_customer";
    public void createTable(){
        try{
            // 1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");

            // 2. Establish Connection with your local database
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "Pssql@#02891");
            // 3. Create Statement Object
            Statement stmt = con.createStatement();

            // 4. Execute Query (Statement)
            // TODO - Create table query
            // TODO - Change query - For demonstration we have used SELECT query

            //Dynamically Table Creation
            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL,"
                    + " name text,"
                    + " address text, "
                    + " phone_number bigint, "
                    + " city text, "
                    + " state text, "
                    + " email_id text, "
                    + " CONSTRAINT app_customer_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query: " + query);
            stmt.executeUpdate(query);

          /*//SQL Queries
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            // 5. Traverse ResultSet (data)
            while(rs.next()){
                System.out.println("CustomerID  = " + rs.getString("id"));
                System.out.println("Name  = " + rs.getString("name"));
                System.out.println("Address  = " + rs.getString("address"));
                System.out.println("Phone Number = " + rs.getString("phone_number"));
                System.out.println("City = " + rs.getString("city"));
                System.out.println("State  = " + rs.getString("state"));
                System.out.println("Email ID  = " + rs.getString("email_id"));
                System.out.println();
            }
           */
        //Try Block End
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
