package com.svinfotech.datastructures;

public class StringPermutation {

	public static void main(String args[]) {
		permuteString("", "ram");
		
	}

	public static void permuteString(String beginningString, String endingString) {
		if (endingString.length() <= 1) {
			System.out.println("beginningString + new String : " + beginningString + endingString);
			System.out.println("***********************************************************");
		}
		else {
			for (int i = 0; i < endingString.length(); i++) {
				try {
					System.out.println("begining String : " + beginningString);
					System.out.println("ending String : " + endingString);
					System.out.println("i :"+ i);
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);
					
					System.out.println("endingString.substring(0,"+i+") :" + endingString.substring(0,i));
					System.out.println("endingString.substring("+ (i+1) +") :" + endingString.substring(i + 1));
					System.out.println("newString : endingString.substring(0, "+i+") + endingString.substring(" + (i+1) + ") : " + newString);
					System.out.println("endingString.charAt("+ i +")" + endingString.charAt(i));
					System.out.println("beginningString = beginningString + endingString.charAt("+ i +") :" + beginningString + endingString.charAt(i));
					permuteString(beginningString + endingString.charAt(i), newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
				
			}
		}
			
	}
	
	public static void permuteString1(String beginningString, String endingString) {
		if (endingString.length() <= 1) {
			System.out.println(beginningString + endingString);
			System.out.println("***********************************************************");
		} else {
			for (int i = 0; i < endingString.length(); i++) {
				try {
					String newString = endingString.substring(0, i) + endingString.substring(i + 1);
					permuteString1(beginningString + endingString.charAt(i), newString);
				} catch (StringIndexOutOfBoundsException exception) {
					exception.printStackTrace();
				}
				
			}
		}
			
	}

}
/*
 * 
 * System.out.println("begining String : " + beginningString);
					System.out.println("ending String : " + endingString);
					System.out.println("i :"+ i +" ,endingString.substring(0,i) :" + endingString.substring(0,i));
					System.out.println("i+1 :"+ (i+1) +" ,endingString.substring(i + 1) :" + endingString.substring(i + 1));
					System.out.println("newString : endingString.substring(0, i) + endingString.substring(i + 1) : " + newString);
					System.out.println("beginningString = beginningString + endingString.charAt(i) :" + beginningString + endingString.charAt(i));
 * 
 * 
 */
