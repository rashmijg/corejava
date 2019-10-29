package com.program;

import java.util.HashMap;
import java.util.Set;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		String str ="thisisjavaprogram";
		
		char[] chArray = str.toCharArray();
		
		for(Character ch:chArray ) {
		
		if(map.containsKey(ch))
		{
			map.put(ch,map.get(ch)+1);
		}
		else
		{
			map.put(ch, 1);
		}}
		
		Set <Character> keys = map.keySet();
		for (Character ch1 : keys)
		{
			if(map.get(ch1)>1) {
				System.out.println(ch1 + "" + map.get(ch1)+ "times");
			}
		}
		
		
		
		
		

	}

}
