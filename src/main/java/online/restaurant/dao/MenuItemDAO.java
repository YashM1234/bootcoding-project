package online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME = "app_menu_item";
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
                    + " ( id bigint NOT NULL, "
                    + " vendor_id bigint, "
                    + " menu_item_name text, "
                    + " price decimal, "
                    + " category text, "
                    + " CONSTRAINT app_menu_item_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query: " + query);
            stmt.executeUpdate(query);

          /*//SQL Queries
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            // 5. Traverse ResultSet (data)
            while(rs.next()){
                System.out.println("MenuItemID  = " + rs.getString("id"));
                System.out.println("VendorID  = " + rs.getString("order_id"));
                System.out.println("Menu Item Name  = " + rs.getString("quantity"));
                System.out.println("Is Veg  = " + rs.getString("is_veg"));
                System.out.println("Category = " + rs.getString("category"));
                System.out.println("Price = " + rs.getString("price"));
                System.out.println();
            }
           */
            //Try Block End
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
