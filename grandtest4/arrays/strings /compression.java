import java.util.*;
class compression{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String ans="";
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                ans+=str.charAt(i);
                ans+=count;
                count=1;
            }
        }
        ans+=str.charAt(str.length()-1);
        ans+=count;
        System.out.print(ans);

    }
}