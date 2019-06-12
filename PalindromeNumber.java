
public class PalindromeNumber {
	static boolean palindromeNumber(int a){
		int b = 0, ori = a;
		if (a > 0){
			while(a > 0){
				b = b*10 + a%10;
				a = a/10;
			}
			if ((ori-b)==0)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	public static void main (String[] args){
		System.out.println(palindromeNumber(123));
		System.out.println(palindromeNumber(121));
		System.out.println(palindromeNumber(12321));
	}
}
