package interview;

class Parent{
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	
	//overload - same name, diff. type/num, return type may differ
	public static int increment(int i){
		return i++;
	}

	//Overload
	public static int increment(int i, int k) {
		return i+k;
	}
	
	//overriding - same name, same return type and same num/type of arg
	public int add(int a, int b) throws Exception{
		return a+b;
	}
	//hiding - must be static, same signature
	public static void display() {
		System.out.println("In Parent");
	}
	
}

class Child extends Parent{
	
	public Child() {
	
	}
	
	//overriding - exception shd be lowe than parent one
	//cannot oveerride static method
	//both polymorphism and inheritance used
	@Override
	public int add(int a, int b) throws NumberFormatException{
		return a+b+1;
	}
	//hiding
	public static void display() {
		System.out.println("In Child");
	}

}

public class OverLoadVsOverride {

	//can't overload or overriide MAIN - static method
	public static void main(String[] args) throws Exception {
		boolean b = true;
		int i = 10;
		
		//syso is internally overloaded - same name diff. type/number of arg
		System.out.print(b);
		System.out.println(i);
		
		//child ref.
		Parent obj1 = new Child();
		System.out.println(obj1.add(10,20));
	
		Child.display();
		//child ref. -> RTE class cast exc.
		//Child obj2 = (Child) new Parent();
		//System.out.println(obj2.add(10,20));
					
	}
}
