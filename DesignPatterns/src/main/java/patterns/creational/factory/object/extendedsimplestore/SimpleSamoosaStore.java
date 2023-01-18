package patterns.creational.factory.object.extendedsimplestore;

import patterns.creational.factory.CheeseAndCornSamoosa;
import patterns.creational.factory.ChickenSamoosa;
import patterns.creational.factory.MinceSamoosa;
import patterns.creational.factory.Samoosa;

// Factories are used to create objects
public class SimpleSamoosaStore {
    
    private Samoosa samoosa;
    
    public Samoosa orderSamoosa(String samoosaFilling, int quantity) {
        // We can accommodate for more object types by creating more subclasses that extend the common superclass
        if (samoosaFilling.equals("chicken")) {
            samoosa = new ChickenSamoosa("chicken");
        } else if (samoosaFilling.equals("mince")) {
            samoosa = new MinceSamoosa("mince");
        } else if (samoosaFilling.equals("cheese and corn")) {
            samoosa = new CheeseAndCornSamoosa("cheese and corn");
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
