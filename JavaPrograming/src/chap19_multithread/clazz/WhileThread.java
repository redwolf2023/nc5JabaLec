package chap19_multithread.clazz;

public class WhileThread extends Thread {
	
	private boolean stop = false;
	
	public boolean isStop(boolean stop) {
		return stop;
	}
	
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}


	@Override
	public void run() {
		while(!stop) {
			System.out.println("스레드 실행");
		} 
		
		
		System.out.println("스레드 종료");
	}
}
