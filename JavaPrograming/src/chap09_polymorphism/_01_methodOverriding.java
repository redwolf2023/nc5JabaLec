package chap09_polymorphism;

import chap09_polymorphism.product.AirCon;
import chap09_polymorphism.product.ElectronicDevice;
import chap09_polymorphism.product.TV;

public class _01_methodOverriding {

	public static void main(String[] args) {

		
		//1. 다형성의 구현
		//부모형태의 변수에 자식 인스턴스(객체)를 담아
		//다양한 형태로 사용한다.
		ElectronicDevice ed = new TV();
		ed.powerOn();
		ed.operate(11);
		ed.powerOff();
		
		ed.powerOn();
		
		ed = new AirCon();
		ed.powerOn();
		ed.operate(18);
		ed.powerOff();
		
		ed.powerOn();
		
	}

}
