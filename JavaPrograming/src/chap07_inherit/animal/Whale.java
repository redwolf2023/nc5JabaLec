package chap07_inherit.animal;

public class Whale extends Animal{
	
	public String krill;
	public String color;
	public boolean hasfur;
	
	public Whale() {}	
	
	public Whale(String krill, String color, boolean fur,
			int age, int size, int legCnt, 
			boolean hasWing) {
		
		super(age, size, legCnt, hasWing);
		
		this.krill = krill;
		this.color = color;
		this.hasfur = hasfur;
	
	}

	@Override
	public void eat() {
		System.out.println(krill + "를 먹는다.");
		super.eat();
	}
	
	public void printFur() {
		if(hasfur) {
			System.out.println("이 고래는 털을 가지고 있습니다.");
		}else {
			System.out.println("이 고래는 털을 가지고 있지 않습니다.");
		}
		
	}
	

}
