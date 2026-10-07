
import java.util.*;
public class practicearraylist {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n=s.nextInt();
        int num=0;
        for(int i=0;i<n;i++){
            num=s.nextInt();
            list.add(num);
        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(n-1));

    }
}

