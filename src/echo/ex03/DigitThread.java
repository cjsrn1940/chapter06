package echo.ex03;

public class DigitThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<=9; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); //시간차이를 주기 위함
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
