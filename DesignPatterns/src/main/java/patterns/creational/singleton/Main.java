package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        LazySwitch lazySwitch = LazySwitch.getInstance();
        
        System.out.println("Switch on: " + lazySwitch.isOn());
        System.out.println("Flipping switch. . .");
        lazySwitch.flip();
        System.out.println("Switch on: " + lazySwitch.isOn());
        
        System.out.println("Same instances? " + lazySwitch.equals(LazySwitch.getInstance()));
    }
}
