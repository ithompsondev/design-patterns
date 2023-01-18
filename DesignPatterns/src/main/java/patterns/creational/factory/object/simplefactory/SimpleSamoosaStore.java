package patterns.creational.factory.object.simplefactory;

import patterns.creational.factory.Samoosa;


// The samoosa store becomes a client of the samoosa factory
// Many different clients may need to create objects for different purposes
// So this setup allows us to avoid repeated object creation code in every client
// Instead all object creation is handled in the factory
public class SimpleSamoosaStore {
    
    private SimpleSamoosaFactory samoosaFactory;
    
    public Samoosa orderSamoosa(String samoosaFilling, int quantity) {
        samoosaFactory = new SimpleSamoosaFactory();
        Samoosa samoosa = samoosaFactory.makeSamoosa(samoosaFilling);
        
        System.out.println("Preparing " + quantity + " " + samoosaFilling + " samoosas");
        samoosa.fold();
        samoosa.glue();
        samoosa.fry();
        
        return samoosa;
    }
}
