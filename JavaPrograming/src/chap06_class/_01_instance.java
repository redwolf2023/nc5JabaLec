package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_instance {

	public static void main(String[] args) {

		//객체화(인스턴화)
		Add add = new Add();
		
		add.setNum1(10);
		add.setNum2(20);
		//add.setResult(add.getNum1() + add.getNum2());
		
		System.out.println(add.add());
		
		Minus minus = new Minus();
		
		minus.setNum1(20);
		minus.setNum2(30);
		//minus.setResult(minus.getNum1() - minus.getNum2());
		
		System.out.println(minus.minus());
		
		Multiple multiple = new Multiple();
		
		multiple.setNum1(5);
		multiple.setNum2(10);
		//multiple.setResult(multiple.getNum1() * multiple.getNum2());
		
		System.out.println(multiple.multi());
		
		Divide divide = new Divide();
		
		divide.setNum1(40);
		divide.setNum2(5);
		//divide.setResult(divide.getNum1() / divide.getNum2());
		
		System.out.println(divide.divide());
		
		//설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		//인스턴화 : 생성자를 통해서 객체를 생성하고 heap 메모리 영역에 저장
		//		  항상 new 키워드와 함께 사용
		Calc cal = new Calc();
		
		int receiveNum = cal.add(10, 20);
		//리턴 값을 받아주는 변수가 없으면 결과가 메모리에 저장되지 않고
		//연산이 일어난 후 삭제
		cal.add(10, 20);
	
		System.out.println(cal.add(10, 20));
		
		System.out.println(cal.minus(cal.add(10, 20), cal.divide(20, 10)));
		
		Calc cal2 = new Add();
		System.out.println(cal2.add(4, 3));
		
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3));
		
				
	
	}

}
