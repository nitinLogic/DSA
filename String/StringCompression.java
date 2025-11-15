//This code represents string in form of repeated character followed by it's count
import java.util.*; 

public class StringCompression {
    public static StringBuilder compressedString(String str){
         StringBuilder sb = new StringBuilder("");
        
         for(int i = 0; i < str.length(); i++){
            Integer count = 1;

            while(i < str.length() -  1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(Integer.toString(count));
            }
         }
        return sb;
    }

    public static void main(String args[]){
       String str = "aaabbcccdd";
       System.out.println(compressedString(str));
    }
}
