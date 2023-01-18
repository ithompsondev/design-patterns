package patterns.creational.factory.object.simplefactory;

import patterns.creational.factory.CheeseAndCornSamoosa;
import patterns.creational.factory.ChickenSamoosa;
import patterns.creational.factory.MinceSamoosa;
import patterns.creational.factory.Samoosa;


// We delegate Samoosa object creation to a factory class, whose sole responsibility is to create a samoosa object
public class SimpleSamoosaFactory {
    
    private Samoosa samoosa;
    
    public Samoosa makeSamoosa(String samoosaFilling) {
        if (samoosaFilling.equals("chicken")) {
            samoosa = new ChickenSamoosa("chicken");
        } else if (samoosaFilling.equals("mince")) {
            samoosa = new MinceSamoosa("mince");
        } else if (samoosaFilling.equals("cheese and corn")) {
            samoosa = new CheeseAndCornSamoosa("cheese and corn");
        } else {
            throw new IllegalArgumentException("We do not stock a samoosa with the following filling: " + samoosaFilling);
        }
    
        return samoosa;
    }
}
