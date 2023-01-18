package patterns.creational.factory.method.factories;

import patterns.creational.factory.ChickenSamoosa;
import patterns.creational.factory.Samoosa;


public class ChickenSamoosaFactory extends AbstractSamoosaFactory {
    
    @Override
    public Samoosa makeSamoosa() {
        return new ChickenSamoosa("chicken");
    }
}
