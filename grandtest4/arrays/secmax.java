import java.util.*;
class secmax{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int secmax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>secmax && arr[i]<max){
                secmax=arr[i];
            }
        }
        System.out.print(secmax);
        

    }
}