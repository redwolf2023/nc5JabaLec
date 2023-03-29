package chap10_abstraction.product;

public class EnglishAcademy extends Academy{

	@Override
	public void teaching() {
		System.out.println("영어를 가르칩니다.");
	}

	@Override
	public void homeworking() {
		System.out.println("영어숙제를 합니다.");
		
	}

	@Override
	public void resting() {
		System.out.println("영어학원 쉬는 시간입니다.");
		
	}

	@Override
	public void attending() {
		System.out.println(studentCnt +"명이 영어학원 출석을 합니다.");
		
	}

}
