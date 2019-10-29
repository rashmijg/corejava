package com.program;

public class reverseSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="java is program";
		
		String words [] = s.split(" ");
		
		String reverseString = null;
		String reverseword = null;
		for (int i=0;i<words.length;i++)
		{
			String word = words[i];
			for(int j= word.length()-1;j>=0;j--)
			{
				 reverseword = reverseword + word.charAt(j);
			}
			
			reverseString =reverseString+ reverseword;
			System.out.println(reverseString);
		}
		
		

	}

}

