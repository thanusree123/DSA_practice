import java.util.*;

class insertchar {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(s.nextLine());
        int index = s.nextInt();
        char ch = s.next().charAt(0);
        sb.insert(index,ch);
        System.out.println(sb);

    }
}