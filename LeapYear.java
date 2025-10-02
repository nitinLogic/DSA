//This program checks if a year is leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        //Input year from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        //If year is non-divisible by 4, it is not leap year
        if(year % 4 == 0){

            //Century year is a leap year if divisible by 400
            if(year % 100 == 0){
                if(year % 400 == 0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Ordinary Year");
            }
            else
                System.out.println("Leap Year");    
        }
        else
            System.out.println("Ordinary Year");
    }    
}
