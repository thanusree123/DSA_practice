import java.util.*;
class first_occuringnum{
    public static int binarysearch(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int target=5;
        int result=binarysearch(arr,target);
        System.out.print(result);
    }
}