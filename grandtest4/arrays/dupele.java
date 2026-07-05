import java.util.*;
class dupele{
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]);
                return;
            }
            set.add(arr[i]);
        }
    }
    
}