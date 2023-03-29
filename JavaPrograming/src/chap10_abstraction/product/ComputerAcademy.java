package chap10_abstraction.product;

public class ComputerAcademy extends Academy {
	
	//@override : 오버라이드 된 메소드라고 컴파일러에게 알림
	//@override 없으면 컴파일러가 오버라이드된 메소드인지
	//부모와 자식을 계속 비교하면서 컴파일
	@Override
	public void teaching() {
		System.out.println("컴퓨터를 가르칩니다.");
	}

	@Override
	public void homeworking() {
		System.out.println("컴퓨터 숙제를 합니다.");
	}

	@Override
	public void resting() {
		System.out.println("컴퓨터 학원 쉬는시간 입니다.");
		
	}

	@Override
	public void attending() {
		System.out.println(studentCnt +"명이 컴퓨터 학원 출석을 합니다.");
		
	}

}
