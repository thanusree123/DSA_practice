import java.util.*;
class sum_of_elements{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int sum=0;
        for(int x:list){
            sum+=x;
        }
        System.out.print(sum);

    }
}