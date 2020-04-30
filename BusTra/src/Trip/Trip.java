package Trip;
import Bus.*;

public class Trip {
     private String   code, pickUp , destination, pickUpDate, pickUpTime ,arrivalDate, arrivalTime; int cost;
     private static  int availableSeatsNum;
     private  String status;
     private  Bus TripBus;
      private String seat_code;
      
    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSeat_code() {
        return seat_code;
    }

    public void setSeat_code(String seat_code) {
        this.seat_code = seat_code;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
  
 public Trip(String code , String pickUp, String  pickUpDate, String pickUpTime, String  destination,String arrivalDate,
         String arrivalTime,int availableSeatsNum ,Bus TripBus ,int Cost , String Status,String seat_code)
 {
     this.setCode(code);
     this.setPickUp(pickUp);
     this.setPickUpDate(pickUpDate);
     this.setPickUpTime(pickUpTime);
     this.setDestination(destination);
     this.setarrivalDate(arrivalDate);
     this.setarrivalTime(arrivalTime);
     this.setAvailableSeatsNum(availableSeatsNum);
     
     this.setTripBus(TripBus);
     
     this.setCost(Cost);
     this.setStatus(Status);
     this.setSeat_code(seat_code);
 }
  public Trip()
 {
     this.setCode(null);
     this.setPickUp(null);
     this.setPickUpDate(null);
     this.setPickUpTime(null);
     this.setDestination(null);
     this.setarrivalDate(null);
     this.setarrivalTime(null);
     this.setCost(0);
     this.setStatus(null);
 }
  public Trip(String code , String pickUp, String  pickUpDate, String pickUpTime, String  destnation,String arrivalDate, String arrivalTime,int Cost , String Status)
 {
     this.setCode(code);
     this.setPickUp(pickUp);
     this.setPickUpDate(pickUpDate);
     this.setPickUpTime(pickUpTime);
     this.setDestination(destnation);
     this.setarrivalDate(arrivalDate);
     this.setarrivalTime(arrivalTime);
     this.setCost(Cost);
     this.setStatus(Status);
 }
         public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getarrivalDate() {
        return arrivalDate;
    }

    public void setarrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getarrivalTime() {
        return arrivalTime;
    }

    public void setarrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAvailableSeatsNum() {
        return availableSeatsNum;
    }

    public void setAvailableSeatsNum(int availableSeatsNum) {
        this.availableSeatsNum = availableSeatsNum;
    }

    public Bus getTripBus() {
        return TripBus;
    }

    public void setTripBus(Bus TripBus) {
        this.TripBus = TripBus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
}

