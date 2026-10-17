package basic_practices;
import java.util.*;
public class valid_palindrome {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String rev="";
        StringBuilder sb=new StringBuilder(str);
        rev=sb.reverse().toString();
        if(rev.equals(str)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print(" not Palindrome");
        }
        s.close();
        
    }
    
}
