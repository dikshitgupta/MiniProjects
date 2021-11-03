package com.nagal.code.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class graphs {




	public static void main(String[] args) {

		int n=6;
		int [] manager={2,2,-1,2,2,2};

		HashMap<Integer , ArrayList<Integer>> child = new HashMap<>();

		for(int i=0;i<n;i++){
			if(child.containsKey(manager[i])){
				child.get(manager[i]).add(i);
			}
			else{
				child.put(manager[i],new ArrayList<Integer>(Arrays.asList(i)));
			}
		}

		for (Map.Entry<Integer,ArrayList<Integer>> entry : child.entrySet())
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());



//		for (Integer name : child.keySet())
//			System.out.println("key: " + name);
//
//		// using values() for iteration over values
//		for (ArrayList<Integer> url : child.values())
//			System.out.println("value: " + url);




	}

}
