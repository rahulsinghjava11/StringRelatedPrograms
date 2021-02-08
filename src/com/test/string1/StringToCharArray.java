package com.test.string1;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rahul singh";
		
		char chArr[]= new char[str.length()];
		
		for(int i=0; i<chArr.length; i++) {
			char c= str.charAt(i);
		}
	}

}
