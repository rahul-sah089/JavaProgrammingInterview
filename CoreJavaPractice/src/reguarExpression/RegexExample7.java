package reguarExpression;
import java.util.regex.Pattern;

public class RegexExample7 {
	public static void main(String[] args){
		System.out.println("by character classes and quantifiers ...");
		System.out.println(Pattern.matches("[789]{1}[12467890]{9}","9124678909")); //true
		System.out.println(Pattern.matches("[789][12467890]{9}","9124678909")); //true
		
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
		
		System.out.println("by metacharacters ...");  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)
		
		
	}
}
