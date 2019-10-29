package com.program;

public class integerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int temp=0;
		int rem;
		int n=121;
		
		while(n>0)
		{
			rem=n%10;
			sum= (10*sum)+rem;
			n=n/10;
		
      if(temp==sum)
      {
    	  System.out.println(temp  +"palindrome");
      }
		}
	}

}
