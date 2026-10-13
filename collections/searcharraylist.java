
import java.util.*;

public class searcharraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        int n = 5;
        int target = 30;

        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        s.close();
    }
}
