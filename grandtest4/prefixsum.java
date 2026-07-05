import java.util.*;
class prefixsum{
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prefix[]=new int[n];
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        prefix[0]=arr[0];
        for(int i=1;i<n-1;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
        

    }

}