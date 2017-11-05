package cz.expertkom.ju.task;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		String r1 = o1.replaceAll("[^0-9]", "");
		String r2 = o1.replaceAll("[^0-9]", "");
		
		System.out.println(r1);
		System.out.println(r2);
		
		Integer i1 = Integer.valueOf(r1);
		Integer i2 = Integer.valueOf(r2);
		int compareTo = i2.compareTo(i1);
		return compareTo;
	}
	
}