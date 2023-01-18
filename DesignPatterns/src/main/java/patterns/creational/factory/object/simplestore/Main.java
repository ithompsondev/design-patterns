package patterns.creational.factory.object.simplestore;

public class Main {
    
    public static void main(String[] args) {
        SimpleSamoosaStore samoosaStore = new SimpleSamoosaStore();
        samoosaStore.orderSamoosa("chicken", 25);
        samoosaStore.orderSamoosa("mince", 25);
        
        // Throws exception
        // samoosaFactory.orderSamoosa("cheese and corn", 25);
    }
}
