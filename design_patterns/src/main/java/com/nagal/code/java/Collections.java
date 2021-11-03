package com.nagal.code.java;

import java.util.Stack;

public class Collections {

	public static boolean isValidSerialization(String preorder) {
		String[] pArray = preorder.split(",");
		int n=pArray.length;

		if(!pArray[n-1].equals("#") || !pArray[n-2].equals("#") ) return false;

		Stack <Integer> st=new Stack<>();

		for(int i=0;i<n-1;i++){
			if(pArray[i].equals("#") && pArray[i-1].equals("#") ){
				if(st.size()==0) return false;
				st.pop();
				continue;
			}
			else if(pArray[i].equals("#")) {
				if(st.size()==0) return false;
				st.pop();
				continue;
			}
			st.push(Integer.parseInt(pArray[i]));
		}
		return true;
	}


	public static void main(String[] args) {

		String s = "9,3,4,#,#,1,#,#,2,#,#,#";
		System.out.println(Collections.isValidSerialization(s));
	}
}

