package interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;


public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		//no order, no duplication
		//obj1.equals(obj2) then one of them cannot be added
		Set<Integer> set = new HashSet<>();
		
		//maintains order
		List<Integer> list1 = new ArrayList<>();
		
		List<Integer> list2 = new LinkedList();
		
		java.util.Map<Integer, String> map = new HashMap();
		
		
	}
}
