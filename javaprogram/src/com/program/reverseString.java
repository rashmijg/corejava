package com.program;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "malayalam";
		String Str = null;
		StringBuffer sb = new StringBuffer(s);
		String sa  =sb.reverse().toString();
		System.out.println(sa);
		
		char ch[] = s.toCharArray();
		for(int i= ch.length-1;i>0;i--)
		{    
			 Str = Str + s.charAt(i);
			
		}
		System.out.println(Str);
		}
}
				

	


