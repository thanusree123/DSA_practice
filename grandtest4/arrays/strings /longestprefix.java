import java.util.*;
class longestprefix{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=s.next();
        }
        String prefix=str[0];
        for(int i=0;i<n;i++){
            while(!str[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    System.out.print("no common prefix");
                    return;
                }
            }
        }
        System.out.print(prefix);
    }
}