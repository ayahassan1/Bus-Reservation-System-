package Person;
import static Bus_Reservation_System.Bus_Reservation_System.*;
import Trip.Trip;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import mySQL.Sec;

public class Customer extends Person {
 private    String phone; 
 private    String VISAnumber;
 private    String VISApassword;
private   int seat_count=0;
private    double total_cost;
    public int getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }

    public Customer() {
              String phone=null; 
      String VISAnumber=null;
      String VISApassword=null;
      super.setAge(0);
      super.setEmail(null);
      super.setGender(null);
      super.setName(null);
      super.setNationalID(0);
      super.setPassword(null);
      super.setPosition(null);
      super.setUsername(null);
      
    }
    
    
    
   public Customer(String name, int age, long NationalID,String gender, String position ,String email, String username ,String password,
            String phone, String VISAnum, String VISApassword) 
    {
        
       super( name,  age,  NationalID, gender,  position , email,  username , password );
        this.setPhone(phone);
        this.setVISAnumber(VISAnum);
        this.setVISApassword(VISApassword);
    }
   public Customer(Customer C) 
    {
        super(C.getName(), C.getAge(), C.getNationalID(), C.getGender(), C.getPosition(), C.getEmail(), C.getUsername(),C.getPassword() );
       
        this.setPhone(C.getPhone());
        this.setVISAnumber(C.getVISAnumber());
        this.setVISApassword(C.getVISApassword());
    }
      public void Registration(Customer customer)
     {
                Customer_list.add(customer);
    }
    @Override
     public  boolean login(String username , String password)
     {
        for (int i=0;i<Customer_list.size();i++){
        if(username.equalsIgnoreCase(Customer_list.get(i).getUsername())&&password.equalsIgnoreCase(Customer_list.get(i).getPassword())){
            current_customer=Customer_list.get(i);
            return true;
        }
        }
        return false;
    }
    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getVISAnumber() {
        return VISAnumber;
    }

    public void setVISAnumber(String VISAnumber) {
        this.VISAnumber = VISAnumber;
    }

    public String getVISApassword() {
        return VISApassword;
    }

    public void setVISApassword(String VISApassword) {
        this.VISApassword = VISApassword;
    }
    
        public void Edit_Username(String edited_user_name){
        Customer keep_customer=new Customer(this);
        this.setUsername(edited_user_name);
        try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
        for (int i=0;i<Customer_list.size();i++){
        if((keep_customer.getUsername()).equals(Customer_list.get(i).getUsername()))
        {
            Customer_list.get(i).setUsername(edited_user_name); 
            query = "update customers set username ='"+edited_user_name+"'where nationalID ="+this.getNationalID();
            s.execute(query);
        }
        }
       for (int i=0;i<Customer_trips_list.size();i++){
        if((keep_customer.getUsername()).equals(Customer_trips_list.get(i).getUserName()))
        {
            Customer_trips_list.get(i).setUserName(edited_user_name);
            Customer_trips_list.get(i).getCurrent().setUsername(edited_user_name);
               Customer_trips_list.get(i).setCurrent(current_customer);
       
            
                   query = "update customers_trips set username ='" +edited_user_name+"'where username ='"+keep_customer.getUsername()+"'";
                             s.execute(query);
            
  
        }
       }
                  c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
        }
    
     public void Edit_Email(String edited_EMAIL){
        Customer keep_customer=new Customer(this);
     
        this.setEmail(edited_EMAIL);
        for (int i=0;i<Customer_list.size();i++){
        if((keep_customer.getUsername()).equals(Customer_list.get(i).getUsername()))
        {
            Customer_list.get(i).setEmail(edited_EMAIL);
        }
        }
            try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update customers set email = '"+edited_EMAIL+"' where nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
    
       public void Edit_Phone(String edited_phone){
        Customer keep_customer=new Customer(this);
        this.setPhone(edited_phone);
        for (int i=0;i<Customer_list.size();i++){
       if((keep_customer.getUsername()).equals(Customer_list.get(i).getUsername()))
        {
            Customer_list.get(i).setPhone(edited_phone);
        }
        }
            try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update customers set phone = '"+edited_phone+"' where nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
          public void Edit_VISANO(String edited_visa_no){
        Customer keep_customer=new Customer(this);
        this.setVISAnumber(edited_visa_no);
        for (int i=0;i<Customer_list.size();i++){
      if((keep_customer.getUsername()).equals(Customer_list.get(i).getUsername()))
        {
            Customer_list.get(i).setVISAnumber(edited_visa_no);
        }
        }
            try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update customers set VISAnum = '"+edited_visa_no+"' where nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }

    public double getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(double total_cost) {
        this.total_cost = total_cost;
    }
         public void Edit_VISA_Password(String edited_visa_password){
        Customer keep_customer=new Customer(this);
        this.setVISApassword(edited_visa_password);
        for (int i=0;i<Customer_list.size();i++){
      if((keep_customer.getUsername()).equals(Customer_list.get(i).getUsername()))
        {
            Customer_list.get(i).setVISApassword(edited_visa_password);
        }
        }
            try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;
            query = "update customers set VISApassword = '"+edited_visa_password+"' where nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
    
               public void Edit_Password(String edited_password){
        Customer keep_customer=new Customer(this);
        this.setPassword(edited_password);
        for (int i=0;i<Customer_list.size();i++){
          if((keep_customer.getUsername()).equals(Customer_list.get(i).getUsername()))
        {
            Customer_list.get(i).setPassword(edited_password);
        }
        }
            try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
           String query;
            query = "update customers set password = '"+edited_password+"' where nationalID = "+this.getNationalID();
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
    public void Edit_newPassword(String Email,String new_password){
        for (int i=0;i<Customer_list.size();i++){
          if(Email.equals(Customer_list.get(i).getEmail()))
        {
            Customer_list.get(i).setPassword(new_password);
            
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
            query = "update customers set password = '"+ new_password +"' where email ="+"'"+Email  +"'";
            s.execute(query);
            c.close();
            s.close();
        } catch (SQLException ex) {
         System.out.println(ex.getMessage());
        }
    }
    }