package com.winnow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhachoVia {

	public static void main(String[] args) {

		int x = 1000000000;
		System.out.println(x);
		WhachoVia object = new WhachoVia();
		int answer = object.solution(new int[] { 9, 4, 2, 10, 7, 8, 8, 1, 9 });
		System.out.println(answer);

		answer = object.solution(new int[] { 1000 });
		System.out.println(answer);

		answer = object.solution2(new Integer[] { 9, 4, 9, 4, 9, 4, 9, 4, 9, 4 });
		System.out.println(":   "+answer);

		answer = object.solution(new int[] { 4, 8, 12, 16 });
		System.out.println(answer);
		
		
		answer = object.solution(new int[] { 14, 8, 10, 9 });
		System.out.println(answer);
		
		answer = object.solution2(new Integer[] { 7, 8, 6, 9 });
		System.out.println(": "+answer);
	}
	
	public int solution2(Integer[] ar) {
		
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(ar));
		
		List<Integer> asList = Arrays.asList(ar);
		int counter = 0;
		boolean flag = true;
		if (asList.size() == 1)
			return 1;
		List<Integer> listp = new ArrayList<>();
		for(int x = 0; x<asList.size();) {
			
			if(flag && asList.get(x) < asList.get(x + 1)) {
				counter++;
				flag = !flag;
				x++;
				if(x == asList.size()-1)
					break;
			}
			if(!flag && asList.get(x) > asList.get(x + 1)) {
				counter++;
				flag = !flag;
				x++;
				if(x == asList.size()-1) {
					//if(asList.get(index));
						break;
				}
					;
			}
			else {
				listp.add(counter);
				counter = 0;
				x++;
				if(x == asList.size()-1)
					break;
			}
			
		}
		System.out.println(listp);

		return counter;
	}
	

	public int solution(int A[]) {
		int size = A.length;
		int counter = 0;
		if (size == 1)
			return 1;

		int index = 0;
		for (int x = 0; x < size; x++) {

			index = x + 1;
			if (index >= size)
				break;
			if (A[x] < A[x + 1]) {
				counter++;
				x++;
				index = x + 1;
				if (index >= size)
					break;
				if (A[x] > A[x + 1]) {
					counter++;
					x++;
				}
				else {		// added here into zigzag
					x++;
					counter++;
				}
			} else if (A[x] > A[x + 1]) {
				counter++;
				x++;
				index = x + 1;
				if (index >= size)
					break;
				if (A[x] < A[x + 1]) {
					counter++;
					x++;
				}
				else {		//added here
					x++;
					counter =0;
				}
			}

		}
		return counter;
	}

}
// public int solution(int arr[]) {
// /*
// * Z[i][0] = Length of the longest Zig-Zag subsequence ending at index i and
// * last element is greater than its previous element Z[i][1] = Length of the
// * longest Zig-Zag subsequence ending at index i and last element is smaller
// * than its previous element
// */
//
// int size = arr.length;
// int Z[][] = new int[size][2];
//
// /* Initialize all values from 1 */
// for (int i = 0; i < size; i++)
// Z[i][0] = Z[i][1] = 1;
//
// int res = 1; // Initialize result
//
// /* Compute values in bottom up manner */
// for (int i = 1; i < size; i++) {
// // Consider all elements as
// // previous of arr[i]
// for (int j = 0; j < i; j++) {
// // If arr[i] is greater, then
// // check with Z[j][1]
// if (arr[j] < arr[i] && Z[i][0] < Z[j][1] + 1)
// Z[i][0] = Z[j][1] + 1;
//
// // If arr[i] is smaller, then
// // check with Z[j][0]
// if (arr[j] > arr[i] && Z[i][1] < Z[j][0] + 1)
// Z[i][1] = Z[j][0] + 1;
// }
//
// /*
// * Pick maximum of both values at index i
// */
// if (res < Math.max(Z[i][0], Z[i][1]))
// res = Math.max(Z[i][0], Z[i][1]);
// }
//
// return res;
// }
// }
//// public int solution(int[] A) {
//// int n = A.length;
//// int[][] Z = new int[n][2];
//// for (int i = 0; i < Z.length; i++) {
//// Z[i] = new int[2];
//// }
//// Z[0][0] = 1;
//// Z[0][1] = 1;
////
//// int best = 1;
////
//// for (int i = 1; i < n; i++) {
//// for (int j = i - 1; j >= 0; j--) {
//// if (A[j] < A[i])
//// Z[i][0] = Math.max(Z[j][1] + 1, Z[i][0]);
//// if (A[j] > A[i])
//// Z[i][1] = Math.max(Z[j][0] + 1, Z[i][1]);
//// }
//// best = Math.max(best, Math.max(Z[i][0], Z[i][1]));
//// }
//// return best;
//// }
////
//// // public int solution(int[] A) {
//// // if(A.length == 0) {
//// // return 1;
//// // }
//// //
//// // int size = A.length;
//// //
//// // int[] pos = new int[size];
//// // int[] neg = new int[size];
//// //
//// // for (int x = 0; x<size ; x++) {
//// // for (int y = x+1; y<size;y++ ) {
//// // if(A[y] > A [x]) {
//// // pos[y] = Math.max(pos[y], neg[x+1]);
//// // }
//// // else {
//// // neg[y] = Math.max(neg[y], pos[x+1]);
//// // }
//// // }
//// // }
//// //
//// //
//// // return 0;
//// // }
////
//// /*
//// * public int solution(int[] A) {
//// *
//// * if (A.length == 0) return 0;
//// *
//// * int lastDiff = 0; int length = 1;
//// *
//// * for (int i = 1; i < A.length; i++) { int diff = Integer.signum(A[i] - A[i
// -
//// * 1]); if ((diff != 0) && (diff != lastDiff)) { lastDiff = diff; length++;
// }
//// }
//// *
//// * return length; }
//// */
////
//// /*
//// * public int solution(int A[]) { int brojac = 1; int longest = 0;
//// *
//// * // I check if the array has only ONE element if (A.length == 1) { if
// (A[0]
//// !=
//// * 0) // if yes, and that element is NOT zero, I return 1... that's by
//// * definition of // the exercise... { return 1; } } else { for (int i = 1; i
// <
//// * A.length; i++) { if (A[i] >= 0) { if ((A[i - 1]) < 0) brojac++; else
// brojac
//// =
//// * 0; }
//// *
//// * if (A[i] < 0) { if ((A[i - 1]) >= 0) brojac++; else brojac = 0; } if
//// (brojac
//// * > longest) longest = brojac; } } return brojac; }
//// */
	
//	if(asList.get(x) < asList.get(x + 1)) {
//		counter++;
//		x++;
//		if(x >= asList.size())
//			break;
//		else {
//			if(asList.get(x) > asList.get(x + 1)) {
//				counter++;
//				x++;
//			}else {
//				x++;
//			}
//			if(x >= asList.size()-1)
//				break;
//		}
//	}
//	
//}
