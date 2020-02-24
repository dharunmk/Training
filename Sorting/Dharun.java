package com.cts.Sorting;

public class Dharun implements Comparable<Bhargav>{
	int number;
	String name;
	Bhargav(int number,String name){
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[number=" + number + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Dharun o) {
		return o.number - this.number;
	}
}
