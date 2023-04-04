package TrainigCodes;

import java.util.Scanner;

public class CountOfWordsInString {
	public static void main(String[] args) {
		//step-1:--
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		String sen=sc.nextLine();
		//step-2:--
		int count =0;
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)==' '||i==sen.length()-1) {
				count++;
				
			}
		}
		System.out.println("Word Count is"+count);

	}
}
