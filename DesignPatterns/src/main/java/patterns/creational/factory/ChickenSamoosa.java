package patterns.creational.factory;

// This is a concrete class that extends the abstract superclass
public class ChickenSamoosa extends Samoosa {
    
    public ChickenSamoosa(String filling) {
        super(filling);
    }
    
    @Override
    public void fry() {
        System.out.println("Frying chicken samoosa at " + 160 + " degrees C");
    }
}
