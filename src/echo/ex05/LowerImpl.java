package echo.ex05;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000); //시간차이를 주기 위함
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
