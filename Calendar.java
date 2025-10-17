//This program prints calendar for any given year
import java.util.*;

public class Calendar {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();    //Input year

        //Calculate first day of given year
        int firstDayOfYear = 28 + (year % 100) + ((year % 100) / 4) + 
                                    ((year / 100) / 4) - (2 * (year / 100));
        firstDayOfYear = firstDayOfYear % 7;
  
        //Print Jan month calendar
        System.out.printf("%-3s %-3s %-3s %-3s %-3s %-3s %-3s%n", 
                            "Sun", "Mon" ,"Tue" ,"Wed" ,"Thu" ,"Fri" ,"Sat");

        int weekCounter = firstDayOfYear;

        for(int month = 1; month <= 12; month++){
            System.out.println("\nMonth = " + month);
            int lastDate;

            if(month == 1 || month == 3 || month == 5 || month == 7 || 
                month == 8 || month == 10 || month == 12){
                lastDate = 31;
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11){
                lastDate = 30;
            }
            else{
                if(((year % 100 == 0) && (year % 400 == 0)) || (year % 4 == 0))
                    lastDate = 29;
                else
                    lastDate = 28;
            }
            
            if(weekCounter != 0)
                System.out.printf("%" + (4 * weekCounter) + "s", " ");   //Skipping weeks before first day

            for(int date = 1; date <= lastDate; date++){
                if(date < 10){
                    System.out.printf("%-4d", date);
                    weekCounter++;
                }
                else{
                    System.out.printf("%-4d", date);
                    weekCounter++;
                }

                //Check if a week is over
                if(weekCounter % 7 == 0){
                    System.out.println();
                }
            }
            weekCounter = weekCounter % 7;
            System.out.println();   //New Month

        }


    }
}
