import java.util.*;
class revarr{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}