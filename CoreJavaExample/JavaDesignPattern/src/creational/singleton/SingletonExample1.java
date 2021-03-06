package creational.singleton;

class SingletonExample1 {
	// 1) static class member which will return object of the same class
	private static SingletonExample1 instance;

	// 2) private constructor
	private SingletonExample1() {

	}

	// 3) public method returning the instance of the same class
	public static synchronized SingletonExample1 getInstance() {
		if (instance == null)
			instance = new SingletonExample1();

		return instance;
	}

}
