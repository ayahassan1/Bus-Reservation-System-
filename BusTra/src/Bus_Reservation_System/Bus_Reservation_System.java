package Bus_Reservation_System;

import Trip.*;
import Person.*;
import Bus.*;
import GUI.Login_form;
import customers_trips.*;
import mySQL.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import buses_trips.buses_trips;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

    public class Bus_Reservation_System {
    public static Driver current_driver;
    public static Customer current_customer;
    public static Admin current_admin;
  public static buses_trips current_busTrips;
  public static boolean current_Person_reset_password=true;
    
public static ArrayList <Customer>  Customer_list = new ArrayList();
public static ArrayList <Trip> Trip_list = new ArrayList();
public static ArrayList <Bus> Bus_list= new ArrayList();
public static ArrayList <customers_trips>  Customer_trips_list = new ArrayList();
public static ArrayList <buses_trips> Buses_trips = new ArrayList();
        
    static Connection c;
    static Statement s;
    static String query;
   static ResultSet r ;
   
 public static String dateformating(){
        Date d = new Date();
    SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
       String date = dateform.format(d);
       return  date;
   }     
 public static String Timeformating(){
     Date d = new Date();
      SimpleDateFormat dateform = new SimpleDateFormat("HH:mm");
       String time = dateform.format(d);
       return  time;
 }
 
 public static void upload_customers_data()
 {
     Sec c1 = new Sec();        
        try {
            c = c1.connect();
            s = c.createStatement();   
            
             for (int i=0 ; i<Customer_list.size();i++){
        
            query="INSERT INTO customers VALUES ('"+Customer_list.get(i).getName()+"','"+Customer_list.get(i).getAge()+"','"
                    +Customer_list.get(i).getNationalID()+"','"+Customer_list.get(i).getGender()+"','"+Customer_list.get(i).getPosition()+"','"+Customer_list.get(i).getEmail()+"','"
                 + Customer_list.get(i).getUsername()+"','"+Customer_list.get(i).getPassword()+"','"+Customer_list.get(i).getPhone()+"','"+
                         Customer_list.get(i).getVISAnumber()+"','"+Customer_list.get(i).getVISApassword()+"')";
        
        }
         s.execute(query);
            
              } catch (SQLException ex)
              {
            System.out.println(ex.getMessage());
               }

     finally 
        {
            try {
                c.close();
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            
           }
    
    }
 }
 
      public static void upload_customers_trips_data()
   {
       Sec c1 = new Sec();        
        try {
            c = c1.connect();
            s = c.createStatement();   
                   // write in database new values only automatically from list
     for (int i=0 ; i<Customer_trips_list.size();i++){
            query="INSERT INTO customers_trips VALUES ('"+Customer_trips_list.get(i).getUserName()+"','"+Customer_trips_list.get(i).getTotal_Cost_Customer()+"','"
                    +Customer_trips_list.get(i).getTrip_customer().getCode()+"','"+Customer_trips_list.get(i).getTrip_customer().getPickUp()
                    +"','"+Customer_trips_list.get(i).getTrip_customer().getPickUpDate()+"','"+
                    Customer_trips_list.get(i).getTrip_customer().getPickUpTime()+"','"
                 + Customer_trips_list.get(i).getTrip_customer().getDestination()+"','"+Customer_trips_list.get(i).getTrip_customer().getarrivalDate()+
                    "','"+Customer_trips_list.get(i).getTrip_customer().getArrivalTime()+"','"+
                         Customer_trips_list.get(i).getTrip_customer().getCost()+"','"+Customer_trips_list.get(i).getTrip_customer().getStatus()+"','"+
                    Customer_trips_list.get(i).getSeatCode()+"')";
     }
         s.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     finally 
        {
            try {
                c.close();
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            
           }
    }
   }
   public static void upload_buses_data()
   {
       Sec c1 = new Sec();        
        try {
            c = c1.connect();
            s = c.createStatement();   
              for(int i = 0 ; i < Bus_list.size() ; i++)
          {
              int isClassic = 0;
              if (Bus_list.get(i) instanceof Classic)
              {
                  isClassic = 1;
              }
              int status = 0;
              if(Bus_list.get(i).getBusDriver().isStatus()==true)
              {
                  status = 1;
              }
               query="INSERT INTO buses VALUES ('"+Bus_list.get(i).getPlateNum()+"','"+isClassic
                       +"','"+Bus_list.get(i).getBusDriver().getName()+"','"+Bus_list.get(i).getBusDriver().getAge()
                       +"','"+Bus_list.get(i).getBusDriver().getNationalID()+"','"+Bus_list.get(i).getBusDriver().getGender()
                       +"','"+Bus_list.get(i).getBusDriver().getPosition()+"','"+Bus_list.get(i).getBusDriver().getEmail()
                        +"','"+Bus_list.get(i).getBusDriver().getUsername()+"','"+Bus_list.get(i).getBusDriver().getPassword()
                        +"','"+status+"')";
          }
         s.execute(query);
      } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

     finally 
        {
            try {
                c.close();
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            
           }
    
    }
   }
 
   public static void upload_trips_data()
   {
       Sec c1 = new Sec();        
        try {
            c = c1.connect();
            s = c.createStatement();   
          for(int i = 0 ; i < Trip_list.size() ; i++)
          {
               query="INSERT INTO trips VALUES ('"+Trip_list.get(i).getCode()+"','"+Trip_list.get(i).getPickUp()
                       +"','"+Trip_list.get(i).getPickUpDate()+"','"+Trip_list.get(i).getPickUpTime()
                       +"','"+Trip_list.get(i).getDestination()+"','"+Trip_list.get(i).getarrivalDate()
                       +"','"+Trip_list.get(i).getArrivalTime()+"','"+Trip_list.get(i).getTripBus().getPlateNum()
                       +"','"+Trip_list.get(i).getAvailableSeatsNum()+"','"+Trip_list.get(i).getCost()
                       +"','"+Trip_list.get(i).getStatus()+"','"+Trip_list.get(i).getSeat_code()+"')";                
          }
          s.execute(query);
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

     finally 
        {
            try {
                c.close();
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            
           }
    }
   }
 
   public static void load_data()
   {
        Sec c1 = new Sec();        
        try {
         c = c1.connect();
         s = c.createStatement();   
         
       query = "select * from customers";
         r = s.executeQuery(query);
        while (r.next())
          {
              Customer_list.add(new Customer(r.getString("name"),r.getInt("age"),r.getLong("nationalID"),r.getString("gender"), r.getString("position"),r.getString("email"),
              r.getString("username"),r.getString("password"),r.getString("phone"),r.getString("VISAnum"),
                      r.getString("VISApassword")));
          }
        
         query = "select * from customers_trips";
         r = s.executeQuery(query);
        while (r.next())
          {										
              Customer_trips_list.add(new customers_trips(r.getString("username"),r.getInt("Total_Cost_Customer"),r.getString("code"),r.getString("pickup"), r.getString("pickupDate"),r.getString("pickupTime"),
              r.getString("destination"),r.getString("arrivalDate"),r.getString("arrivalTime"),r.getInt("Cost_Seat"),
                      r.getString("status"),r.getString("seat_code")));
          }
        
         query = "select * from  buses";
         r = s.executeQuery(query);
          while (r.next())
          {
         Driver bus_driver = new Driver(r.getString("driver_name"),r.getInt("driver_age"),r.getLong("driver_nationalID"),r.getString("driver_gender"),
         r.getString("driver_position"),r.getString("driver_email"),r.getString("driver_username"),r.getString("driver_password"),r.getBoolean("status"));
         if(r.getBoolean("isClassic") == true)
         {        										
              Bus_list.add(new Classic(r.getString("BusPlateNum"),bus_driver));          
         }
         else 
             
         {
             Bus_list.add(new Elite(r.getString("BusPlateNum"),bus_driver));
         }
          }
           query = "select * from  trips";
         r = s.executeQuery(query);
          while (r.next())
          {  
              Bus trip_bus;
              for(int i = 0 ; i < Bus_list.size() ; i++)
              {
                   if(r.getString("BusPlateNum").equals(Bus_list.get(i).getPlateNum()))
                   { 
                       trip_bus = Bus_list.get(i);
                    Trip_list.add(new Trip(r.getString("Code"),r.getString("pickUp"),
                            r.getString("pickupDate"),r.getString("pickupTime"),
                            r.getString("destination"),r.getString("arrivalDate"),
                            r.getString("arrivalTime"),r.getInt("AvailableSeatsNum"),
                            trip_bus,
                            r.getInt("costPERseat"),r.getString("Status"),r.getString("seat_code")));
                             break;
                   }
                   }
              
              }
        }
      catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     finally 
        {
            try {
                c.close();
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            
           }
    
    }
        
       for(int i = 0 ; i < Bus_list.size() ; i++)
        {
            Buses_trips.add(new buses_trips(Bus_list.get(i)));
        }
        
   }
   
   
    public static void main(String[] args)  {
            load_data(); 
  
            Login_form login = new Login_form();
           login.setVisible(true);
     
    }
}