package com.core;

public class Business {
 public static void main(String[] args) {
	Abc ab = new Abc();
	Sam s = ab::add;
	s.sum();
}
}
@FunctionalInterface
interface Sam{
	 void sum();
 }

class Abc{
	public void add() {
		System.out.println("Hi Hello");
	}
}
