package chap09_polymorphism.product;

public class SamsungTv extends TV {
	
	public void powerOn() {
		System.out.println("제조사: samsung");
		super.powerOn();
	}
	
	public void powerOff() {
		System.out.println("제조사: samsung");
		super.powerOff();
	}

	@Override
	public void operate(int channel) {
			super.operate(channel);
	}

}
