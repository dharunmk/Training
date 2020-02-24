package hello;

public class OddThread extends Thread{
	 public void run(){
		 for(int i=0;i<50;i++){
			 if(i%2!=0){
				 System.out.println("Odd numbers till 50 are : "+i);
			 }
		 }
	 }
	 public static void main(String args[]){
		 OddThread t1=new OddThread();
		 OddThread t2=new OddThread();
		 OddThread t3=new OddThread();

	  t1.start();
	  t2.start();
	  t3.start();
	 }
	}

