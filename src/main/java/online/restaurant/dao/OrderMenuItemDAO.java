package online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {

    public static final String TABLE_NAME = "app_order_menu_item";

    public void createTable() {
        try {
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
                    + " order_id bigint,"
                    + " quantity numeric,"
                    + " menu_item_name text,"
                    + " total_price decimal, "
                    + " status text, "
                    + " delivery_address text, "
                    + " CONSTRAINT app_order_menu_item_pk PRIMARY KEY (id))";

            System.out.println("Create Table Query: " + query);
            stmt.executeUpdate(query);

           /*//SQL Queries
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            // 5. Traverse ResultSet (data)
            while (rs.next()) {
                System.out.println("CustomerOrderID  = " + rs.getString("id"));
                System.out.println("OrderID  = " + rs.getString("order_id"));
                System.out.println("Quantity  = " + rs.getString("quantity"));
                System.out.println("Menu Item Name  = " + rs.getString("menu_item_name"));
                System.out.println("Total Price = " + rs.getString("total_price"));
                System.out.println();
            }
            */
            //Try Block End
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}