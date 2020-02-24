package hello;
class Customer2{
    int amount=500;
    public synchronized int withdraw(int amount)
    {
        System.out.println(Thread.currentThread().getName());
        if(this.amount<amount)
        {
            try{
                System.out.println("Waiting.....Sorry there is no amount in the Account");
                wait();
            }catch(InterruptedException e){}
        }
        this.amount-=amount;
        return amount; 
    }
    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName());
        System.out.println("deposited amount is"+amount);
        this.amount+=amount;
        System.out.println("after deposit amount is"+this.amount);
        notifyAll();
    }
}
 
 
public class Sync {
 
    public static void main(String[] args) {
      
        Customer2 c=new Customer2();
        Thread t1=new Thread()
                {
                    public void run()
                    {
                        c.withdraw(5000);
                        System.out.println("After withdraw remaining amount is"+c.amount);
                    }
                };
        Thread t2=new Thread()
                {
                    public void run()
                    {
                        c.deposit(9000);
                    }
                };
                t1.setName("Dharun");
                t2.setName("dharun 2");
                t1.start();
                t2.start();
 
    }
 
}
