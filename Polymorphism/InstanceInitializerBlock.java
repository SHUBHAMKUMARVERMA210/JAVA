package Polymorphism;

public class InstanceInitializerBlock {
    int speed;
    
    {
        System.out.println("Instance initializer block is called");
        speed = 100;
    }
    
    // Constructor
    public InstanceInitializerBlock() {
        System.out.println("Constructor is called");
        System.out.println("Speed is " + speed);
    }
    
    public static void main(String[] args) {
        System.out.println("Creating first instance:");
        InstanceInitializerBlock b1 = new InstanceInitializerBlock();
        
        System.out.println("\nCreating second instance:");
        InstanceInitializerBlock b2 = new InstanceInitializerBlock();
    }
}
