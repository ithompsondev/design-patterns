package patterns.creational.factory;

public class CheeseAndCornSamoosa extends Samoosa {
    
    public CheeseAndCornSamoosa(String filling) {
        super(filling);
    }
    
    @Override
    public void fry() {
        System.out.println("Frying cheese and corn samoosa at " + 160 + " degrees C");
    }
}
