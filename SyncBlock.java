package hello;

public class SyncBlock {
 public static void main(String[] args) {
	ThreadOne obj=new ThreadOne();
	obj.start();
	Synchronized(obj){
		try{
			System.out.println("Waiting..");
			obj.wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Total is:"+obj.total);
	}
}
}
class ThreadOne extends Thread{
	int total;
	 public void run(){
		 synchronized(this){
			 
		 }
	 }
	
	
}
