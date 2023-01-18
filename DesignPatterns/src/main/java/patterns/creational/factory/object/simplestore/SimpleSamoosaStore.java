package patterns.creational.factory.object.simplestore;

import patterns.creational.factory.ChickenSamoosa;
import patterns.creational.factory.MinceSamoosa;
import patterns.creational.factory.Samoosa;

// Factories are used to create objects
public class SimpleSamoosaStore {
    
    private Samoosa samoosa;
    
    public Samoosa orderSamoosa(String samoosaFilling, int quantity) {
        // We make use of the NEW keyword to concretely instantiate an object of type Samoosa
        if (samoosaFilling.equals("chicken")) {
            samoosa = new ChickenSamoosa("chicken");
        } else if (samoosaFilling.equals("mince")) {
            samoosa = new MinceSamoosa("mince");
        } else {
            throw new IllegalArgumentException("We do not stock a samoosa with the following filling: " + samoosaFilling);
        }
        
        System.out.println("Preparing " + quantity + " " + samoosaFilling + " samoosas");
        samoosa.fold();
        samoosa.glue();
        samoosa.fry();
        
        return samoosa;
    }
}
