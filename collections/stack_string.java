import java.util.*;
public class stack_string {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Character>st=new Stack<>();
        String str=s.next();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
        sb.append(st.pop());
        }
        System.out.print(sb);
        s.close();

    }
    
}
