package homework4.printer;

public class InkJetPrinter extends Printer {
	
	public InkJetPrinter(String model, String company, String interfaceType, int numberOfPrints,
			int amountOfPrintpaper, int InkRemaining) {
		super(model, company, interfaceType, numberOfPrints, amountOfPrintpaper);
		this.InkRemaining = InkRemaining;
	}

	private int InkRemaining;

	@Override
	public void print() {
		super.print();
		System.out.println("잉크를 사용합니다.");
		this.setInkRemaining(this.getInkRemaining() - 1);
	}

	public int getInkRemaining() {
		return InkRemaining;
	}

	public void setInkRemaining(int inkRemaining) {
		InkRemaining = inkRemaining;
	}
	
	

	
	
}
