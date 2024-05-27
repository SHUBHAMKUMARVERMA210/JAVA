package methods;

public class methodoverloading{  
    static int add(int a, int b){return a+b;}  
    static double add(double a, double b){return a+b;}  
    }  
    class TestOverloading3{  
        public static void main(String[] args){  
            System.out.println(methodoverloading.add(11,11));  
            System.out.println(methodoverloading.add(12.3,12.6));    
    }}  