Prefix Strings
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given two strings S and T consisting of lowercase English letters. Determine if S is a prefix of T.
Input
The input contains two strings separated by a new line.
S
T

Constraints
S and T are strings of lengths between 1 and 100 (inclusive) consisting of lowercase English letters.
Output
Print "Yes" if S is a prefix of T, "No" otherwise.

Note: that the judge is case-sensitive.
Example
Sample Input 1
new
newton
Sample Output 1
Yes

Sample Input 2
ewt
newton
Sample Output 2
No

Sample Input 3
aaaa
aa
Sample Output 3
No



***************************************************

Code:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main (String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine(); 
    String T = sc.nextLine();
    int n = S.length();
    int m = T.length();
    if (n>m){
      System.out.println("Yes");
    }else{
      int i = 0;
      for(; i<n; i++){ 
        if(S.charAt(i) != T.charAt(i)) break;
      }
      if(i == n) {
        System.out.print("Yes");
      }else{
        System.out.print("No");
      }
      }
  }
}
