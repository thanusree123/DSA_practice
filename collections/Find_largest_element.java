import java.util.*;
class Find_largest_element{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
         list.add(4);
         list.add(7);
         list.add(2);
         list.add(9);
         list.add(1);
         int max=list.get(0);
         for(int x:list){
            if(max<x){
                max=x;
            }
         }
         System.out.print(max);
    }

}