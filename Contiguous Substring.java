Contiguous Substring
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given strings S and T consisting of lowercase English letters. Determine whether T is a (contiguous) substring of S.

A string Y is said to be a (contiguous) substring of X if and only if Y can be obtained by performing the operation below on X zero or more times.

Do one of the following.
i) Delete the first character in X.
ii) Delete the last character in X.
For instance, the tag is a (contiguous) substring of voltage, while ace is not a (contiguous) substring of atcoder.
Input
The input is given from Standard Input in the following format:
S
T

Constraints
S and T consist of lowercase English letters.
1≤∣S∣, ∣T∣≤100 (∣X∣ denotes the length of a string X. )
Output
If T is a (contiguous) substring of S, print Yes; otherwise, print No.
Example
Sample Input 1
voltage
tag
Sample Output 1
Yes

Sample Input 2
gorilla
gorillagorillagorilla
Sample Output 2
No


******************************************

Code: 

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class // you can add inner classes if needed
class Main
    public static void main (String[] args) { 
    // Your code here
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String = sc.next();
    if (S.contains(T)){ 
      System.out.println("Yes");
    }else{
      System.out.println("No");
   }
}

