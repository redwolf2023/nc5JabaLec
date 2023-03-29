package chap10_abstraction.product;

public class SamsungTv extends TV {
	
	public void powerOn() {
		System.out.println("samsungtv 전원 켜기");
		
	}
	
	public void powerOff() {
		System.out.println("samsungtv 전원 끄기");
		
	}

	
	public void operate(int channel) {
		System.out.println("samsungtv 채널" +
				channel + "로 이동");
		lastChannel = channel;
	}

}
