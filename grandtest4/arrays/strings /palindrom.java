import java.util.*;
class palindrom{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);

        }
        if(str.equals(ans)){
            System.out.print("palindrom");
        }
        else{
             System.out.print(" not palindrom");
        }
        
    }
}