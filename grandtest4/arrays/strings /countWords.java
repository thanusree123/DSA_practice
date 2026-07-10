import java.util.*;
class countWords{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
       String words[]=str.trim().split(" s");
       System.out.print(words.length);
    }
}