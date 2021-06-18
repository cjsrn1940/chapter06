package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) throws Exception {
		
		Thread thread = new DigitThread();
		thread.start(); // start()메소드가 내부에 run()을 실행 : 출장준비(이동, 자리세팅)
		
		/* 섞어쓰기 안할 경우에는 start가 아닌 run으로 실행
		DigitThread thread = new DigitThread();
		thread.run();
		*/
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
