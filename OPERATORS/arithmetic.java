package OPERATORS;

import java.util.Scanner;
public class arithmetic {
    
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;
        Scanner in = new Scanner(System.in);
    
        // ENTER SECOND NUMBER
        System.out.println("Choose an operator: +, -, *, or /");
        operator = in.next().charAt(0);
    
        // ENTER FIRST NUMBER
        System.out.println("Enter first number");
        number1 = in.nextDouble();
    
        System.out.println("Enter second number");
        number2 = in.nextDouble();
    
        switch (operator) {
    
          // ADDITION
          case '+':
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
            break;
    
          // SUBTRACTION
          case '-':
            result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
            break;
    
          // MULTIPLICATION
          case '*':
            result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
            break;
    
          // DIVISION
          case '/':
            result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
            break;
    
          default:
            System.out.println("Invalid operator!");
            break;
        }
    
        in.close();
      }
    
    
}
