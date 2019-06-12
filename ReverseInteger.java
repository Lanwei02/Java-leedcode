
public class ReverseInteger {

	static int reverseInteger(int a){

		int b = 0, i;
		if (a>=0)
			i = 1;
		else
		{
			i = -1;
			a = -a;
		}

		while (a > 0)
		{
			b = b*10 + a%10;
			a = a/10;
		}
		return b*i;
	}
	
	public static void main (String[] args){
		System.out.println(reverseInteger(123));
		System.out.println(reverseInteger(-123));
	}
}
