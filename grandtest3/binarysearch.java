import java.util.*;
class binarysearch{
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
        int arr[]={1,2,3,4,5,7,8,9};
        int target=6;
        int result=binarysearch(arr,target);
        if(result!=-1){
            System.out.print("element "+result);
        }
        else{
            System.out.print("not found");
        }
    }
}