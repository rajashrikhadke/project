package project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylistdemo {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("Rajashri");
		System.out.println(list);
		
		List<Integer> al = Arrays.asList(10,20,30,40);
		System.out.println(al);
	}

}
