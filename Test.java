package com.training.cts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		ArrayList<Hall> ar=new ArrayList<Hall>();
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String s11[]=s1.split(",");
		String s12[]=s2.split(",");
		String s13[]=s3.split(",");
			
		ar.add(new Hall(s11[0],Double.parseDouble(s11[1]),Integer.parseInt(s11[2])));
		ar.add(new Hall(s12[0],Double.parseDouble(s12[1]),Integer.parseInt(s12[2])));
		ar.add(new Hall(s13[0],Double.parseDouble(s13[1]),Integer.parseInt(s13[2])));
		
		Collections.sort(ar);
		System.out.format("%-15s %-15s %s\n","Hall Name","Cost per day","Capacity");
		for(Hall h:ar)
		{
			System.out.format("%-15s %-15s %s\n",h.getName(),h.getCostperday(),h.getCapacity());
		}
	}

}