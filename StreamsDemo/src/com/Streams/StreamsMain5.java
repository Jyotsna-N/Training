package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMain5 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		list.add(14);
		list.add(22);
		list.add(1);
		list.add(100);
		list.add(55);
		list.add(555);
		list.add(4511);
		List<Integer> newlist=list.stream().filter(i->i>=100).sorted((c1,c2)->-c1.compareTo(c2)).collect(Collectors.toList());
		System.out.println(newlist);	
		List<Integer> newlist1=list.stream().sorted((c1,c2)->-c1.compareTo(c2)).collect(Collectors.toList());
		System.out.println(newlist1);
	}
	}
