package reguarExpression;
import java.util.regex.*;

public class RegexClasses {
	public static void main(String[] args){
		System.out.println("Main method ended");
		System.out.println("Example of Regex Character classes");
		//search for a or m or n only once
		System.out.println(Pattern.matches("[amn]","abcd")); //false
		//search for a or m or n in the pattern
		System.out.println(Pattern.matches("[amn]","a")); //true
		//search not of ("a" pr "b" or "c")
		System.out.println(Pattern.matches("[^abc]", "q"));//true
		System.out.println("Main Method Ended");
	}
}
