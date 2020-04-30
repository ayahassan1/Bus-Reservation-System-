package Bus;


import Person.Driver;

public abstract class Bus {
     private String plateNum  ;
     private Driver busDriver;
     private boolean isClassic;
     
  public Bus( String plateNum , Driver busDriver){
      
      this.setPlateNum(plateNum);
      this.setBusDriver(busDriver);
  }   
 public Bus (String platenum){
     this.plateNum=platenum;
 }
 public void setPlateNum (String plateNum)
 {
     this.plateNum = plateNum;
 }

    public String getPlateNum() {
        return plateNum;
    }

    public Driver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(Driver busDriver) {
        this.busDriver = busDriver;
    }

    public boolean isIsClassic() {
        return isClassic;
    }

    public void setIsClassic(boolean isClassic) {
        this.isClassic = isClassic;
    }
    
}

