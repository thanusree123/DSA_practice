class palindrome{
    public static boolean palindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char leftchar=Character.toLowerCase(s.charAt(left));
            char rightchar=Character.toLowerCase(s.charAt(right));
            if(leftchar!=rightchar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        System.out.print(palindrome(s));
    }
}