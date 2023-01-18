package patterns.creational.factory.method;

import patterns.creational.factory.Samoosa;
import patterns.creational.factory.method.factories.AbstractSamoosaFactory;
import patterns.creational.factory.method.factories.ChickenSamoosaFactory;


public class Main {
    
    // ROUTE MAPPING: Chicken Samoosa
    public static void main(String[] args) {
        AbstractSamoosaFactory samoosaFactory = new ChickenSamoosaFactory();
        Samoosa samoosa = samoosaFactory.constructSamoosa();
    }
}
