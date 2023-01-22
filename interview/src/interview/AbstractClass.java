package interview;
//just need abstract in class defination to make a class abstract
abstract class Abstract {

	public static void nonabstract() {
		System.out.println("Inside nonabstract method");
	}

	public abstract void abstractmethod();
	
}

//must implement the inherited abstract method 
class Abstractimpl extends Abstract{
	@Override
	public void abstractmethod() {
		System.out.println("Inside abstract method impl");
		
	}
}

public class AbstractClass{
	public static void main(String[] args) {
		
		//cannoy instantiate, must have impl
		Abstract abs = new Abstract() {
			
			@Override
			public void abstractmethod() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Abstractimpl impl = new Abstractimpl();
		impl.abstractmethod();
 	}
}