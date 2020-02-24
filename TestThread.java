package hello;

public class TestThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args){
		TestThread t=new TestThread();
		Thread tt=new Thread(t);
		tt.setName("Name of the Thread");
		tt.start();			
	}
	
}