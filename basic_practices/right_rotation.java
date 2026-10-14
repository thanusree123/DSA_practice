package basic_practices;
import java.util.*;
public class right_rotation {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        k=k%n;
        for(int i=n-k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
