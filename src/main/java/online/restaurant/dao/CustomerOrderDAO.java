package online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerOrderDAO {
    public static final String TABLE_NAME = "app_customer_order";
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
                    + " vendor_id bigint,"
                    + " customer_id bigint,"
                    + " total_amount decimal,"
                    + " order_date timestamp, "
                    + " status text, "
                    + " delivery_address text, "
                    + " CONSTRAINT app_customer_order_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query: " + query);
            stmt.executeUpdate(query);

          /*//SQL Queries
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            // 5. Traverse ResultSet (data)
            while(rs.next()){
                System.out.println("CustomerOrderID  = " + rs.getString("id"));
                System.out.println("VendorID  = " + rs.getString("vendor_id"));
                System.out.println("CustomerID  = " + rs.getString("customer_id"));
                System.out.println("Total Amount  = " + rs.getString("total_amount"));
                System.out.println("Order Date = " + rs.getString("order_date"));
                System.out.println("Status = " + rs.getString("status"));
                System.out.println("Delivery Address = " + rs.getString("delivery_address"));
                System.out.println();
            }
           */
            //Try Block End
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
