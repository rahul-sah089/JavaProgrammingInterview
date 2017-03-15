import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter in the decimal value");
		int dec = in.nextInt();
		String result = decToBin(dec);
		System.out.println("Decimal Number-->" + dec);
		System.out.println("Binary Result --->" + result);
		in.close();///sdasdd
	}

	public static String decToBin(int dec) {
		String result = "";
		int rem = 0;
		while (dec != 0) {
			rem = dec % 2;
			dec = dec / 2;
			result += rem;
		}
		return reverseString(result);
	}

	public static String reverseString(String str) {
		String rev = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
}
