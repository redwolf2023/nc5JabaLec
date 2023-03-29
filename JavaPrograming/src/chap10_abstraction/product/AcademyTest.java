package chap10_abstraction.product;

public class AcademyTest {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스화 불가.
		//Academy a = new Academy
		
		Academy a = new ComputerAcademy();
		
		a.studentCnt = 30;
		a.attending(); 
		
		System.out.println("-------------------");
		
		a = new EnglishAcademy();
		
		a.studentCnt = 20;
		a.attending();
		
	}

}
