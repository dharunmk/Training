package com.training.cts;
import java.util.ArrayList;
import java.util.Collections;
public class cmprle {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(223,"Hello",54));
	al.add(new Student(245,"yhtawsa",76));
	al.add(new Student(254,"nurahd",66));
	Collections.sort(al);
	System.out.println(al);
	
	
}
}
