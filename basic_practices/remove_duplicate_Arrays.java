package basic_practices;
import java.util.*;
public class remove_duplicate_Arrays {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        list.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                list.add(arr[i]);
            }
        }
        for(int x:list){
            System.out.print(x+" ");
        }
        s.close();
    }
    
}
