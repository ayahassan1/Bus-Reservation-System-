package Bus;

import Person.Driver;


public class Classic extends Bus {
     private  final int totalNumSeats ;
     public Classic (String platenum, Driver BusDriver){
                super(platenum , BusDriver);
                this.totalNumSeats=24;
                this.setIsClassic(true);
     }
       public Classic (String platenum){
           super(platenum);
            this.totalNumSeats=24;
                this.setIsClassic(true);
       }
    public int getTotalNumSeats() {
        return totalNumSeats;
    }
     
}



