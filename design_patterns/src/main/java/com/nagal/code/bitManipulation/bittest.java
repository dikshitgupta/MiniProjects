package com.nagal.code.bitManipulation;

public class bittest {

	public static void main(String[] args) {
		int x=4000000;
//		x=x<<8;
		System.out.println(x);
		int count = 0;
		while ((x & 1) == 0)
		{
			x = x >> 1;
			count++;
		}
		System.out.println(count);

	}
}
