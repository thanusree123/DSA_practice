import java.util.*;
class remove_duplicate{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
       ArrayList<Integer> result=new ArrayList<>();
       for(int x:list){
         if(!result.contains(x)){
            result.add(x);
         }
       }
       System.out.print(result);
    }
}