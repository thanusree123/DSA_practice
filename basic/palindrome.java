import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int i=0;
        int j=str.length()-1;
        boolean result=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                 result=false;
                break;
            }
            i++;
            j--;
        }
        System.out.print(result);
    }
} 