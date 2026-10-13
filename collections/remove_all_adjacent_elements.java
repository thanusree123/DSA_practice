import java.util.*;
public class remove_all_adjacent_elements {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(st.isEmpty()){
            st.push(c);
          }
          else if(st.peek()==c){
            st.pop();

          }else{
            st.push(c);
          }
            
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        System.out.print(sb);
        s.close();
    }
    
}
