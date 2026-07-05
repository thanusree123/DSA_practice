import java.util.*;
class secmin{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int secmin= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>min && arr[i]<secmin){
                secmin=arr[i];
            }
        }
        System.out.print(secmin);
    }

}