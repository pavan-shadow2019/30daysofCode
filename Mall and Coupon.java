Question:
Mall and Coupons
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton went to a mall. There are N items in a shop. For each i=1, 2, …, N, the price of the i- th item is Ai Rs. Newton has K coupons. Each coupon can be used on one item. You can use any number of coupons, possibly zero, on the same item. Using k coupons on an item with a price of a Rs allows him to buy it for max{a−kX, 0} Rs.
Print the minimum amount of money Newton needs to buy all the items.
Input
Input is given from Standard Input in the following format:
N K X
A1 A2..... AN

Constraints
1≤N≤2×10^5
1≤K, X≤10^9
1≤Ai ≤10^9

All values in the input are integers.
Output
Print the answer.
Example
Sample Input 1
5 4 7
8 3 10 5 13

Sample Output 1
12

Sample Input 2
5 100 7
8 3 10 5 13

Sample Output 2
0

Sample Input 3
20 815 60
2066 3193 2325 4030 3725 1669 1969 763 1653 159 5311 5341 4671 2374 4513 285 810 742 2981 202

Sample Output 3
112


Code:

import java.io.*; // for handling input/output import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main(String[] args) {
	// Your code here
		Scanner sc = new Scanner(System.in);
		int n sc.nextInt();
		int k =sc.nextInt();
		int x =sc.nextInt();
		int arr[]= new int[n];
		for (int i 0; i<n; i++){ = arr[i] =sc.nextInt();
		}
		for (int i 0; i<n; i++){ = break;
			if(k ==0){
			}
			int count =Math.min(k, arr[i]/x);
			arr[i]=count* x;
			k count;
		}
		Arrays.sort(arr);
		long sum = 0;
		for (int i = 0; i<n-k; i++){ sum += arr[i];
		}
		System.out.println(sum);
	}
}
