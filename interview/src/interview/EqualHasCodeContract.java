package interview;

class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null || (getClass() != obj.getClass())) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		
		Employee emp = (Employee)obj;
		return(this.getId() == emp.getId());
	}
	
	//always override hashcode with equal so that 2 equal obj hv same hashcode
	@Override
	public int hashCode() {
		return getId();
	}
}
public class EqualHasCodeContract {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("name1");
		
		Employee e2 = new Employee();
		e2.setId(101);
		e2.setName("name1");
		
		System.out.println("Shallow compare "+(e1==e2));
		
		//contract - 
		//if 2 obj are equal() than hashcode is same
		//if 2 obj hv same hashcode, not necessary they are equal()
		System.out.println("Deep Compare "+(e1.equals(e2)));

	}

}
