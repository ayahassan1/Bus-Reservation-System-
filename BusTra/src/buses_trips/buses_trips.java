
package buses_trips;

import Bus.*;
import static Bus_Reservation_System.Bus_Reservation_System.Trip_list;
import Person.Admin;
import Trip.*;
import java.util.ArrayList;

public class buses_trips {
    Bus Bus;
    ArrayList<Trip> upcoming_trips = new ArrayList();
    ArrayList<Trip> done_trips = new ArrayList();
    Trip running_trip;
    Admin admin = new Admin();

    public buses_trips(Bus Bus) {
        this.Bus = Bus;
       set_trips();
    }

    public Bus getBus() {
        return Bus;
    }

    public void set_trips()
    {
        if (!upcoming_trips.isEmpty())
        { upcoming_trips.clear();}
        if(!done_trips.isEmpty())
        { done_trips.clear();}
        if(running_trip!=null)
        {   running_trip = null;}
           admin.Change_TripStatus();
        admin.set_running_trips();
         for(int i = 0 ; i < Trip_list.size();i++)
        {
            if(Bus.equals(Trip_list.get(i).getTripBus()))
            {
                  if (Trip_list.get(i).getStatus().equalsIgnoreCase( "upcoming"))
                  {
              upcoming_trips.add(Trip_list.get(i)); 
                  }
              else if(Trip_list.get(i).getStatus().equalsIgnoreCase( "Running"))
            {
               running_trip= Trip_list.get(i); 
            }
            else  if(Trip_list.get(i).getStatus().equalsIgnoreCase( "Done"))
            {  
                done_trips.add(Trip_list.get(i));
            }
            else {}
            }
        }
    }
    
    public ArrayList<Trip> getUpcoming_trips() {
      set_trips();
        return upcoming_trips;
    }

    public ArrayList<Trip> getDone_trips() {
              set_trips();
        return done_trips;
    }

    public Trip getRunning_trip() {
             set_trips();
 return running_trip;
    }
    
    public boolean hasTrips()
    {
        set_trips();
        if (upcoming_trips.isEmpty()  && running_trip == null)
        return false;
        else return true;
    }
    
    public void addNewTrip(Trip newTrip)
    {
        if ( newTrip.getStatus().equalsIgnoreCase("Upcoming"))
        {
            upcoming_trips.add(newTrip); 
        }
        else if ( newTrip.getStatus().equalsIgnoreCase("Done"))
        {
          done_trips.add(newTrip);  
        }

    }
    
}
