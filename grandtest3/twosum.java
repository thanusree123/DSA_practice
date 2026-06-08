import java.util.*;
class twosum{
    public static int[] findpair(int []num,int target){
        int left=0;
        int right=num.length-1;
        int currentsum=0;
        while(left<=right){
            currentsum=num[left]+num[right];
            if(currentsum==target){
                return new int[]{left,right};
            }
            else if(currentsum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};

    }
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;
        int result[]=findpair(arr,target);
        System.out.println(target+" "+ Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }


}