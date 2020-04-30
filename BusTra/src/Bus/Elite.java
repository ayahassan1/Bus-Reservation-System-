package Bus;

import Person.Driver;

public class Elite  extends Bus {
     private  final int totalNumSeats ;
 public Elite (String platenum, Driver BusDriver){
                super(platenum , BusDriver);
                this.totalNumSeats=12;
                this.setIsClassic(false);
     }
 public Elite (String platenum){
           super(platenum);
            this.totalNumSeats=12;
                this.setIsClassic(false);
       }
    public int getTotalNumSeats() {
        return totalNumSeats;
    }
 
}