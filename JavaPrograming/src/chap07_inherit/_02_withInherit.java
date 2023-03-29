package chap07_inherit;

import chap07_inherit.car.Car;
import chap07_inherit.car.HyundaiCar;
import chap07_inherit.car.HyundaiCarInherit;
import chap07_inherit.car.KiaCar;
import chap07_inherit.car.KiaCarInherit;

public class _02_withInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체생성
		Car car = new Car();
		KiaCar kCar = new KiaCar();
		HyundaiCar hCar = new HyundaiCar();
		
		car.company = "GM";
		kCar.company = "Kia";
		hCar.company = "Hyundai";
		
		//자식클래스는 부모의 형태도 가지고 있기 때문에
		//부모클래스로 만들어진 변수에 대입가능하다.
		Car car1 = new KiaCarInherit();
		car1.company = "Kia";
		car1.carInfo();
		car1.speedUp();
		car1.speedDown();
		
		car1 = new HyundaiCarInherit();
		car1.company = "Hyundai";
		car1.carInfo();
		car1.speedUp();
		car1.speedDown();
	}

}
