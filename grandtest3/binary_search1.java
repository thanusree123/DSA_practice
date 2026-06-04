import java.util.*;
class binary_search1{
    public static void main(String args[]){
        int arr[]={2,4,5,6,7,8,9,10};
        int left=0;
        int right=arr.length-1;
        int target=9;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.print(mid+" found ");
                return;
            }else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.print("not found");
    }
}