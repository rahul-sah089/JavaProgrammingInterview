package innerclass.example1;

class OuterClass {
	class InnerClass{
		
	}
}

public class Test{
	public static void main(String[] args){
		System.out.println("Example of Inner class");
		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass);
	}
}
