package patterns.creational.factory.method.factories;

import patterns.creational.factory.Samoosa;

// We define this interface for creating objects
// However, we leave the responsibility of which object is created to the appropriate extending subclass
// Where the subclass will know exactly what object to construct
public abstract class AbstractSamoosaFactory {
    
    // This method is no longer dependent on the 'filling' object since we no longer need it
    // Because users of this retailer/factory can directly invoke the concrete factory class they need for the product they want
    public Samoosa constructSamoosa() {
        Samoosa samoosa = makeSamoosa();
        samoosa.fold();
        samoosa.glue();
        samoosa.fry();
        
        return samoosa;
    }
    
    public abstract Samoosa makeSamoosa();
}
