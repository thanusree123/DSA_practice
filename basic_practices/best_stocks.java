package basic_practices;
import java.util.*;
public class best_stocks {
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int max=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int minprice=arr[0];
        for(int i=0;i<n;i++){
                int profit=arr[i]-minprice;
                max=Math.max(profit,max);
                minprice=Math.min(minprice,arr[i]);
            }
        System.out.print(max);
        s.close();
    }
    
}
