import java.util.*;
public class two_sum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        int compliment=0;
        for(int i=0;i<n;i++){
            compliment=target-arr[i];
            if(map.containsKey(compliment)){
                System.out.println(map.get(compliment) + " " + i);
                break;

            }
            map.put(arr[i],i);
        }
       s.close();


    }
    
}
