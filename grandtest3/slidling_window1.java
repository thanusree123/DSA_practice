import java.util.*;
class slidling_window1{
    public static void main(String args[]){
        int arr[]={12,2,3,4,4,5,};
        int k=3;
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++){
            currsum+=arr[i];
        }
         maxsum=currsum;
        for( int i=k;i<arr.length;i++){
            currsum+=arr[i]-arr[i-k];
        }
        maxsum=Math.max(maxsum,currsum);
        System.out.println(maxsum);
    }

}