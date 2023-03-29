package homework4.printer;

public class LazerPrinter extends Printer {
	
	public LazerPrinter(String model, String company, String interfaceType, int numberOfPrints,
			int amountOfPrintpaper, int tonerRemaining) {
		super(model, company, interfaceType, numberOfPrints, amountOfPrintpaper);
		this.tonerRemaining = tonerRemaining;
	}

	private int tonerRemaining;

	@Override
	public void print() {
		super.print();
		System.out.println("토너를 사용합니다.");
		this.setTonerRemaining(this.getTonerRemaining() - 1);
	}

	public int getTonerRemaining() {
		return tonerRemaining;
	}

	public void setTonerRemaining(int tonerRemaining) {
		this.tonerRemaining = tonerRemaining;
	}
	
	
}
