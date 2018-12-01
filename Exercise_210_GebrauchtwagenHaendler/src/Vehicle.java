
import java.time.LocalDate;
import java.util.ArrayList;


public class Vehicle {
    
    enum VehicleType{
        PKW,Truck;
    }
    
    
    protected String marke;
    protected String baujahr;
    protected double km;
    protected ArrayList<Extra> extras = new ArrayList();
    

    public Vehicle(String marke, String baujahr, double km,ArrayList extras) {
        this.marke = marke;
        this.baujahr = baujahr;
        this.km = km;
        this.extras=extras;
    }

    public String getMarke() {
        return marke;
    }

    public String getBaujahr() {
        return baujahr;
    }

    public double getKm() {
        return km;
    }

    public ArrayList<Extra> getExtras() {
        return extras;
    }
    
    

    public double calcPrice(){
        
        return 0.0;
    }
}
