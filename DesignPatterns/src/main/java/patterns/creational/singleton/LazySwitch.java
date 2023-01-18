package patterns.creational.singleton;

public class LazySwitch {
    
    // The singular instance of this class that is accessible globally
    private static LazySwitch uniqueInstance = null;
    
    private boolean state;
    
    // Ensure that no other class can instantiate an object of this class
    private LazySwitch() {
        state = false;
    }
    
    // We use lazy construction to only construct an instance of this class if it has not yet been constructed
    // Lazy construction allows us to create the object only when it is needed and is favoured for large objects
    public static LazySwitch getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySwitch();
        }
        
        return uniqueInstance;
    }
    
    public void flip() {
        state = !state;
    }
    
    public boolean isOn() {
        return state;
    }
}
