package reguarExpression;
import java.util.regex.*;

public class BasicExample1 {
	public static void main(String[] args){
		System.out.println("Main method started");
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean status = m.matches();
		System.out.println("Status::"+status);
		System.out.println("Main method ended");
	}

}
