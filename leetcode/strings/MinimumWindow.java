// import java.util.*;

// class MinimumWindow {
//     public static String minWindow(String s, String t) {

//         // What characters and frequencies do we need?
//         HashMap<Character, Integer> need = new HashMap<>();

//         for (char c : t.toCharArray()) {
//             need.put(c, need.getOrDefault(c, 0) + 1);
//         }

//         // Characters currently inside our window
//         HashMap<Character, Integer> window = new HashMap<>();

//         int left = 0;
//         int right = 0;

//         // Number of required characters currently satisfied
//         int formed = 0;

//         // Number of different characters we need
//         int required = need.size();

//         // Store the smallest window
//         int minLength = Integer.MAX_VALUE;
//         int minStart = 0;

//         while (right < s.length()) {

//             // Add the right character
//             char c = s.charAt(right);
//             window.put(c, window.getOrDefault(c, 0) + 1);

//             // If this character's required frequency is now satisfied
//             if (need.containsKey(c) &&
//                 window.get(c).intValue() == need.get(c).intValue()) {

//                 formed++;
//             }

//             // If all required characters are satisfied
//             while (formed == required) {

//                 // Current window length
//                 int currentLength = right - left + 1;

//                 // Is this the smallest window so far?
//                 if (currentLength < minLength) {
//                     minLength = currentLength;
//                     minStart = left;
//                 }

//                 // Remove the left character
//                 char leftChar = s.charAt(left);

//                 window.put(leftChar, window.get(leftChar) - 1);

//                 // If removing it makes the window invalid
//                 if (need.containsKey(leftChar) &&
//                     window.get(leftChar) < need.get(leftChar)) {

//                     formed--;
//                 }

//                 left++;
//             }

//             right++;
//         }

//         if (minLength == Integer.MAX_VALUE) {
//             return "";
//         }

//         return s.substring(minStart, minStart + minLength);
//     }

//     public static void main(String[] args) {
//         String s = "ADOBECODEBANC";
//         String t = "ABC";

//         System.out.println(minWindow(s, t));
//     }
// }