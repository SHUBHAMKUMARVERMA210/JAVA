package ACCESSMODIFIERS;

class A{  
  private int data=40;  
  private void msg(){System.out.println("Hello java");}  
  } 

  public class PrivateAccessModifier {
    public static void main(String args[]){  
      PrivateAccessModifier obj=new PrivateAccessModifier();  
      System.out.println(obj.data);  
      obj.msg(); 
      }  
  }