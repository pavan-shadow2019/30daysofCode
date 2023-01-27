Play with 0's and 2's
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alexa Loves to play with 0's and 2's. Among the positive integers that consist of 0's and 2's when written in base 10, he wanted to find the Kth smallest integer. Help him find that.
Input
Input is given from Standard Input in the following format:

K
Output
Print the answer as an integer.
Here, the exact value must be printed as an integer, even if it is big. Unnecessary leading zeros such as 0523 are not allowed.
Example
Sample Input 1
3
Sample Output 1
22

Sample Input 2
11
Sample Output 2
2022
  
******************************************

Code:

import java.io.*; // for handling input/output 
import java.util.*; // contains Collections framework
// don't change the name of this class // you can add inner classes if needed 
class Main {
    static StringBuilder helper (long K){ 
      StringBuilder ans = new StringBuilder(); 
      while(K>0){
        int val =(int) (K%2);
        if (val == 1) ans.append(2);
        else ans.append(0);
        K /=2;
        }
       return ans. reverse();
    }  
    public static void main(String[] args) {
       // Your code here
       Scanner sc = new Scanner(System.in);
       long K sc.nextLong(); 
       StringBuilder ans = helper(K);
       System.out.println(ans);
  }
}  
