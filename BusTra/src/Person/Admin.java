package Person;
import Person.*;
import Trip.Trip;
import Bus_Reservation_System.*;
import Bus.*;
import customers_trips.*;
import java.util.Date;
import static Bus_Reservation_System.Bus_Reservation_System.*;
import javax.mail.*;
import buses_trips.buses_trips;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import mySQL.Sec;
/*https://www.yahoo.com/settings/security/lesssecureapps*/
public class Admin extends Person {
 private  String  l_date,l_Time;
private  boolean x=false;
public ArrayList<Trip> suit_trips;  
public ArrayList<Trip> view_Upcoming;
public ArrayList<Trip> view_Running;
public ArrayList<Trip>view_Done;
public ArrayList<customers_trips> view_customer_upcoming;
public ArrayList<customers_trips> history_trips_ForCurrentCustomer;

private final String admin_name = "System";
private final String admin_password= "admin123";
private final long admin_nationalID = 2994544;
private final int admin_age = 20;
private final String admin_gender = "female";
private final String admin_position = "Cairo";
private final String admin_username = "Admin";
private final String admin_email = "BusTra@gmail.com";
private  Bus available_Driver;
 
  public  Admin(){
  
      super.setName(admin_name);
      super.setNationalID(admin_nationalID);
      super.setAge(admin_age);
      super.setEmail(admin_email);
      super.setGender(admin_gender);
      super.setPosition(admin_position);
      super.setUsername(admin_username);
      super.setPassword(admin_password);  
      l_date = dateformating();
    l_Time = Timeformating();  
 
  }
  
  
      @Override
     public boolean login(String username , String password){
    if( username.equalsIgnoreCase(this.getUsername())&& password.equalsIgnoreCase(this.getPassword()))
    { 
        current_admin = this;
         return true;
     }   
    else return false;
     }
       
   public ArrayList current_customer_suitable_trips()
   {
      suit_trips  = new ArrayList();
         for (int i=0 ; i < Trip_list.size() ; i++){
                 if ((Trip_list.get(i).getPickUp().equalsIgnoreCase(current_customer.getPosition()))&&(Trip_list.get(i).getStatus().equalsIgnoreCase("Upcoming"))){
                          suit_trips.add(Trip_list.get(i));
                       }
             }
         return suit_trips;
     }    public void Change_TripStatus() {
      try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;
      
     String L_date[]=l_date.split("/");
   String L_Time[]=l_Time.split(":"); 
      for (int i=0 ; i< Trip_list.size(); i++){
         
            String E_Date []=   Trip_list.get(i).getarrivalDate().split("/");
           String E_Time [] =  Trip_list.get(i).getarrivalTime().split(":");
             
           if(Integer.valueOf(E_Date[2]).equals(Integer.valueOf(L_date[2])) && Integer.valueOf(E_Date[1])<Integer.valueOf(L_date[1])){
                Trip_list.get(i).setStatus("Done");
                             query = "update trips set Status = 'Done' where code= '"+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
           }
           else if(Integer.valueOf(E_Date[2]).equals(Integer.valueOf(L_date[2]))&&Integer.valueOf(E_Date[1]).equals(Integer.valueOf(L_date[1]))
                   &&Integer.valueOf(E_Date[0])<Integer.valueOf(L_date[0])){
               Trip_list.get(i).setStatus("Done");
                             query = "update trips set Status = 'Done' where code= '"+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
           }
           else if (Integer.valueOf(E_Date[2])<Integer.valueOf(L_date[2])){
               Trip_list.get(i).setStatus("Done");
                             query = "update trips set Status = 'Done' where code= '"+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
           }
           else if(Integer.valueOf(E_Date[2]).equals(Integer.valueOf(L_date[2]))&&Integer.valueOf(E_Date[1]).equals(Integer.valueOf(L_date[1]))
                   &&Integer.valueOf(E_Date[0]).equals(Integer.valueOf(L_date[0]))){
                     if(Integer.valueOf(E_Time[0])<Integer.valueOf(L_Time[0])){
                          Trip_list.get(i).setStatus("Done");
                             query = "update trips set Status = 'Done' where code= '"+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                     }      
                     else if(Integer.valueOf(E_Time[0]).equals(Integer.valueOf(L_Time[0]))&&Integer.valueOf(E_Time[1])<=Integer.valueOf(L_Time[1])){
                          Trip_list.get(i).setStatus("Done");
                             query = "update trips set Status = 'Done' where code= '"+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                     }
           }
         
              }
       c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }  
  }// updated
  public void set_running_trips(){
   
           try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;
     String L_date[]=l_date.split("/");
   String L_Time[]=l_Time.split(":"); 
      for(int i=0 ; i< Trip_list.size(); i++){
           String S_Date []=Trip_list.get(i).getPickUpDate().split("/");
            String E_Date []=Trip_list.get(i).getArrivalDate().split("/");
           String S_Time [] =  Trip_list.get(i).getPickUpTime().split(":");
             String E_Time []=Trip_list.get(i).getarrivalTime().split("/");
             if((Integer.valueOf(S_Date[2])==Integer.valueOf(L_date[2])&&
                     Integer.valueOf(S_Date[1])==Integer.valueOf(L_date[1])
                     &&Integer.valueOf(S_Date[0])==Integer.valueOf(L_date[0]))||
                     (Integer.valueOf(E_Date[2])==Integer.valueOf(L_date[2])&&
                     Integer.valueOf(E_Date[1])==Integer.valueOf(L_date[1])
                     &&Integer.valueOf(E_Date[0])==Integer.valueOf(L_date[0])))
             {
                 if(Integer.valueOf(S_Date[0])==Integer.valueOf(E_Date[0])){
                    if(Integer.valueOf(S_Time[0])==Integer.valueOf(L_Time[0])&&Integer.valueOf(S_Time[1])<=Integer.valueOf(L_Time[1])) {
                         if((Integer.valueOf(E_Time[0])>Integer.valueOf(L_Time[0]))||(Integer.valueOf(E_Time[0])==Integer.valueOf(L_Time[0])&&
                             Integer.valueOf(E_Time[1])>Integer.valueOf(L_Time[1]))){
                        Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                         }
                    }  
                    else if(Integer.valueOf(S_Time[0])<Integer.valueOf(L_Time[0])){
                     if( Integer.valueOf(E_Time[0])>Integer.valueOf(L_Time[0])){
                         
                     Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                    }
                     else if(Integer.valueOf(E_Time[0])==Integer.valueOf(L_Time[0])&&
                             Integer.valueOf(E_Time[1])>Integer.valueOf(L_Time[1])){
                          Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                     }
                    }
                  }
                 else if (Integer.valueOf(S_Date[0])!=Integer.valueOf(E_Date[0])){
                     if(Integer.valueOf(S_Date[0])==Integer.valueOf(L_date[0])){
                         if(Integer.valueOf(S_Time[0])==Integer.valueOf(L_Time[0])&&
                                 Integer.valueOf(S_Time[1])<=Integer.valueOf(L_Time[1])){
                              Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                         }
                         else if (Integer.valueOf(S_Time[0])<Integer.valueOf(L_Time[0])){
                              Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                         }
                     }
                     else if(Integer.valueOf(E_Date[0])==Integer.valueOf(L_date[0])){
                              if (Integer.valueOf(E_Time[0])==Integer.valueOf(L_Time[0])&&
                                 Integer.valueOf(E_Time[1])>Integer.valueOf(L_Time[1])){
                                   Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                              }       
                              else if (Integer.valueOf(E_Time[0])>Integer.valueOf(L_Time[0])){
                                    Trip_list.get(i).setStatus("Running");
                     query = "update trips set Status = 'Running' where code=' "+Trip_list.get(i).getCode()+" ' ";
                             s.execute(query);
                              }
                     }
                 }
      }
      }
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }  
  }//updated
  
 //driver checks
  
    
  public boolean check_Username_for_driver(String user_name){
         load_data();
         for (int i=0;i<Bus_list.size();i++){
             if(user_name.equals(Bus_list.get(i).getBusDriver().getUsername()))
             {
                 return false;      
             }
         
         }
     return true;
     }
   public int check_driver_username(String username)
 {
     if(username.length()<=2)
     {
         return 1;
     }
     for(int i = 0 ; i <Bus_list.size();i++)
     {
         if(username.equals(Bus_list.get(i).getBusDriver().getUsername()))
         {
             return 2;
         }
     }
     return 0;
 }
     public boolean find_code(String Code){
         load_data();
         for (int i=0 ; i< Trip_list.size(); i++){
             if(Trip_list.get(i).getCode().equals(Code)){
                 return true;
             }
         }
         return false;
     }
     public boolean check_platenum(String platenum){
         for (int i= 0 ; i< Bus_list.size(); i++){
             if (platenum.equals(Bus_list.get(i).getPlateNum())){
                 return false;
             }
         }
         return true;
     }

 public int check_driver_email(String email)
      {
           if(email.length()<13)
           {
                       return 1;     
            }
            if(!(email.contains("@")))
            {  
                return 1;   
            } 
            else {
                  int count=0;
              for (int i=0;i<email.length();i++){
              if(email.charAt(i)=='@')count++;              
              }
              if(count>1)
              return 1;
              }
              
            for(int i=0;i<Bus_list.size();i++)
            {
                 if(email.equals(Bus_list.get(i).getBusDriver().getEmail()))
                 {
                             return 2;
                  }
            }
          return 0;
      }
 
 
 
 
 
 
   public void calculate_cost_customer(double seat_cost_selectedtrip,int no_seat_selection){
   double cost=no_seat_selection*seat_cost_selectedtrip;
   current_customer.setTotal_cost(cost);

   }
   
   
  public void Set_Done__InCustomers_Trips_DependOn_Time(){
               try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;
            
     String L_date[]=l_date.split("/");      
   String L_Time[]=l_Time.split(":"); 
      for (int i=0 ; i< Customer_trips_list.size(); i++){
         
            String E_Date []=Customer_trips_list.get(i).getTrip_customer().getArrivalDate().split("/");
           String E_Time [] =  Customer_trips_list.get(i).getTrip_customer().getArrivalTime().split(":");
           
           if(Integer.valueOf(E_Date[2]).equals(Integer.valueOf(L_date[2])))
           {
               if(Integer.valueOf(E_Date[1]).equals(Integer.valueOf(L_date[1])))
               {
                   if(Integer.valueOf(E_Date[0]).equals(Integer.valueOf(L_date[0])))
                   {
                       if(Integer.valueOf(E_Time[0]).equals(Integer.valueOf(L_Time[0])))
                       {
                           if((Integer.valueOf(E_Time[1]))<=Integer.valueOf(L_Time[1])){
                           
                               current_customer.setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          for(int k=0;k<Customer_list.size();k++){
                          if(current_customer.getUsername().equals(Customer_list.get(k).getUsername()))
                          {
                   Customer_list.get(k).setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          }
                          }
                         query = "update customers set position = '"+ current_customer.getPosition()+"' where nationalID = "+current_customer.getNationalID();
                                              s.execute(query);   
                            Customer_trips_list.get(i).getTrip_customer().setStatus("Done");
                                  query = "update customers_trips set status = 'Done' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
                           }
                       }
                       else if(Integer.valueOf(E_Time[0])<Integer.valueOf(L_Time[0]))
                       {
                                 current_customer.setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          for(int k=0;k<Customer_list.size();k++){
                          if(current_customer.getUsername().equals(Customer_list.get(k).getUsername()))
                          {
                   Customer_list.get(k).setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          }
                          }
                         query = "update customers set position = '"+ current_customer.getPosition()+"' where nationalID = "+current_customer.getNationalID();
                                              s.execute(query);   
                                              
                             
                           
                       Customer_trips_list.get(i).getTrip_customer().setStatus("Done");
                           query = "update customers_trips set status = 'Done' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
                       }
                   }
                   else if (Integer.valueOf(E_Date[0])<Integer.valueOf(L_date[0]))
                   {
                             current_customer.setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          for(int k=0;k<Customer_list.size();k++){
                          if(current_customer.getUsername().equals(Customer_list.get(k).getUsername()))
                          {
                   Customer_list.get(k).setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          }
                          }
                         query = "update customers set position = '"+ current_customer.getPosition()+"' where nationalID = "+current_customer.getNationalID();
                                              s.execute(query);   
                                              
                             
                       Customer_trips_list.get(i).getTrip_customer().setStatus("Done");
                          query = "update customers_trips set status = 'Done' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
                   }
                   
               }
               else if(Integer.valueOf(E_Date[1])<Integer.valueOf(L_date[1])){
                   
                         current_customer.setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          for(int k=0;k<Customer_list.size();k++){
                          if(current_customer.getUsername().equals(Customer_list.get(k).getUsername()))
                          {
                   Customer_list.get(k).setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          }
                          }
                         query = "update customers set position = '"+ current_customer.getPosition()+"' where nationalID = "+current_customer.getNationalID();
                                              s.execute(query);   
                                              
                             
                Customer_trips_list.get(i).getTrip_customer().setStatus("Done");
                       query = "update customers_trips set status = 'Done' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
               }
           }
           else
               if(Integer.valueOf(E_Date[2])<Integer.valueOf(L_date[2])){
                         current_customer.setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          for(int k=0;k<Customer_list.size();k++){
                          if(current_customer.getUsername().equals(Customer_list.get(k).getUsername()))
                          {
                   Customer_list.get(k).setPosition(Customer_trips_list.get(i).getTrip_customer().getDestination());
                          }
                          }
                         query = "update customers set position = '"+ current_customer.getPosition()+"'where nationalID = "+current_customer.getNationalID();
                                              s.execute(query);   
                                              
                             
       Customer_trips_list.get(i).getTrip_customer().setStatus("Done");
                     query = "update customers_trips set status = 'Done' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
               }
      
              }
                   c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
  }
  
  public void  Set_Running_Status_dependOnTime_InCustomertTripsList() {
         try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;
        
  
     String L_date[]=l_date.split("/");
   String L_Time[]=l_Time.split(":"); 
       for (int i=0;i<Customer_trips_list.size();i++){
       
                if(Customer_trips_list.get(i).getTrip_customer().getStatus().equals("Upcoming")){
                
           String S_Date []=Customer_trips_list.get(i).getTrip_customer().getPickUpDate().split("/");
           String S_Time [] =  Customer_trips_list.get(i).getTrip_customer().getPickUpTime().split(":");
             String E_Time []=Customer_trips_list.get(i).getTrip_customer().getarrivalTime().split("/");
                         
            if(S_Date[2]==L_date[2]&&S_Date[1]==L_date[1]&&S_Date[0]==L_date[0])
             {
                     if(Integer.valueOf(S_Time[0])<Integer.valueOf(E_Time[0]))
                     {
                     if(Integer.valueOf(S_Time[0])<=Integer.valueOf(L_Time[0])
                   &&Integer.valueOf(E_Time[0])>Integer.valueOf(L_Time[0])){
                     Customer_trips_list.get(i).getTrip_customer().setStatus("isRunningNow");
                     
                    query = "update customers_trips set status = 'isRunningNow' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
                         
                 }
                 else if (Integer.valueOf(S_Time[0])<=Integer.valueOf(L_Time[0])
                   &&Integer.valueOf(E_Time[0])==Integer.valueOf(L_Time[0])&&Integer.valueOf(E_Time[1])>Integer.valueOf(L_Time[1])){
                      Customer_trips_list.get(i).getTrip_customer().setStatus("isRunningNow");
                      
                         query = "update customers_trips set status = 'isRunningNow' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
                      
                 }
                     }
                     else if(Integer.valueOf(S_Time[0])>Integer.valueOf(E_Time[0])){
                       int E_time_Trip= Integer.valueOf(E_Time[0]);
                         E_time_Trip+=24;
                         int laptop_Time_hours=Integer.valueOf(L_Time[0]);
                         if(laptop_Time_hours>=0&&laptop_Time_hours<=11)
                             laptop_Time_hours+=24;
                   if(Integer.valueOf(S_Time[0])<=laptop_Time_hours
                   &&Integer.valueOf(E_Time[0])>laptop_Time_hours)
                   {
                     Customer_trips_list.get(i).getTrip_customer().setStatus("isRunningNow");
                           query = "update customers_trips set status = 'isRunningNow' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                             s.execute(query);
                 }
                 else if (Integer.valueOf(S_Time[0])<=laptop_Time_hours
                   &&Integer.valueOf(E_Time[0])==laptop_Time_hours&&Integer.valueOf(E_Time[1])>Integer.valueOf(L_Time[1])){
                      Customer_trips_list.get(i).getTrip_customer().setStatus("isRunningNow");
                             query = "update customers_trips set status = 'isRunningNow' where code='"+ Customer_trips_list.get(i).getTrip_customer().getCode()
                                 +"'&& username='"+    Customer_trips_list.get(i).getUserName()+"'";
                                  s.execute(query);
                            
                 }
                     }
                 
            }
       
       }
   }
             
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }  
  }
  
 public void  add_Customer_trips(String user_name,Trip selected_Trip,String seat_code){
        
    Customer_trips_list.add(new customers_trips(user_name, current_customer.getTotal_cost(),selected_Trip.getCode(),selected_Trip.getPickUp(),selected_Trip.getPickUpDate(),selected_Trip.getPickUpTime()
       ,selected_Trip.getDestination(),selected_Trip.getArrivalDate(),selected_Trip.getArrivalTime(),selected_Trip.getCost(),selected_Trip.getStatus(),seat_code)); 
    
     }
 
 
 
 
  public ArrayList<customers_trips>  View_Customer_History(){
        
      history_trips_ForCurrentCustomer=new ArrayList();
      
                 for (int i=0;i<Customer_trips_list.size();i++){
                 if(current_customer.getUsername().equals(Customer_trips_list.get(i).getCurrent().getUsername())&&
                         Customer_trips_list.get(i).getTrip_customer().getStatus().equals("Done"))
                 {
                            history_trips_ForCurrentCustomer.add(Customer_trips_list.get(i));
                 }
                 }
              return    history_trips_ForCurrentCustomer;
  }
  
   public boolean check_if_valid_Trip_forCustomer(Customer current_customer , Trip trip){
       String cs_Date  =  trip.getPickUpDate();
               String CS_Date []=cs_Date.split("/");
                String cs_Time  =  trip.getPickUpTime();
               String CS_Time []=cs_Time.split(":");
                String ce_Date  =  trip.getarrivalDate();
               String CE_Date []=ce_Date.split("/");
                String ce_Time  =  trip.getarrivalTime();
               String CE_Time []=ce_Time.split(":");
       for (int i=0 ; i<  Customer_trips_list.size(); i++){
           if(Customer_trips_list.get(i).getUserName().equals(current_customer.getUsername())&&
                   Customer_trips_list.get(i).getTrip_customer().getStatus().equals("Upcoming")){
               String s_Date  = Customer_trips_list.get(i).getTrip_customer().getPickUpDate();
               String S_Date []=s_Date.split("/");
                String s_Time  = Customer_trips_list.get(i).getTrip_customer().getPickUpTime();
               String S_Time []=s_Time.split(":");
                String e_Date  = Customer_trips_list.get(i).getTrip_customer().getarrivalDate();
               String E_Date []=e_Date.split("/");
                String e_Time  = Customer_trips_list.get(i).getTrip_customer().getarrivalTime();
               String E_Time []=e_Time.split(":"); 
               if (Integer.valueOf(CS_Date[0])==Integer.valueOf(CE_Date[0])){
                   if(Integer.valueOf(S_Date[0])==Integer.valueOf(E_Date[0]) ){
                       if(Integer.valueOf(S_Date[0])==Integer.valueOf(CS_Date[0]) &&
                       Integer.valueOf(S_Date[1])==Integer.valueOf(CS_Date[1]) &&
                       Integer.valueOf(S_Date[2])==Integer.valueOf(CS_Date[2])){
                           if( (Integer.valueOf(S_Time[0])==Integer.valueOf(CS_Time[0]))||
                             (Integer.valueOf(S_Time[0])>Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(S_Time[0])<Integer.valueOf(CE_Time[0]))||
                                  ( Integer.valueOf(S_Time[0])<Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(E_Time[0])>Integer.valueOf(CS_Time[0]))||
                                   
                                   (Integer.valueOf(S_Time[0])>Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(E_Time[0])==Integer.valueOf(CE_Time[0]))||
                                  ( Integer.valueOf(S_Time[0])<Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(E_Time[0])==Integer.valueOf(CE_Time[0]))||
                                   (Integer.valueOf(E_Time[0])==Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(E_Time[1])>=Integer.valueOf(CS_Time[1]))||
                                      (Integer.valueOf(S_Time[0])==Integer.valueOf(CE_Time[0])&&
                                     Integer.valueOf(S_Time[1])<=Integer.valueOf(CE_Time[1]))||
                                    (Integer.valueOf(E_Time[0])==Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(E_Time[1])==Integer.valueOf(CS_Time[1])&&
                                   !(Customer_trips_list.get(i).getTrip_customer().getDestination().equals(trip.getPickUp())))||
                                   (Integer.valueOf(S_Time[0])==Integer.valueOf(CE_Time[0])&&
                                     Integer.valueOf(S_Time[1])==Integer.valueOf(CE_Time[1])&&
                                   !(Customer_trips_list.get(i).getTrip_customer().getPickUp().equals(trip.getDestination())))){
                               System.out.println("you have another trip in the same time");
                               return false;
                           }
                       }
                   }
                   else if (Integer.valueOf(S_Date[0])!=Integer.valueOf(E_Date[0])){
                     if(Integer.valueOf(CS_Date[0])==Integer.valueOf(S_Date[0]) ){
                           if((Integer.valueOf(S_Time[0])==Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(S_Time[1])>=Integer.valueOf(CS_Time[1]))||
                                (Integer.valueOf(S_Time[0])>Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(S_Time[0])<Integer.valueOf(CE_Time[0]))||  
                                   (Integer.valueOf(S_Time[0])>Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(S_Time[0])==Integer.valueOf(CE_Time[0])&&
                                   Integer.valueOf(S_Time[1])<Integer.valueOf(CE_Time[1]))   ){
                               return false;
                           }
                           
                       }
                     else if(Integer.valueOf(CS_Date[0])==Integer.valueOf(E_Date[0])){
                         if((Integer.valueOf(E_Time[0])==Integer.valueOf(CS_Time[0])&&
                                     Integer.valueOf(E_Time[1])>Integer.valueOf(CS_Time[1]))||
                                (Integer.valueOf(E_Time[0])>Integer.valueOf(CS_Time[0]))){
                               return false;
                           }
                     }
                   
               }
               }
               else {
                   if( Integer.valueOf(S_Date[0])==Integer.valueOf(E_Date[0]) ){
                       if(Integer.valueOf(CS_Date[0])==Integer.valueOf(E_Date[0])){
                           if((Integer.valueOf(S_Time[0])==Integer.valueOf(CS_Time[0]))||
                                (Integer.valueOf(CS_Time[0])>Integer.valueOf(S_Time[0])&&
                                     Integer.valueOf(CS_Time[0])<Integer.valueOf(E_Time[0]))||  
                                   (Integer.valueOf(CS_Time[0])>Integer.valueOf(S_Time[0])&&
                                     Integer.valueOf(CS_Time[0])==Integer.valueOf(E_Time[0])&&
                                   Integer.valueOf(CS_Time[1])<Integer.valueOf(E_Time[1]))   ){
                               return false;
                           }
                           
                       }
                     else if(Integer.valueOf(CE_Date[0])==Integer.valueOf(E_Date[0])){
                         if((Integer.valueOf(CE_Time[0])==Integer.valueOf(S_Time[0])&&
                                     Integer.valueOf(CE_Time[1])>Integer.valueOf(S_Time[1]))||
                                (Integer.valueOf(CE_Time[0])>Integer.valueOf(S_Time[0]))){
                               return false;
                           }
                     }
                   
                       }
                   }
               }
       }
       return true;
   }
   public Bus get_available_Driver(String sdate , String pickup,String sTime, String Edate, String Etime, String Destination, String Type){
     // load_data();
               String Ns_Date []=sdate.split("/");
               String Ns_time []=sTime.split(":");
               String Ne_Date []=Edate.split("/");
               String Ne_time []=Etime.split(":");
              
                boolean classic;
             
                if (Type == "Classic"){
           classic = true;
       }
       else{
           classic = false;
       }
               for(int i=0 ; i< Bus_list.size(); i++){
                     boolean available =true;
                   if(Bus_list.get(i).isIsClassic()==classic){
                   for(int j=0 ; j< Trip_list.size(); j++){
                        String s_Date  = Trip_list.get(j).getPickUpDate();
               String S_Date []=s_Date.split("/");
                String s_Time  = Trip_list.get(j).getPickUpTime();
               String S_Time []=s_Time.split(":");
                String e_Date  = Trip_list.get(j).getarrivalDate();
               String E_Date []=e_Date.split("/");
                String e_Time  = Trip_list.get(j).getarrivalTime();
               String E_Time []=e_Time.split(":");
                     
                       if(Bus_list.get(i).getPlateNum().equals(Trip_list.get(j).getTripBus().getPlateNum())&&
                            Trip_list.get(j).getStatus().equals("Upcoming")){
                             if(Edate.equals(sdate)&&Trip_list.get(j).getPickUpDate().equals(Trip_list.get(j).getArrivalDate()) ) {
                                  if(Trip_list.get(j).getPickUpDate().equals(sdate)){
                                      if((Integer.valueOf(S_Time[0])==Integer.valueOf(Ns_time[0]))||
                                              (Integer.valueOf(S_Time[0])>Integer.valueOf(Ns_time[0])&&
                                              Integer.valueOf(S_Time[0])<Integer.valueOf(Ne_time[0]))||
                                              (Integer.valueOf(S_Time[0])==Integer.valueOf(Ne_time[0])&&
                                              Integer.valueOf(S_Time[1])<Integer.valueOf(Ne_time[1]))||
                                               (Integer.valueOf(S_Time[0])==Integer.valueOf(Ne_time[0])&&
                                              Integer.valueOf(S_Time[1])>=Integer.valueOf(Ne_time[1])&&
                                             !(Destination.equals(Trip_list.get(j).getPickUp())))||
                                              
                                             (Integer.valueOf(  Ns_time[0])>Integer.valueOf(S_Time[0])&&
                                              Integer.valueOf(Ns_time[0])<Integer.valueOf(E_Time[0]))||
                                              (Integer.valueOf(Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                              Integer.valueOf(Ns_time[1])<Integer.valueOf(E_Time[1]))||
                                             (Integer.valueOf(Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                              Integer.valueOf(Ns_time[1])>=Integer.valueOf(E_Time[1])&&
                                             !(pickup.equals(Trip_list.get(j).getDestination())))){
                                          available=false;
                                          break;
                                      }
                                      
                                  }
                             }
                                else if(Edate.equals(sdate)&&!(Trip_list.get(j).getPickUpDate().equals(Trip_list.get(j).getArrivalDate())) ){
                                     if(Edate.equals(Trip_list.get(j).getPickUpDate())){
                                         if((Integer.valueOf( Ns_time[0])==Integer.valueOf(S_Time[0]))||
                                            (Integer.valueOf(  Ns_time[0])>Integer.valueOf(S_Time[0]))||
                                              (Integer.valueOf(Ne_time[0])>Integer.valueOf(S_Time[0]))||
                                                ( Integer.valueOf(  Ne_time[0])==Integer.valueOf(S_Time[0])&&
                                              Integer.valueOf(Ne_time[1])>Integer.valueOf(S_Time[1]))||
                                                 ( Integer.valueOf(  Ne_time[0])==Integer.valueOf(S_Time[0])&&
                                              Integer.valueOf(Ne_time[1])<=Integer.valueOf(S_Time[1])&&
                                                 !(Destination.equals(Trip_list.get(j).getPickUp())))){
                                             available=false;
                                             break;
                                         }
                                      
                                         }
                                     }
                                     else  if(Edate.equals(Trip_list.get(j).getArrivalDate())){
                                         if((Integer.valueOf( Ns_time[0])<Integer.valueOf(E_Time[0]))||
                                            (Integer.valueOf( Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                                 Integer.valueOf( Ns_time[1])<Integer.valueOf(E_Time[1]))||
                                                   (Integer.valueOf( Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                                 Integer.valueOf( Ns_time[1])>=Integer.valueOf(E_Time[1])&&
                                                 !(pickup.equals(Trip_list.get(j).getDestination())))){
                                             available= false;
                                             break;
                                         }
                                         
                                 }
                                else if(!(Edate.equals(sdate))&&Trip_list.get(j).getPickUpDate().equals(Trip_list.get(j).getArrivalDate()))
                                {
                                    if(Edate.equals(Trip_list.get(j).getArrivalDate())){
                                        if((Integer.valueOf( Ne_time[0])>Integer.valueOf(S_Time[0]))||
                                           (Integer.valueOf( Ne_time[0])==Integer.valueOf(S_Time[0])&&
                                             Integer.valueOf( Ne_time[1])>Integer.valueOf(S_Time[1]))||
                                                (Integer.valueOf( Ne_time[0])==Integer.valueOf(S_Time[0])&&
                                             Integer.valueOf( Ne_time[1])<=Integer.valueOf(S_Time[1])&&
                                                !(Destination.equals(Trip_list.get(j).getPickUp())))){
                                            available=false;
                                            break;
                                        }
                                      
                                    }
                                    else if(sdate.equals(Trip_list.get(j).getArrivalDate())){
                                         if((Integer.valueOf( Ns_time[0])==Integer.valueOf(S_Time[0]))||
                                           (Integer.valueOf( Ns_time[0])>Integer.valueOf(S_Time[0])&&
                                             Integer.valueOf( Ns_time[0])<Integer.valueOf(E_Time[0]))||
                                                (Integer.valueOf( Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                             Integer.valueOf( Ns_time[1])<Integer.valueOf(E_Time[1]))||
                                                (Integer.valueOf( Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                             Integer.valueOf( Ns_time[1])>=Integer.valueOf(E_Time[1])&&
                                                !(pickup.equals(Trip_list.get(j).getDestination())))){
                                             available = false;
                                             break;
                                         }
                                         
                                    }
                                }
                                else if(!(Edate.equals(sdate))&&!(Trip_list.get(j).getPickUpDate().equals(Trip_list.get(j).getArrivalDate()))){
                                    if (sdate.equals(Trip_list.get(j).getPickUpDate())){
                                        if(( Integer.valueOf( Ns_time[0])==Integer.valueOf(S_Time[0]))||
                                           (Integer.valueOf( Ns_time[0])>Integer.valueOf(S_Time[0]))||
                                           (Integer.valueOf( Ns_time[0])<Integer.valueOf(S_Time[0]))){
                                            available = false;
                                            break;
                                        }
                                       
                                    }
                                    else if(Edate.equals(Trip_list.get(j).getPickUpDate())){
                                          if(( Integer.valueOf( Ne_time[0])>Integer.valueOf(S_Time[0]))||
                                           (Integer.valueOf( Ne_time[0])==Integer.valueOf(S_Time[0])&&
                                           Integer.valueOf( Ne_time[1])>Integer.valueOf(S_Time[1]))||
                                             (Integer.valueOf( Ne_time[0])==Integer.valueOf(S_Time[0])&&
                                           Integer.valueOf( Ne_time[1])<=Integer.valueOf(S_Time[1])&& 
                                                  !(Destination.equals(Trip_list.get(j).getPickUp())))){
                                              available = false;
                                              break;
                                          }
                                         
                                    }
                                    else if(sdate.equals(Trip_list.get(j).getArrivalDate())){
                                        if(( Integer.valueOf( Ns_time[0])<Integer.valueOf(E_Time[0]))||
                                           (Integer.valueOf( Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                           Integer.valueOf( Ns_time[1])<Integer.valueOf(E_Time[1]))||
                                             (Integer.valueOf( Ns_time[0])==Integer.valueOf(E_Time[0])&&
                                           Integer.valueOf( Ns_time[1])>=Integer.valueOf(E_Time[1])&& 
                                                     !(pickup.equals(Trip_list.get(j).getDestination())))){
                                              available = false;
                                              break;
                                          }
                                       
                                    }
                                    else if(Edate.equals(Trip_list.get(j).getArrivalDate())){
                                       {
                                            available = false;
                                             break;
                                        }
                                    }
                                }
                                else {
                                    if(Bus_list.get(i).getBusDriver().getPosition()!=pickup)
                                    available = false;
                                }
                       }
                   }
               
                if (available==true){
            available_Driver=   Bus_list.get(i);
             break;
              }
                else continue;
           }
       }
           return  available_Driver;
    }
  
    
    
      //adding the driver requires adding his bus so this function will be used to add driver and add bus frames
 public void add_bus(Bus newBus){
   
     Bus_list.add(newBus);
     upload_buses_data();
     Buses_trips.add(new buses_trips(newBus));
     JOptionPane.showMessageDialog(null, "Bus is added successfully","Bus is added successfully",JOptionPane.WARNING_MESSAGE);
 }
    public void delete_bus(String busPlateNum) {
       boolean canDelete = true;   
       for (int j=0 ; j<Trip_list.size(); j++){
        if (Trip_list.get(j).getTripBus().getPlateNum().equals(busPlateNum)&&Trip_list.get(j).getStatus().equalsIgnoreCase("Upcoming"))
        {
           canDelete = false;
           break;
        }
     }
       if(canDelete == true){
         for (int i = 0 ; i < Bus_list.size()  ; i++)
         {
             if(Bus_list.get(i).getPlateNum().equals(busPlateNum))
             {
                 Bus_list.remove(i);
                   try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "delete from buses where BusPlateNum = '"+busPlateNum+"'";
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
             }
         }
       }        else 
             {
                 JOptionPane.showMessageDialog(null, "This bus cannot be deleted","Bus cannot be deleted",JOptionPane.WARNING_MESSAGE);
             }
}      
    public void delete_Driver(String username){
  
        boolean canDelete = true;
        for(int j=0 ; j< Trip_list.size(); j++){
                      if (Trip_list.get(j).getTripBus().getBusDriver().getUsername().equals(username)
                              &&Trip_list.get(j).getStatus().equalsIgnoreCase("Upcoming")){
                          canDelete=false;
                          break;
                      }
                  }
        if(canDelete==true){
        for (int i = 0 ; i < Bus_list.size()  ; i++)
         {
             if(Bus_list.get(i).getBusDriver().getUsername().equals(username))
             {
                   Bus_list.remove(i);   
                     try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "delete from buses where driver_username ='"+username+"'";
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }        
             }
         }
        }
                  else 
             {
                 JOptionPane.showMessageDialog(null, "Driver cannot be deleted","Driver cannot be deleted",JOptionPane.WARNING_MESSAGE);
             }
    }
           
   
    //add function to add the acustomer and his trip in list customers_trips
    
    public void Delete_Trip(String tripCode){
        for (int i=0 ; i< Trip_list.size(); i++)
        {
          if(tripCode.equals(Trip_list.get(i).getCode())){
              if(Trip_list.get(i).getTripBus().isIsClassic()==true && Trip_list.get(i).getAvailableSeatsNum()==24){
                    Trip_list.remove(i);
                     try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "delete from trips where Code = '"+tripCode+"'";
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
        // System.out.println(ex.getMessage());     
         }  
                }
                else if (Trip_list.get(i).getTripBus().isIsClassic()==false  && Trip_list.get(i).getAvailableSeatsNum()==12){
                    Trip_list.remove(i);
          try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "delete from trips where Code = '"+tripCode+"'";
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
        System.out.println(ex.getMessage());     
         }    }
                else {
                      JOptionPane.showMessageDialog(null, "Trip cannot be deleted","",JOptionPane.WARNING_MESSAGE);
                }
          }
          
        }
    }
     public void add_Trip (Trip newTrip){    
  Trip_list.add(newTrip);
    upload_trips_data();
     for (int i = 0 ; i < Buses_trips.size() ; i++)
             {
                 if(Buses_trips.get(i).equals(newTrip.getTripBus()))
                 {  
                   Buses_trips.get(i).addNewTrip(newTrip);
                   break;
                 }
             }
    }  
     public boolean if_tripcode_valid(String code){
  
        for (int i=0 ; i< Trip_list.size(); i++){
            if (Trip_list.get(i).getCode().equals(code)){
              return false;
            }
        }
      return true;
    }
     public boolean if_date_valid(String date){
         String L_date[]=l_date.split("/"); 
        String newdate[] = date.split("/");
       
        if(Integer.valueOf(newdate[2])<Integer.valueOf(L_date[2])){
            return false;
        }
        else if(Integer.valueOf(newdate[1])<Integer.valueOf(L_date[1])&&Integer.valueOf(newdate[2])<=Integer.valueOf(L_date[2]))
        {
                return false;
         }
        else if(Integer.valueOf(newdate[0])<Integer.valueOf(L_date[0])&&Integer.valueOf(newdate[1])<=Integer.valueOf(L_date[1])
                &&Integer.valueOf(newdate[2])<=Integer.valueOf(L_date[2])){
            return false;
        }
        
        else  return true;
     }
     public boolean if_time_valid(String time, String date){
         String L_Time[]=l_Time.split(":"); 
         String L_date[]=l_date.split("/"); 
        String newtime[] = time.split(":");
       String newdate[] = date.split("/");
        if(Integer.valueOf(newdate[2])==Integer.valueOf(L_date[2])
                &&(Integer.valueOf(newdate[1])==Integer.valueOf(L_date[1])&&Integer.valueOf(newdate[0])==Integer.valueOf(L_date[0]))
                &&(Integer.valueOf(newtime[1])<Integer.valueOf(L_Time[1])||(Integer.valueOf(newtime[1])==Integer.valueOf(L_Time[1])&&Integer.valueOf(newtime[0])<=Integer.valueOf(L_Time[0])))){
            return false;
        }
        else  return true;
     }
    public ArrayList<Trip> view_Upcoming_trips (){
        
       // add_Trip();
        view_Upcoming = new ArrayList();
        for (int i=0 ; i< Trip_list.size(); i++){
            if(Trip_list.get(i).getStatus()=="Upcoming"){
                view_Upcoming.add(Trip_list.get(i));
                
            }
        }
        return view_Upcoming;
    }
     public ArrayList<Trip> view_Running_trips (){
         
        view_Running = new ArrayList();
        for (int i=0 ; i< Trip_list.size(); i++){
            if(Trip_list.get(i).getStatus().equals("isRunningNow")){
                view_Running.add(Trip_list.get(i));
                
            }
        }
        return view_Running;
    }
     public ArrayList<Trip> view_Done_trips (){
       //  add_Trip();
        view_Done = new ArrayList();
        for (int i=0 ; i< Trip_list.size(); i++){
            if(Trip_list.get(i).getStatus().equals("Done")){
                view_Done.add(Trip_list.get(i));
                
            }
        }
        return view_Done;
    }
     
      public ArrayList<customers_trips> view_customer_Upcoming_trips ()
      {
          Set_Done__InCustomers_Trips_DependOn_Time();
           Set_Running_Status_dependOnTime_InCustomertTripsList();
          view_customer_upcoming =  new ArrayList<customers_trips>();
          for(int i = 0 ; i < Customer_trips_list.size() ; i++)
        {
            if(current_customer.getUsername().equals(Customer_trips_list.get(i).getUserName())
                    && Customer_trips_list.get(i).getTrip_customer().getStatus().equalsIgnoreCase("upcoming"))
            {
                view_customer_upcoming.add(Customer_trips_list.get(i));
            }
          
      }
          return view_customer_upcoming;
      }  
public Trip view_customer_Running_trip ()
       {
           Set_Done__InCustomers_Trips_DependOn_Time();
           Set_Running_Status_dependOnTime_InCustomertTripsList();
          Trip runningtrip = null;
          for(int i = 0 ; i < Customer_trips_list.size() ; i++)
        {
            if(current_customer.getUsername().equals(Customer_trips_list.get(i).getUserName())
                    && Customer_trips_list.get(i).getTrip_customer().getStatus().equalsIgnoreCase("running"))
            {
               runningtrip = Customer_trips_list.get(i).getTrip_customer();
            }          
      }
          return runningtrip; 
       }
      
   

    // Aya
    
    
    public int check_Username(String user_name){
     if(user_name.length()<=2){
     return 1;   
     }
     else{
         for (int i=0;i<Customer_list.size();i++){
             if(user_name.equals(Customer_list.get(i).getUsername()))
             {
                 return 2;      
             }
         }
         }
     return 0;
     }
         public int check_Name(String name){
     if(name.length()<=2){
         
     for (int i=0;i<name.length();i++){
     
     if(name.charAt(i)<='9')
     {
       return 1;//error len & nums
     }
     else {
     return 2;//error len
     }
     }
     }    
     else {
       for (int i=0;i<name.length();i++){
     
     if(name.charAt(i)<='9')
     {
       return 3;//error nums
     }
     }
     }

     return 0;
     }

          public int check_Password(String password){
            int password_len=password.length();
              if(password_len<8){
                       return 1;           
     
                      }
                 return 0;
          }
          
              public int check_Email_found(String email){
        
                    for(int i=0;i<Customer_list.size();i++){
                               
                 if(email.equals(Customer_list.get(i).getEmail())){
                             return 0;
         }
                    }
            for(int i=0;i<Bus_list.size();i++){
                               
                 if(email.equals(Bus_list.get(i).getBusDriver().getEmail())){
                             return 2;
         }
                    }
                  return 1;
              }
              
        public int check_Email(String email){
     
              if(email.length()<13){
                       return 1;     
              }
         else{
                if((!(email.contains("@gmail.com")))&&(!(email.contains("@yahoo.com")))&&(!(email.contains("@Yahoo.com")))&&(!(email.contains("@Gmail.com"))))
                        return 2;   
              
              else {
                  int count=0;
              for (int i=0;i<email.length();i++){
              if(email.charAt(i)=='@')count++;
              
              }
              if(count>1)
              return 3;
              }
                for(int i=0;i<Customer_list.size();i++){
                               
                 if(email.equals(Customer_list.get(i).getEmail())){
                             return 4;
         }
         
         }
             }
              
                 return 0;
       }

              public int check_National_ID(String national_id){
              if(national_id.length()<15){  
                 for (int i=0;i<national_id.length();i++){
                   
                      if(national_id.charAt(i)>'9')
                      {
                         return 1;
                      }    else return 3;
                   }
              }
              
        else {
                   for (int i=0;i<national_id.length();i++){
                   
                      if(national_id.charAt(i)>'9')
                      {
                         return 2;
                      }
                   }
              }
                 return 0;
          }   
      public int check_Age(String  age1){
                if(age1.length()>=3){  
                 for (int i=0;i<age1.length();i++){
                      if(age1.charAt(i)>'9')
                      {
                         return 1;
                      }    else return 3;
                   }
              }
        else {
                   for (int i=0;i<age1.length();i++){
                      if(age1.charAt(i)>'9')
                      {
                         return 2;
                      }
                       else if(Integer.valueOf(age1)<=17) return 4;
                   }
              }
                 return 0;
    }
      public int check_Phone(String Phone){
          if(Phone.length()<11){
              for (int i=0;i<Phone.length();i++){
                      if(Phone.charAt(i)>'9')
                      {
                         return 1;   
                      }
                      else return 3;
                   }
              }
        else {
                   for (int i=0;i<Phone.length();i++){
                   
                      if(Phone.charAt(i)>'9')
                      {
                         return 2;
                      }
                   }
              }
                 return 0;
          }
      public int check_Visa_no(String VISA_no){
              if(VISA_no.length()<3){
                 for (int i=0;i<VISA_no.length();i++){
                   
                      if(VISA_no.charAt(i)>'9')
                      {
                         return 1;
                      }
                   }
              }
        else {
                   for (int i=0;i<VISA_no.length();i++){
                   
                      if(VISA_no.charAt(i)>'9')
                      {
                         return 2;
                      }
                   }
              }
                 return 0;
          }
     public int Check_Location(String location){
              if(location.length()<4){
                     for (int i=0;i<location.length();i++){
              if(location.charAt(i)<='9')
              {
                                   return 1;       // invalid  len&& only letters
              }
                 
              }   
      }
              else{
              for (int i=0;i<location.length();i++){
              if(location.charAt(i)<='9')
               {
                                      return 2;       // only letters
              }
              }
              }
              
                 return 0;
          }
      public int Check_VisaPassword(String VISA_Password){
                 int VISA_Password_len=VISA_Password.length();
              if(VISA_Password_len<8){
                       return 1;           
     
                      }
                 return 0;
          }
        
   public void send_registrationEmail(){
     try{
            String host ="smtp.mail.yahoo.com" ;
            String user = "bustra@yahoo.com";
            String pass = "01100615741";
            String to = current_customer.getEmail();
            String from = "bustra@yahoo.com";
            String subject = "BusTra account registration confirmation";
            String messageText = "    Hello "+current_customer.getName()+",\n\n"+"      Welcome to BusTra,\n      We are so happy you have joined us.\n"+
                   "      From now on, please log in with your username and password.\n\n"+"      With BusTra,\n       You can book a trip from your current location to any destination you choose"
                    + " and we will arrange your trips schedule.\n\n"+"      Hope you enjoy your time with us, "+"\n\n      Regards,\n      BusTra team";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

         try (Transport transport = mailSession.getTransport("smtp")) {
             transport.connect(host, user, pass);
             transport.sendMessage(msg, msg.getAllRecipients());
         }
           System.out.println("message send successfully");
        }
             catch(Exception ex)
        {
            System.out.println(ex);
        }
  
   }
   public void send_confirmationEmail_booking(Trip selectedTrip){
     try{
         String seatCODEEdited="";
         String seatcode=selectedTrip.getSeat_code();
         for(int i=0;i<seatcode.length();i++){
         seatCODEEdited+=seatcode.charAt(i);
         if(i<seatcode.length()-1)
            seatCODEEdited+=" - ";
         }
            String host ="smtp.mail.yahoo.com" ;
            String user = "bustra@yahoo.com";
            String pass = "01100615741";
            String to = current_customer.getEmail();
            String from = "bustra@yahoo.com";
            String subject = "";
            String messageText = "     Dear "+current_customer.getName()+",\n"+
                    "     Thank you for choosing BusTra.\n\n"+"     Your booking summary: \n        "+"From :"+current_customer.getPosition()+"\n        "
                    +"To :"+selectedTrip.getDestination()+"\n        On :"+selectedTrip.getPickUpDate()+"\n        At :"+selectedTrip.getPickUpTime()+"\n        The cost"
                    + " of this trip is "+current_customer.getTotal_cost()+"$\n        The code of this trip is :"+selectedTrip.getCode()+"\n        "
                    + "The code of the selected seat(s) is(are) :"+seatCODEEdited+"\n\n     Regards,\n      BusTra team";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

         try (Transport transport = mailSession.getTransport("smtp")) {
             transport.connect(host, user, pass);
             transport.sendMessage(msg, msg.getAllRecipients());
         }
           System.out.println("message send successfully");
        }
             catch(Exception ex)
        {
            System.out.println(ex);
        }
   }
   public void set_SeatCode_in_Trips_EDIT(String seatcode,String CodeTRIP){
     try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;
   
               query = "update trips set seat_code = '"+ seatcode +"'where code ="+"'"+CodeTRIP+"'";
                             s.execute(query);
            
            
            
  c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }  
   
   } 
    public void reset_Fogetten_Passwordforcustomer(String email){
        try{
            String host ="smtp.mail.yahoo.com" ;
            String user = "bustra@yahoo.com";
            String pass = "01100615741";
            String to = email;String name="";
            for(int i=0;i<Customer_list.size();i++){
                if(email.equals(Customer_list.get(i).getEmail())){
                  name=Customer_list.get(i).getName();
                break;
                }
            }
            String from = "bustra@yahoo.com";
            String subject = "Password change for your BusTra account";
            String messageText = "     Hi "+name+",\n\n     "+"The password for your BusTra account, "+email.charAt(0)+email.charAt(1)+
                    email.charAt(2)+"*******"+email.charAt(email.length()-12)+email.charAt(email.length()-11)+".com, was recently changed.\n\n     Regards,\n      BusTra team";
            boolean sessionDebug = false;
            Properties props = System.getProperties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

         try (Transport transport = mailSession.getTransport("smtp")) {
             transport.connect(host, user, pass);
             transport.sendMessage(msg, msg.getAllRecipients());
         }
           System.out.println("message send successfully");
        }
             catch(Exception ex)
        {
            System.out.println(ex);
        }
    }

    
    public void reset_Fogetten_Passwordfor_driver(String email){
        try{
            String host ="smtp.mail.yahoo.com" ;
            String user = "bustra@yahoo.com";
            String pass = "01100615741";
            String to = email;String name="";
            for(int i=0;i<Bus_list.size();i++){
                if(email.equals(Bus_list.get(i).getBusDriver().getEmail())){
                  name=Bus_list.get(i).getBusDriver().getName();
                break;
                }
            }
            String from = "bustra@yahoo.com";
            String subject = "Password change for your BusTra account";
            String messageText = "     Hi "+name+",\n\n     "+"The password for your BusTra account, "+email.charAt(0)+email.charAt(1)+
                    email.charAt(2)+"*******"+email.charAt(email.length()-12)+email.charAt(email.length()-11)+".com, was recently changed.\n\n     Regards,\n      BusTra team";
            boolean sessionDebug = false;
            Properties props = System.getProperties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

         try (Transport transport = mailSession.getTransport("smtp")) {
             transport.connect(host, user, pass);
             transport.sendMessage(msg, msg.getAllRecipients());
         }
           System.out.println("message send successfully");
        }
             catch(Exception ex)
        {
            System.out.println(ex);
        }
    }

    }