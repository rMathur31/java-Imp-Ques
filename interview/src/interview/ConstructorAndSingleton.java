package interview;

class TestConstructor{
	int id;
	//constructor may or may not hv return type, has same name as class
	public void TestConstructor() {
		id = 101;
	}
	//method must return something
	public int testConstructor() {
		return id = 10;
	}
}

class SingleTonClass{
	//1. create static object in class itself
	static SingleTonClass sc = new SingleTonClass();
	
	//2. Create private constructor
	private SingleTonClass() {
	
	}
	
	//3. get object using public method
	public static SingleTonClass getInstance() {
		return sc;
	}
}

public class ConstructorAndSingleton {

	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor();
		System.out.println(tc.testConstructor());
		
		//4. call by classname
		SingleTonClass obj1 = SingleTonClass.getInstance();
		System.out.println(obj1.hashCode());
		
		//it will have same hashcode 
		SingleTonClass obj2 = SingleTonClass.getInstance();
		System.out.println(obj2.hashCode());
		
	}
}
