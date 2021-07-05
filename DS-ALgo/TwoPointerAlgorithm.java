package datastructures_Algorithms;
// The task is to complete the function which returns true id triplets exists in array A whose sum is zero else returns false
import java.util.*;
class TwoPointerAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a [] = new int [n];
			for (int i = 0; i< n; i++) {
				a[i] = sc.nextInt();
			}
			
			Triplet g =  new Triplet();
			if (g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
		}
		

	}
	
 public static class Triplet{
	
	public  boolean findTriplets(int arr[], int n) {
		Arrays.sort(arr);
		if (trueTwoSum(arr,n)) {
			return true;
		}
		return false;		
	}
	
	public boolean trueTwoSum (int a[], int p) {
		int i = 0; int j = a.length - 1;
		
		while (i < j) {
			if (a[i] + a[j] > p) {
				j--;
			}else if (a[i] + a[j] < p) {
				i++;
			}else {
				return true;
			}			
		}
		return false;
	}

}
}
