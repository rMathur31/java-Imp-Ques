package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Laptop implements Comparable<Laptop>{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Laptop(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int compareTo(Laptop laptop) {
		
		if(this.getPrice() > laptop.getPrice())
			return 1;
		if(this.getPrice() < laptop.getPrice())
			return -1;
		else
			return 0;
	}
}

public class ComparatorvsComparable {

	public static void main(String[] args) {
		List<Laptop> list =  new ArrayList<>();
		Laptop l1 = new Laptop("Pixel", 40000);
		Laptop l2 = new Laptop("Dell", 10000);
		Laptop l3 = new Laptop("IOS", 50000);
		list.add(l1);
		list.add(l2);
		list.add(l3);

		//Sort method takes only objects which impl. comparable
		//Collections.sort(list);
		
		//use when cobject is not implementing comparable or we want to change sort logic
		Comparator<Laptop> com = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice() > o2.getPrice())
					return 1;
				else
					return -1;
			}
		};		

		Collections.sort(list, com);
		
		for (Laptop laptop : list) {
			System.out.println(laptop.getPrice());
		}
		
	}
}
