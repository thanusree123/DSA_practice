import java.util.*;
class maximum_sum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=3;
        int currentsum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<k;i++){
            currentsum+=arr[i];
        }
        int maxsum=currentsum;
        for(int i=k;i<n;i++){
            currentsum=currentsum-arr[i-k]+arr[i];
            maxsum=Math.max(currentsum,maxsum);
        }
        System.out.print(maxsum);
    }

}