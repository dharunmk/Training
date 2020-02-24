package hello;

import java.util.ArrayList;

public class ArayList {
      public static void main(String[] args) {
		ArrayList li=new ArrayList();
		
		li.add(10);
		li.add("Yhtawsa");
		li.add(12.4);
		System.out.println(li);
		
		ArrayList l1=new ArrayList();
		
		l1.add(10);
		l1.add("nurahd");
		li.addAll(l1);
		System.out.println(li);
		//l1.remove(3);
		l1.add(1,13);
		System.out.println(l1);
	}
}
