class Anagram{
public static void main(String args[]){
    String str="slient";
    String str2="listen";
    if(str.length()!=str2.length()){
        System.out.print(false);
        return;
    }
    int freq[]=new int[26];
    for(int i=0;i<str.length();i++){
        freq[str.charAt(i)-'a']++;
        freq[str2.charAt(i)-'a']--;
    }
    for(int i=0;i<26;i++){
        if(freq[i]!=0){
            System.out.print(false);
           return;
        }
    }
    System.out.print(true);
}
}