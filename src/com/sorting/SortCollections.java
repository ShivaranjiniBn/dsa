package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollections {
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<>();
		ls.add(5);
		ls.add(8);
		ls.add(22);
		ls.add(17);
		ls.add(6);
		
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
		
		
	}
	
	

}
