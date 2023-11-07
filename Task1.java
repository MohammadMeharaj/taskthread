import java.lang.*;
class MyThread extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println("Hi"); 
         }
    }   

}
public class Task1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        t1.interrupt();
        try {
            t1.sleep(3232);
            if(t1.isInterrupted()){
                throw new InterruptedException("Thread t1 is interrrepted");
            }
            t1.join();
        
        } catch (InterruptedException e) {
          
            System.out.println("Error: "+e.getMessage());
        }
        
        for(int i=1;i<5;i++)
        {
            System.out.println("Hello");
        }
    }  
}
