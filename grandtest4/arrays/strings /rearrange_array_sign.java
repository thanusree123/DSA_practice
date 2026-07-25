import java.util.*;
class rearrange_array_sign{
    public static void main(String args[]){
        int arr[]={3,1,-2,-5,2,-4};
        int pos=0;
        int neg=1;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

}