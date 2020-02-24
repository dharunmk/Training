import java.util.*;
interface Demo
{
	int a=10;
	void display();
	void show();
}
class Test implements Demo{
	public void display() {
		
		System.out.println("Display method ");
	}	
	public void show() {
		
		System.out.println("Show method ");
	}
	public static void main(String[] args){
		Demo d=new Test();
		d.display();
		d.show();
	}
}