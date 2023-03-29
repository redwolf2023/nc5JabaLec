package chap10_abstraction.product;

public class LgTv extends TV {
	
	public void powerOn() {
		System.out.println("lgtv 켬");
		
	}
	
	public void powerOff() {
		System.out.println("lgtv 끔");
		
	}

	
	public void operate(int channel) {
		System.out.println("lgtv 채널" + channel + "로 이동");
		lastChannel = channel;
	}
	
	

}
