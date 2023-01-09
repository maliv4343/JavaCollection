package com.velocity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		
		Set<Integer> s=map.keySet();
	    Iterator<Integer> itr=s.iterator();
		
		while(itr.hasNext()) {
		int a=itr.next();
			System.out.println(a);
			System.out.println(map.get(a));
		
		}

	}

}
