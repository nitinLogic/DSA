//This code checks if two strings are anagrams of each other
import java.util.*;

public class AnagramStr {
    public static boolean checkAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            //Convert string to character array
            char[] chArray1 = str1.toCharArray();
            char[] chArray2 = str2.toCharArray();

            //Sort the character array
            Arrays.sort(chArray1);
            Arrays.sort(chArray2);

            //Compare character arrays
            if(Arrays.equals(chArray1, chArray2))
                return true;
            else
                return false;
        }
        return false;
    }

    public static void main(String args[]){
        String str1 = "earth", str2 = "heart";
        System.out.println(checkAnagram(str1, str2));
    }    
}
