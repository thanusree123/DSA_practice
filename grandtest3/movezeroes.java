import java.util.*;
class movezeroes{
    public static void movezeroes(int arr[]){
        int writepointer=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[writepointer];
                arr[writepointer]=temp;
                writepointer++;
            }
        }
    }
    public static void main(String args[]){
        int nums[]={0,1,0,3,12};
        movezeroes(nums);
        System.out.print(Arrays.toString(nums));

    }
}