package customers_trips;

import Bus.Bus;
import Person.*;
import Trip.Trip;
import Bus_Reservation_System.Bus_Reservation_System;
import static Bus_Reservation_System.Bus_Reservation_System.*;
public class customers_trips{
        private Trip trip_customer;
    private String SeatCode;

        private  Customer current;
         private String userName;
           private double total_Cost_Customer;
     
           
           public customers_trips (String userName ,double total_cost_customer ,String Code, String PickUp, 
                String PickUpDate , String PickUpTime , String destination ,
                String arrivalDate , String arrivalTime , int Cost_Seat , String status ,String seat_code ){
            
              this.trip_customer=new Trip(Code, PickUp, PickUpDate ,   PickUpTime ,  destination ,arrivalDate ,   arrivalTime ,Cost_Seat,status);
              this.userName=userName;
              for(int i=0;i<Customer_list.size();i++){
              if(Customer_list.get(i).getUsername().equals(userName)){
              this.current=Customer_list.get(i);
              }
           }
           this.total_Cost_Customer=total_cost_customer;
           this.setSeatCode(seat_code);
      }

   
           
    public String getSeatCode() {
        return SeatCode;
    }

    public void setSeatCode(String SeatCode) {
        this.SeatCode = SeatCode;
    }
           
    public Trip getTrip_customer() {
        return trip_customer;
    }

    public void setTrip_customer(Trip trip_customer) {
        this.trip_customer = trip_customer;
    }

    public Customer getCurrent() {
        return current;
    }

    public void setCurrent(Customer current) {
        this.current = current;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getTotal_Cost_Customer() {
        return total_Cost_Customer;
    }

    public void setTotal_Cost_Customer(double total_Cost_Customer) {
        this.total_Cost_Customer = total_Cost_Customer;
    }       
}
