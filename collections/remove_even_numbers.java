import java.util.*;
class remove_even_numbers{
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        // [1, 2, 3, 4, 5, 6]
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.removeIf(x->x%2==0);
            System.out.print(list);
    }
}