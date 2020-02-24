package hello;

import java.util.ArrayList;

public class finddash {

	public static void main(String[] args) {
		String s1="hi-there-you";
		String s2="12-3456-6544";
		getvalues(s1,s2);
		
	}
	public static void getvalues(String s1,String s2){
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='-'){
				l1.add(i);
			}
			
			}
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='-'){
				l2.add(i);
			}
			
			}System.out.println(l2);
	}
   
}
