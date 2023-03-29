package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;

public class _02_withoutPolymorphism {

	public static void main(String[] args) {

		//1. 다형성을 사용하지 않고 TV 바꾸기
		LgTv ltv = new LgTv();
		SamsungTv stv = new SamsungTv();
		
		ltv.powerOn();
		ltv.operate(11);
		ltv.powerOff();
		ltv.powerOn();
		
 	}

}
