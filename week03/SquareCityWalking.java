/*
TopCity is a square-shaped city. 
When we divide the city into N rows and N columns, you can see that the city is divided into N2 districts. 

We will number both the rows and the columns starting from 0, 
and we will say that district (i, j) is the square in row i and column j.

In TopCity, districts have various cultures. 
For each district, a positive integer is assigned to represent its culture. 
The culture of district (i, j) is represented by the integer A[i*N+j].


You are initially at district (0, 0). You will go to district (N-1, N-1) by repeatedly moving between cells 
which share an edge, using a shortest route.


The similarity of cultures of different districts can be measured by computing the greatest common divisor 
(GCD, see Notes for definition) of their individual culture values.

The similarity of cultures on your route is the similarity of all districts that lie on the route, 
including districts (0, 0) and (N-1, N-1).

Find and return the largest possible similarity of cultures on a valid route from (0, 0) to (N-1, N-1).

	GCD (Greatest Common Divisors) means the largest positive integer which divides all given values. 
	For example, the GCD of {91, 169, 130} is 13, because 13 divides all three given integers, 
	but there is no larger value which divides all three given integers

-	N will be between 1 and 25.
-	The length of A will be exactly N*N.
-	A[i] will be between 1 and 100.

*/



public class SquareCityWalking{
	public static int largestGCD(int N, int[] A){
		int largestGCD = 0;
		int i = 0;
		int j = 0;
		return i;




	}
	public static int getGCD(int a, int b) {
		if (b==0) return a;
   		return getGCD(b,a%b);
}
}