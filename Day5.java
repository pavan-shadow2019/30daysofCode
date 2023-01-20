Question:

Emily and Triplets
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Emily was playing with triplets. She was excited to find out how many triples of non-negative integers (a, b, c) satisfy a+b+c≤S and a×b×c≤T, where S & T are non-negative integers.
Input
The input line contains S, and T separated by space.

Constraints
0≤S≤100
0≤T≤10000
S and T are integers.
Output
Print the number of triples of non-negative integers (a, b, c) satisfying the conditions.
Example
Sample Input 1
1 0

Sample Output 1
4

Sample Input 2
2 5

Sample Output 2
10

Sample Input 3
10 10

Sample Output 3
213


***********************************

Solution:

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class // you can add inner classes if needed
class Main {
	public static void main(String[] args) {
		// Your code here
		Scanner sc = new Scanner(System.in);
		int S sc.nextInt(); int Tsc.nextInt();
		int res =0;
		for (int a = 0; a<=S; a++) 
			for (int b=0; b<=S; b++)
				for (int c = 0; c<= 5; c++)
					 if(a+b+c<= 5 && a*b*c <= T)
					res++;
			System.out.println(res);
}
