// Program to Check if the String is an Anagram 

import java.util.Scanner;
class IsAnagram {
	
	public static void main(String[] args) {
		readString();
	}
	
	public static void readString() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Two Strings Separately");
		String strOne = scn.next();
		String strTwo = scn.next();
		if(isAnagram(strOne, strTwo))
			System.out.println(strOne + " and " + strTwo + " are Anagram");
		else
			System.out.println(strOne + " and " + strTwo + " are not Anagram");
	}
	
	public static boolean isAnagram(String strOne, String strTwo) {
		int count;
		String newStrTwo = "";
		if(strOne.length() != strTwo.length()) {
			return false;
		}
		else {
			for(int i = 0; i < strOne.length(); i++) {
				count = 0;
				for(int j = 0; j < strTwo.length(); j++) {
					if(strOne.charAt(i) == strTwo.charAt(j)) {
						count++;
						if(count == 1)
							newStrTwo += strTwo.charAt(j);
					}
				}
			}
			return strOne.equals(newStrTwo);
		}
	}
}