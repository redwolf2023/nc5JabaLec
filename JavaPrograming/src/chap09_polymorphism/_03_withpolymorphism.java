package chap09_polymorphism;

import chap09_polymorphism.product.LgTv;
import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.TV;

public class _03_withpolymorphism {

	public static void main(String[] args) {

		//1. 다형성을 이용해 TV 바꾸기
		
		TV tv = new SamsungTv();
		
		tv.powerOn();
		tv.operate(11);
		tv.powerOff();
		tv.powerOn();
		
		tv = new LgTv();
		
		tv.powerOn();
		tv.operate(20);
		tv.powerOff();
		tv.powerOn();
		
		
		System.out.println(tv.toString());
		
	}

}
