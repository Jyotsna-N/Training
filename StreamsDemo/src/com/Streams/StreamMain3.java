package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMain3 {
	public static void main(String[] args) {
		List<Float> list=new ArrayList();
		list.add((float)12.45);
		list.add((float) 55.24455);
		list.add((float) 1.55);
		list.add((float) 100.2);
		list.add((float) 61.24);
		Float min=list.stream().min((c1,c2)->c1.compareTo(c2)).get();
		System.out.println(min);
		Float max=list.stream().max((c1,c2)->c1.compareTo(c2)).get();
		System.out.println(max);
	}

}
