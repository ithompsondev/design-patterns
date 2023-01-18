package patterns.creational.factory.method.factories;

import patterns.creational.factory.CheeseAndCornSamoosa;
import patterns.creational.factory.Samoosa;


public class CheeseAndCornSamoosaFactory extends AbstractSamoosaFactory {
    
    @Override
    public Samoosa makeSamoosa() {
        return new CheeseAndCornSamoosa("cheese and corn");
    }
}
