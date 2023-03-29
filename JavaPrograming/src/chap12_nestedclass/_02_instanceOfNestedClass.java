package chap12_nestedclass;

import chap12_nestedclass.clazz.NestedClass;
import chap12_nestedclass.clazz.NestedClass.Div;

public class _02_instanceOfNestedClass {

	
	public static void main(String[] args) {
		//1. 외부클래스의 객체 생성
		NestedClass nc = new NestedClass();
		
		NestedClass.Mul mul = nc.new Mul();
		//2. 정적 중첩 클래스의 객체 생성
		NestedClass.Div div = new NestedClass.Div();
		
		//3-1. 정적 중첩 클래스의 정적 멤버에 접근
		System.out.println(NestedClass.Div.result);
		
		//3-2.정적 중첩 클래스의 일반 멤버에 접근
		System.out.println(div.getNum3());
		
		//4. 인스턴스 중첩 클래스의 객체 사용
		mul.setNum1(150);
		mul.setNum2(15);
		mul.setResult(mul.getNum1() * mul.getNum2());
		System.out.println(mul.getResult());
		
		
		
		
	
	
	}
}