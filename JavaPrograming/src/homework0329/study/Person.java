package homework0329.study;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public void person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public  void PersonInfo(){
		System.out.println("이름 : " + getName() + " 나이 : " + getAge() + " 성별 : " + getGender());
	}
}
