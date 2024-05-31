package ACCESSMODIFIERS;

class A{  
  private A(){}//private constructor  
  void msg(){System.out.println("Hello java");}  
  }  

public class PublicAccessModifier {
public static void main(String args[]){  
    A obj=new A(); 
  }  }