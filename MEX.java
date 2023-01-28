MEX
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a sequence of length N consisting of integers:
A=(A1, A2,...., AN)
Find the smallest non-negative integer not in (A1, A2,....,AN).
Input
The input contains N and elements of sequence separated by a new line.
N
A1, A2,. , AN

Constraints
1≤N≤2000
0≤Ai≤2000
All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
8
0 3 2 6 2 1 0 0
Sample Output 1
4

Sample Input 2
3
2000 2000 2000
Sample Output 2
0
  
  
**********************************************************************

Code:

import java.io.*; // for handling input/output import java.util.*; // contains Collections framework
// don't change the name of this class // you can add inner classes if needed
class Main {
    static int helper(int, int){
    }
    public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int N sc, nextInt(); =
    int A[] = new int[N];
    for (int i=; i <n; i++) {
          A[i] sc.nextInt();
    }
    int miss helper(A, N); =
    System.out.println(miss);
  }
}
