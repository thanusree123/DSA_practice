import java.util.*;
class pair{
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int need=target-arr[i];
            if(set.contains(need)){
                System.out.print(need+" "+arr[i]);
                return;
            }
            set.add(arr[i]);
        }
        System.out.print("no pair");
    }
}