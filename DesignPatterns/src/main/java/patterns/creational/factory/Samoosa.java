package patterns.creational.factory;

// The base object
public abstract class Samoosa {
    protected String filling;
    
    public Samoosa(String filling) {
        this.filling = filling;
    }
    
    public void fold() {
        System.out.println("Folding " + filling + " samoosa");
    }
    
    public void glue() {
        System.out.println("Glueing " + filling + " samoosa");
    }
    
    public abstract void fry();
    
    public String getFilling() {
        return filling;
    }
}
