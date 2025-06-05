package multithreading;



class example1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Example 1");
		}
	}
}
class example2 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Example 2");
		}
	}
}
public class mainclass {
public static void main(String[] args) {
	example1 ex1=new example1();
	example2 ex2=new example2();
	System.out.println(ex1.getState());
	System.out.println(ex2.getState());
	ex1.start();
	ex2.start();
	System.out.println(ex1.getState());
	System.out.println(ex2.getState());
	
	try {
		ex1.join();
		ex2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(ex1.getState());
	System.out.println(ex2.getState());
	
	
	

	
}
}
