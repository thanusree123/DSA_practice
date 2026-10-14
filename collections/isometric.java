import java.util.*;
public class isometric {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        boolean result=true;
        if(s.length()!=t.length()){
            result=false;
    
        }
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i);
            map1.put(c1,c2);
            map2.put(c2,c1);
            if(map1.containsKey(c1)&&map1.get(c1)!=c2){
                result=false;
            }
        }
        System.out.print(result);
        sc.close();
    }
    
}
