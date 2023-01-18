package patterns.creational.factory.method.factories;

import patterns.creational.factory.MinceSamoosa;
import patterns.creational.factory.Samoosa;


public class MinceSamoosaFactory extends AbstractSamoosaFactory {
    
    @Override
    public Samoosa makeSamoosa() {
        return new MinceSamoosa("mince");
    }
}
