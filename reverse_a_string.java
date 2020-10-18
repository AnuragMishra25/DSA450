/*
Given a string S as input. You have to reverse the given string.

Input: First line of input contains a single integer T which denotes the number of test cases. T test cases follows, first line of each test case contains a string S.

Output: Corresponding to each test case, print the string S in reverse order.

Constraints:
1 <= T <= 100
3 <= length(S) <= 1000

Example:
Input:
3
Geeks
GeeksforGeeks
GeeksQuiz

Output:
skeeG
skeeGrofskeeG
ziuQskeeG
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scObj = new Scanner(System.in); 
		int inputCount = scObj.nextInt();
		for(int i=0;i< inputCount;i++){
		    String word = scObj.next();
		    int j=0, k = word.length()-1;
		    char[] chars = word.toCharArray();
		    while(j<k){
		        char temp = chars[j];
		        chars[j] = chars[k];
		        chars[k] = temp;
		        j++;
		        k--;
		    }
		    System.out.println(String.valueOf(chars));
		}
	}
}
