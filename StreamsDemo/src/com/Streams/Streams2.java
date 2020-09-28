package com.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("jyoshi");
		list.add("venella");
		list.add("manjula");
		List<String> newlist=list.stream().map(string->"First Name:"+string).collect(Collectors.toList());
		System.out.println(newlist);
		

	}

}
