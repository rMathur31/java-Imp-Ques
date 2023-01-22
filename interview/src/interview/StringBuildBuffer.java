package interview;

public class StringBuildBuffer {

	public static void main(String[] args) {
		//Immutable
		String str = new String("Hello World");
		str.toUpperCase();
		System.out.println(str);
		
		//Mutable, thread safe(synch)
		StringBuffer sbuff = new StringBuffer("Hello World");
		sbuff.reverse();
		System.out.println(sbuff);
		
		//Mutable, not synch (methods not have synch in defination)
		StringBuilder sbuild = new StringBuilder("Hello World");
		sbuild.append(" In StringBuilder");
		System.out.println(sbuild);
		
		
		
		}
}
