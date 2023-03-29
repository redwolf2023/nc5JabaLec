package chap06_class.phone;

public class PhoneInfo {
	//이름100개와 전화번호 100개를 담을수 있는 배열 2개(String)
	
	public String[] name = new String[100];
	public String[] phoneNumber = new String[100];
	public int index = 0;
	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	public void insertPhoneNum(String name, String phoneNumber) {
		this.name[index] = name;
		this.phoneNumber[index] = phoneNumber;
		index++;
	}
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동, 전화번호 : 1111111111
	public void printAllPhoneNum() {
		for(int i = 0; i < index; i++) {
			if(name[i] != null) {
				System.out.println("이름 : " + name[i]+ "," + "전화번호 : " + phoneNumber[i]);
			}
		}
		
	}
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	public void printPhoneNum(int index) {
		if(name[index - 1] != null) {
			System.out.println("이름 : " + name[index - 1] + "," + "전화번호 : " + phoneNumber[index - 1]);
		}else {
			System.out.println("저장된 인덱스가 없습니다.");
		}
	}
}
