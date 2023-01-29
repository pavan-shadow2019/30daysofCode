Alexa and Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa loves to play with strings. She is given a string S consisting of lowercase English letters.
If 'a' appears in S, print the last index at which it appears; otherwise, print −1. (The index starts at 1. )
Input
The input contains only one string.
S

Constraints
1 <= |S| <= 100
Output
Print the answer.
Example
Sample Input 1
abcdaxayz
Sample Output 1
7

Sample Input 2
bcbbbz
Sample Output 2
-1
  
************************************************************
Code:

import java.io.*; // for handling input/output 
import java.util.*; // contains Collections framework
// don't change the name of this class // you can add inner classes if needed
class Main{
     public static void main(String[] args) {
      // Your code here
      Scanner sc = new Scanner(System.in);
      String ssc.next();
      int lastIndex= -1;
      for (int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'a'){
          lastIndex i+1;
          }
        }
        System.out.println(lastIndex);
     }
}
