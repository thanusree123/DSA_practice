package basic_practices;
import java.util.*;
public class contains_duplicate {
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        boolean result=false;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                result=true;
            }
            set.add(arr[i]);
        }
        System.out.print(result);
    }
    
}
