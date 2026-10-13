
import java.util.*;

public class parantheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean result = true;
        Stack<Character> st = new Stack<>();

        String str = s.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.empty()) {
                    result = false;
                    break;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    result = false;
                    break;
                }
            }
        }

        // Check after processing the entire string
        if (!st.empty()) {
            result = false;
        }

        if (result) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }

        s.close();
    }
}
