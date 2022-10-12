package online.restaurant.app;

import online.restaurant.Customer;
import online.restaurant.Order;
import online.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        //Creating Object for Customer Class
        Customer rahul = new Customer();
        rahul.setName("Rahul");
        rahul.setCity("Nagpur");
        rahul.setState("Maharashtra");
        rahul.setAddress("New Nandanwan, Nagpur");
        rahul.setEmailId("rahul123@gmail.com");
        rahul.setPhoneNumber(9687524680L);

        System.out.println("Customer Details: ");
        System.out.println("Name: "+rahul.getName());
        System.out.println("City: "+rahul.getCity());
        System.out.println("State: "+rahul.getState());
        System.out.println("Address: "+rahul.getAddress());
        System.out.println("Email Id: "+rahul.getEmailId());
        System.out.println("Phone Number: "+rahul.getPhoneNumber());

        //Creating Object for Vendor Class
        Vendor zomato = new Vendor();
        zomato.setName("Zomato Veg Restaurant");
        zomato.setCity("Nagpur");
        zomato.setState("Maharashtra");
        zomato.setAddress("Ajni square, Nagpur");
        zomato.setCategory("Veg");
        zomato.setEmailID("zomato123@gmail.com");
        zomato.setPhoneNumber(7539518524L);
        zomato.setRating(4.5);

        System.out.println();
        System.out.println("Vendor Details: ");
        System.out.println("Name: "+zomato.getName());
        System.out.println("City: "+zomato.getCity());
        System.out.println("State: "+zomato.getState());
        System.out.println("Address: "+zomato.getAddress());
        System.out.println("Category: "+zomato.getCategory());
        System.out.println("Email Id: "+zomato.getEmailID());
        System.out.println("Phone Number: "+zomato.getPhoneNumber());

        //Creating Object for Order Class
        Order order = new Order();
        order.setCustomer(rahul);
        order.setVendor(zomato);
        order.setTotalAmount(599.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("111, Civil Line, Nagpur");

        System.out.println();
        System.out.println("Order Details: ");
        System.out.println("Total Amount: "+order.getTotalAmount());
        System.out.println("Order Date: "+order.getOrderDate());
        System.out.println("Order Delivery Address: "+order.getDeliveryAddress());

    }
}
