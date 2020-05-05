package thread.level2;




public class MyThread extends Thread{

	
	 public boolean exit = false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    try {
			sleep(10000);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(exit==false) {
	    System.out.println("Time out ");
		System.exit(0);
		   return;
	    }
	
	return;    
		
		
	}
	
	
	public void stop1(){
        exit = true;
    }
	
	
	
	
	
	
	
	
}
