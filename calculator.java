//This is a basic calculator program using switch statement

import java.util.*;

public class calculator{
    public static void main(String args[]){

        //Input operands from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        //Input operator from user
        System.out.print("Enter an operator from +, -, /, *, %: ");
        char operator = sc.next().charAt(0);    

        //Conditional switch statement
        switch (operator) {
            case '+': System.out.println("a + b = " + (a + b));
                
                break;
            case '-': System.out.println("a - b = " + (a - b));
                
                break;
            case '/': System.out.println("a / b = " + (a / b));
                
                break;
            case '*': System.out.println("a * b = " + (a * b));
                
                break;
            case '%': System.out.println("a % b = " + (a % b));
                
                break;
            default: System.out.println("Invalid operator");
                break;
        }
    }
}