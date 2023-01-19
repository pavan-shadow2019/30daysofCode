Question:

Even Numbers - 2
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton loves EVEN numbers.

You are given two integers N and M. Generate 5 unique even numbers for Newton between N and M (excluding both).
Input
The first and the only line of input contains integer N and integer M.


Constraints
-103 <= N <=M <= 103

M - N > 10
Output
The only line of output contains 5 singly spaced integers satisfying the constraints.
Example
Sample Input
0 20

Sample Output
2 6 8 18 14

******************************

Code:


import java.io.*; // for handling input/output 
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		// Your code here
		Scanner sc = new Scanner(System.in); 
		int n sc.nextInt();
		int msc.nextInt();
		Set<Integer> evens = new HashSet<>();

		for (int i= n+1; i <m; i++){ 
			if(i%2==0){			
				evens.add(i);
				if (evens.size() ==5){
				break;
				}
			}
		for (Integer i:evens){
			System.out.print(i + ");
		}

	}

}
