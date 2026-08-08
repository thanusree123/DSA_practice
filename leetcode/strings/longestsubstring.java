class longestsubstring{
    public static void main(String args[]){
        String s="abcabcbb";
        int left=0;
        int maxlen=0;
        int freq[]=new int[26];
        for(int right=0;right<s.length();right++){
            int index=s.charAt(right);
            freq[index-'a']++;
            while(freq[s.charAt(right)-'a']>1){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.print(maxlen);
    }
}