import java.util.*;
class linearsearch{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.print("found");
                return;
            }
            else{
               System.out.print(" not found");
               return;
            }
        }
    }

} 