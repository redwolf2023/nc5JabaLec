package chap07_inherit;

import chap07_inherit.animal.Animal;
import chap07_inherit.animal.Tiger;

public class UseofAnimal {

	public static void main(String[] args) {

		Animal tiger = new Tiger("고기", true, true, "검정",
				20, 158, 4, false);
		
		tiger.eat();
		
		
		
		
		
	}

}
