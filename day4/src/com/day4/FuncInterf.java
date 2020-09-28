package com.day4;

import java.util.function.Function;

public class FuncInterf {
     public static void main(String[] args) {
	Function<Integer,Integer> function1= i->i*i;
	System.out.println(function1.apply(10));
	Function<Integer,Integer> function2=i->i+i;
	System.out.println(function1.andThen(function2).apply(2));
}
}
