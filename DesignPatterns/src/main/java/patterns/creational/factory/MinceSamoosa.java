package patterns.creational.factory;

// This is a concrete class that extends the abstract superclass
public class MinceSamoosa extends Samoosa {
    
    public MinceSamoosa(String filling) {
        super(filling);
    }
    
    @Override
    public void fry() {
        System.out.println("Frying mince samoosa at " + 170 + " degrees C");
    }
}
