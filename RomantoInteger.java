public class RomantoInteger {
    public static int charToInt(char c) {
        int data = 0;
 
        switch (c) {
            case 'I':
                data = 1;
                break;
            case 'V':
                data = 5;
                break;
            case 'X':
                data = 10;
                break;
            case 'L':
                data = 50;
                break;
            case 'C':
                data = 100;
                break;
            case 'D':
                data = 500;
                break;
            case 'M':
                data = 1000;
                break;
        }
 
        return data;
    }
    
    static int romanToInt(String s){
    	int total = charToInt(s.charAt(0));
    	for (int i = 1; i < s.length(); i++){
    		if (charToInt(s.charAt(i)) <= charToInt(s.charAt(i-1)))
    			total+=charToInt(s.charAt(i));
    		else
    			total = total - 2*charToInt(s.charAt(i-1)) + charToInt(s.charAt(i));
    	}
    	return total;
    }
    public static void main(String[] args){
    	System.out.println(romanToInt("III"));
    	System.out.println(romanToInt("IV"));
    	System.out.println(romanToInt("IX"));
    	System.out.println(romanToInt("LVIII"));
    	System.out.println(romanToInt("MCMXCIV"));
    }
}
