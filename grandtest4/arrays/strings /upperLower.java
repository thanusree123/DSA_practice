import java.util.*;
class upperLower {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String ans = "";

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
                ans += Character.toLowerCase(ch);

            else if(Character.isLowerCase(ch))
                ans += Character.toUpperCase(ch);

            else
                ans += ch;
        }

        System.out.println(ans);
    }
}