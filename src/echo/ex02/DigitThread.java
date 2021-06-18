package echo.ex02;

public class DigitThread extends Thread  {

	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	@Override
	public void run() { // 우리로직 코드는 반드시 run 메소드에 써야함
		
		//0~9 출력
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
