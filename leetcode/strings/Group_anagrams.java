import java.util.*;
class Group_anagrams{
    public static void main(String args[]){
        String strs[]={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String key=new String(ch);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(s);
        }
        System.out.print(new ArrayList<>(map.values()));


    }
}