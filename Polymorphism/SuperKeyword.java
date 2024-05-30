package Polymorphism;

class SuperKeyword {
    String color="white"; 
}

class Person extends SuperKeyword{  
    String color="black";  
    void printColor(){  
    System.out.println(color);  
    System.out.println(super.color);  
    }  
    } 

    class TestSuper1{  
        public static void main(String args[]){  
        Person d=new Person();  
        d.printColor();  
        }} 