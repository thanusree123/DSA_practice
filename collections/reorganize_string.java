import java.util.*;
public class reorganize_string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
       PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
       for(char ch:map.keySet()){
        pq.offer(ch);
       }
       StringBuilder result=new StringBuilder();
       char previous='#';
       while(!pq.isEmpty()){
        char current=pq.poll();
       result.append(current);
       map.put(current,map.get(current)-1);
       if(previous!='#'&&map.get(previous)>0){
        pq.offer(previous);
       }
       previous=current;
       }
       if(result.length()!=s.length()){
        System.out.print(" ");
       }
       System.out.print(result.toString());
       sc.close();
    }
    
}
