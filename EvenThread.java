package hello;

public class EvenThread extends Thread{
	 public void run(){
		 for(int i=0;i<50;i++){
			 if(i%2==0){
				 System.out.println("Even numbers till 50 are : "+i);
			 }
		 }
	 }
	 public static void main(String args[]){
		 EvenThread t1=new EvenThread();
		 EvenThread t2=new EvenThread();
		 EvenThread t3=new EvenThread();

	  t1.start();
	  t2.start();
	  t3.start();
	 }
	}

