Question:

Abhas and Numbers
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Abhas likes to play with numbers. He is given integers N and K. Find the number of triples (a, b, c) of positive integers not greater than N such that a+b, b+c, and c+a are all multiples of K. The order of a, b, and c does matter, and some of them can be the same.
Input
The input line contains N and K separated by space.


Constraints
1≤N, K≤2×10^5

N and K are integers.
Output
Print the number of triples (a, b, c) of positive integers not greater than N such that a+b, b+c, and c+a are all multiples of K.
Example
Sample Input 1
3 2

Sample Output 1
9

Sample Input 2
5 3

Sample Output 2
1

Sample Input 3
35897 932

Sample Output 3
114191


***********************************
Code:
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class 
// you can add inner classes if needed
class Main {
	public static void main(String[] args) {
		// Your code here 
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		int K sc.nextInt();
		long count = 0;
		if(K%2==0){
			long a = N/K;
			long b =  (N+(K/2))/K; 
			System.out.println(a*a*a + b*b*b);

		}
		else{
			long a = N/K;
		System.out.println(a*a*a);
		}
	}
}