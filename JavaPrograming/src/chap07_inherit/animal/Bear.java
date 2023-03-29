package chap07_inherit.animal;

public class Bear extends Animal {
	
	private String species;
    private double weight;
    private boolean isHibernate;
    
    public Bear() {}
    
    public Bear(String species, double weight,
    		boolean isHibernate, int age, int size, 
    		int legCnt, boolean hasWing) {
    	
    	super(age, size, legCnt, hasWing);
    	
    	this.species = species;
        this.weight = weight;
        this.isHibernate = isHibernate;
    }
    
    @Override
	public void eat() {
    	System.out.println("곰이 먹습니다.");
		super.eat();
	}

	public void roar() {
        System.out.println("곰이 울음소리를 냅니다.");
    }

   

    public void sleep() {
        if (isHibernate) {
            System.out.println(species + "겨울 잠을 잡니다.");
        } else {
            System.out.println(species + "잠을 잡니다.");
        }
    }
   
}
