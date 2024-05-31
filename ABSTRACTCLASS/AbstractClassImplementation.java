package ABSTRACTCLASS;

abstract class Bike{  
    abstract void run();  
  }

class AbstractClassImplementation extends Bike {
    void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bike obj = new AbstractClassImplementation();  
 obj.run();  
} 
}
