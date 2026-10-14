package basic_practices;
import java.util.*;
public class move_zeroes {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int right=0;
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int left=1;left<n;left++){
        if(arr[left]!=0){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right++;
        }
    }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
      
    }
    
}
