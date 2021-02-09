
public class AutreBateau implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		AutreBateau autreBateau= new AutreBateau();
		Thread thread= new Thread(autreBateau);
		
		thread.start();
		
		System.out.println("Thread lancé");
		
		int n=0;
		while(n++<1000) {
			
		System.out.println("Je vogue aussi !");
	
		}try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}	
	}

}
