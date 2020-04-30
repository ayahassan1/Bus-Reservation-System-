
package Person;

import mySQL.Sec;
import static Bus_Reservation_System.Bus_Reservation_System.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver extends Person {
  private  boolean status;

    public boolean isStatus() {
        return status;
    }
  
    private void setStatus(boolean status) {
        this.status = status;
    }

    public  Driver(){
      this.setName(null);
      this.setAge(0);
      this.setNationalID(0);
      this.setGender(null);
      this.setPosition(null);
      this.setEmail(null);
      this.setUsername(null);
      this.setPassword(null);
      this.setStatus(false);
       
    }
    
  public Driver(String name , int age , long nationalID , String gender , String position , String email , String username , String password , boolean status){
      
      this.setName(name);
      this.setAge(age);
      this.setNationalID(nationalID);
      this.setGender(gender);
      this.setPosition(position);
      this.setEmail(email);
      this.setUsername(username);
      this.setPassword(password);
      this.setStatus(status);

  }

  @Override
    public boolean login(String username , String password){

for (int i = 0 ; i < Bus_list.size() ; i++)
    {       
        if(username.equalsIgnoreCase(Bus_list.get(i).getBusDriver().getUsername()))
        {
            if(password.equalsIgnoreCase(Bus_list.get(i).getBusDriver().getPassword()))
            {
                getCurrent_busTrips(i);
               current_driver = Bus_list.get(i).getBusDriver();
                return true ;
            }
            else return false;
        }
    }
    return false ;
    }

    private void getCurrent_busTrips(int Bus_index)
    {
        for (int i = 0 ; i < Buses_trips.size() ; i++)
        {
            if(Bus_list.get(Bus_index).equals(Buses_trips.get(i).getBus()))
            {
               current_busTrips = Buses_trips.get(i);
            }
        }
    }
    
    //Edit info username - password - email only
    
     public void Edit_username(String edited_username)
     {
         this.setUsername(edited_username);
          for(int i = 0 ; i <Bus_list.size(); i++)
         {
             if(Bus_list.get(i).getBusDriver().equals(this))
             {
                 Bus_list.get(i).getBusDriver().setUsername(edited_username);
             }
         }
          try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update buses set driver_username = '"+edited_username+"' where driver_nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
     }
     
     public void Edit_password(String edited_password)
     {
         this.setPassword(edited_password);
         for(int i = 0 ; i <Bus_list.size(); i++)
         {
             if(Bus_list.get(i).getBusDriver().equals(this))
             {
                 Bus_list.get(i).getBusDriver().setPassword(edited_password);
             }
         }
         
         try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update buses set driver_password = '"+edited_password+"' where driver_nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
     }
     
      public void Edit_email(String edited_email)
      {
          this.setEmail(edited_email);
           for(int i = 0 ; i <Bus_list.size(); i++)
         {
             if(Bus_list.get(i).getBusDriver().equals(this))
             {
                 Bus_list.get(i).getBusDriver().setEmail(edited_email);
             }
         }
          try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update buses set driver_email = '"+edited_email+"' where driver_nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
      }
      public void Edit_newPasswordDriver(String Email,String new_password){
        for (int i=0;i<Bus_list.size();i++){
          if(Email.equals(Bus_list.get(i).getBusDriver().getEmail()))
        {
            Bus_list.get(i).getBusDriver().setPassword(new_password);
              break;
        }
        }
            try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;                
            query = "update buses set driver_password = '"+ new_password +" ' where driver_email ="+"'"+Email  +"'";
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
 
}


