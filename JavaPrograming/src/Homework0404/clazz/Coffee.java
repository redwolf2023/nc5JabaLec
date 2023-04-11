package Homework0404.clazz;

public enum Coffee {
	
	AMERICANO(2000) {
		@Override
		public int totalPrice(int optionOrder, int normalOrder) {
			// TODO Auto-generated method stub
			return getPrice() * normalOrder + 300 * optionOrder;
		}
	},LATTE(3000) {

		@Override
		public int totalPrice(int optionOrder, int normalOrder) {
			// TODO Auto-generated method stub
			return getPrice() * normalOrder + 500 * optionOrder;
		}
		
	},MOCHA(4000) {

		@Override
		public int totalPrice(int optionOrder, int normalOrder) {
			// TODO Auto-generated method stub
			return getPrice() * normalOrder + 1000 * optionOrder;
		}
		
	},COLDBREW(4500) {

		@Override
		public int totalPrice(int optionOrder, int normalOrder) {
			// TODO Auto-generated method stub
			return getPrice() * normalOrder + 200 * optionOrder;

		}
		
	};
	
	private int price;
	
	Coffee(int price){
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public abstract int totalPrice(int optionOrder, int normalOrder);
		
	

}
