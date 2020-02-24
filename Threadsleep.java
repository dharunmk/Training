package hello;

public class Threadsleep implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<3;i++){
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
							System.out.println(i+"Number of Threads");
			
		}
	}
			
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread tt=new Thread(new TestThread());
		Thread t1=new Thread(new TestThread());
		tt.setName("tt thread");
		tt.start();
		tt.join();
		t1.setName("t1 thread");
		t1.start();
	
	}
}
