package homework0317;

import homework4.printer.InkJetPrinter;
import homework4.printer.LazerPrinter;

public class UseOfPrint {


	public static void main(String[] args) {

		
		
		InkJetPrinter print = new InkJetPrinter("Deskjet1000", "HP", "USB", 0, 100, 5);
		print.print();
		System.out.println("잉크잔량" + print.getInkRemaining());
		System.out.println("남은 용지 수 :" + print.getAmountOfPrintPaper());
		System.out.println("-----------------------------");
		LazerPrinter print1 = new LazerPrinter("Laserjet1000", "HP", "USB", 0, 200, 10);
		print1.print();
		System.out.println("토너잔량" + print1.getTonerRemaining());
		System.out.println("남은 용지 수 :" + print1.getAmountOfPrintPaper());

		
	}

}
