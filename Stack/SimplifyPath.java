//This code converts an absolute path to simplified canonical path
import java.util.*;

public class SimplifyPath {
    public static String simplifyPath(String str){
        Stack<String> s = new Stack<>();
        String path[] = str.split("/");

        for(int i = 0; i < path.length; i++){
            if(!s.isEmpty() && path[i].equals("..")){
                s.pop();
            }
            else if(!path[i].equals("") 
                    && !path[i].equals(".") 
                    && !path[i].equals("..")){
                s.push(path[i]);
            }
        }

        StringBuilder res = new StringBuilder("");
        if(s.isEmpty())
            return "/";
        while(!s.isEmpty()){
            res.insert(0, s.pop()).insert(0, "/");
        }

        return res.toString();
    }
    public static void main(String args[]){
        String path = "/a/.b/../..//c/";
        System.out.println("Simplified path: " + simplifyPath(path));
    }
}
