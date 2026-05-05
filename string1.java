// You are given a string S consisting of lowercase English letters and digits,
// where the letters represent items and the digits represent packaging lines.

// You have to count how many items are wrapped by packaging lines,
// i.e., how many letters have a digit on the left and a digit on the right in the string.

// Your task is to find and return an integer value representing the
// number of items wrapped in packaging lines.

// Sample Testcase:1
// ------------------------
// input=1a2b3c4d5
// output=4

// Explanation:
// ------------------------------
// In "1a2b3c4d5",
// ‘a’ is between 1 and 2 
// ‘b’ is between 2 and 3 
// ‘c’ is between 3 and 4 
// ‘d’ is between 4 and 5 
// Hence total wrapped = 4

import java.util.*;
class string1
{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        for(int i=1;i<str.length()-1;i++){
        char c=str.charAt(i);
        char l=str.charAt(i-1);
        char r=str.charAt(i+1);
        if(Character.isLetter(c) && Character.isDigit(l) && Character.isDigit(r)){
             count++;
         }
         }
         System.out.print(count);
    }
}


