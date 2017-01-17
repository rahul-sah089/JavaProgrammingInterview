package strings;

//This is the program that will re
public class RemoveCharForStr {
	public static void main(String[] args) {
		String str = "rahul";
		while (str.length() != 0) {
			char first = str.charAt(0);
			str = removeChar(str, first);
			System.out.println("Str value-->" + str);
		}
	}

	public static String removeChar(String str, char c) {
		if (str == null) {
			return null;
		}
		return str.replaceAll(Character.toString(c), "");
	}
}
