import java.util.*;
class insertion_of_two_arrays{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3,5,6};
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            set.add(x);
        }
        for(int x1:arr1){
            set.add(x1);
        }
        System.out.print(set);
    }
}