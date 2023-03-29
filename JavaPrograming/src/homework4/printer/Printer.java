package homework4.printer;

public class Printer {
	
	private String model;
	private String company;
	private String interfaceType;
	private int numberOfPrints;
	private int amountOfPrintPaper;
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getInterfaceType() {
		return interfaceType;
	}


	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}


	public int getNumberOfPrints() {
		return numberOfPrints;
	}


	public void setNumberOfPrints(int numberOfPrints) {
		this.numberOfPrints = numberOfPrints;
	}


	public int getAmountOfPrintPaper() {
		return amountOfPrintPaper;
	}


	public void setAmountOfPrintPaper(int amountOfPrintPaper) {
		this.amountOfPrintPaper = amountOfPrintPaper;
	}


	public Printer(String model, String company, String interfaceType, int numberOfPrints, int amountOfPrintpaper) {
		this.model = model;
		this.company = company;
		this.interfaceType = interfaceType;
		this.numberOfPrints = numberOfPrints;
		this.amountOfPrintPaper = amountOfPrintpaper;
		
	}
	
	
	public void print() {
		System.out.println("인쇄용지 1매를 사용합니다.");
		this.numberOfPrints++;
		this.amountOfPrintPaper--;
	}
}
