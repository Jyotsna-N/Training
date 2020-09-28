package com.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsMain {
	public static void main(String[] args) {
		List<CollectionClass> list = new ArrayList();
		list.add(new CollectionClass(515, "jyoshi", 25000));
		list.add(new CollectionClass(516, "harsha", 32050));
		list.add(new CollectionClass(517, "chukku", 10000));
		list.add(new CollectionClass(518, "pooji", 22220));
		list.add(new CollectionClass(519, "ganesh", 52420));
		long count = list.stream().filter(i -> i.getSalary() >= 20000).count();
		System.out.println(count);
		List<Integer> list1 = new ArrayList();
		list1.add(14);
		list1.add(22);
		list1.add(1);
		list1.add(100);
		list1.add(55);
		float countof = list1.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Count of even numbers is:" + countof);
	}

}
