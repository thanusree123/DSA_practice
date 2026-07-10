import java.util.*;
class rev{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        
    }
}