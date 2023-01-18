package patterns.creational.factory.object.extendedsimplestore;


public class Main {
    
    public static void main(String[] args) {
        SimpleSamoosaStore samoosaStore = new SimpleSamoosaStore();
        samoosaStore.orderSamoosa("chicken", 25);
        samoosaStore.orderSamoosa("mince", 25);
        samoosaStore.orderSamoosa("cheese and corn", 25);
    }
}
