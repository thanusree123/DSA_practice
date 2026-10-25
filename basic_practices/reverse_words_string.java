package basic_practices;
public class reverse_words_string {
    public static void main(String args[]){
        String s="  hello world  ";
        String str[]=s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
        
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        System.out.println(sb.toString());
    }
    
}
