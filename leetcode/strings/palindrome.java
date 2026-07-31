import java.util.*;
class palindrome{
    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        if(rev.equals(s)){
            System.out.print("palindrome");
        }
        else{
             System.out.print(" not palindrome");
        }
    }

}