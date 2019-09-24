package util;

public class PhoneNumber {
	public static boolean checkPh(String phNo) {
		int phLen = phNo.length();
		for(int i = 0; i < phLen; i++) {
			if(!Character.isDigit(phNo.charAt(i))) {
				return false;	
			}
		}
		return (phLen == 10 || phLen == 8);
	}
}
