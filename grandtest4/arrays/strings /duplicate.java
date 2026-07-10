import java.util.*;
class duplicate{
     public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char key:map.keySet()){
            if(map.get(key)>1){
            System.out.println(key);
            }
        }
    }

}