package com.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer>  listobj=new ArrayList();
		listobj.add(10);
		listobj.add(2);
		listobj.add(5);
		listobj.add(8);
		System.out.println(listobj);
		//Comparator<Integer> com=(n1,n2)->(n1>n2)?-1:(n1<n2)?1:0;
		//Collections.sort(listobj,com);
		//Collections.sort(listobj,(n1,n2)->(n1>n2)?-1:(n1<n2)?1:0);
		Collections.sort(listobj);
		
		System.out.println(listobj);
		}
	}
