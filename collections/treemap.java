 import java.util.*;
public class treemap{
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "Ravi");
        map.put(10, "Anu");
        map.put(20, "Sam");
        map.put(10, "Priya");

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.get(20));
    }
    
}
