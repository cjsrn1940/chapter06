package echo.ex03;

public class Multithread {

	public static void main(String[] args) {
		
		//thread --> 시간순으로 돌아가는 걸 각자 독립적으로 돌아가게 함
		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThread();
		Thread thread3 = new UpperThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
