package TrainigCodes;

import java.util.Arrays;
import java.util.Scanner;
//step-1 -->Collect the strings
//step-2 -->Convert the string into character array
//step-3 --> Sort the arrays
//step-4 --> Compare the arrays for equality
public class AnagramCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings to compare : ");
		String str1=sc.next();
		String str2=sc.next();
		
		//step-2
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		//step-3
		Arrays.sort(c1);
		Arrays.sort(c2);
		//step-4
		if(Arrays.equals(c1,c2)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not a anagram");
		}
	}

}
