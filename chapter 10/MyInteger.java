
public class MyInteger {
	private int value;
	
	
	MyInteger(int value) {
		this.value = value;
		
	}

	//return value
	public int getValue() {
		return value;
		
	}
	//return true if even, odd, or prime
	public boolean isEven() {
		return isEven(value);
		
	}
	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}
	//return true if specified value is even
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	//return true if specified value is odd
	public static boolean isOdd(int value) {
		return value % 2 !=0;
	}
	//return true if specified value is prime
	public static boolean isPrime(int value) {
		for (int divisor = 2; divisor <= value /2; divisor++) {
			if (value % divisor == 0)
				return false;
		}
		return true;
	}
	// return true if specified value is even, odd or prime
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
		
	}
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}
	// return true if value in object is equal to specified value
	public boolean equals(int value) {
		return this.value == value;
	}
	// return true if value in object is equal to specified value
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}
	// converts an array of numeric characters to an int value
	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i= 0, j = (int)Math.pow(10, chars.length - 1);
				i < chars.length; i++, j /= 10) {
					value += (chars[i] - 48) * j;	
				}
				return value;
	}

	//converts a string into an int value
	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1);
				i < str.length(); i++, j /= 10) {
				value += (str.charAt(i) - 48) * j;
			}
		return value;
	}
}

