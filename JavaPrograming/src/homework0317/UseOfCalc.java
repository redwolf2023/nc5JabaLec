package homework0317;

import homework4.Calc.Add;
import homework4.Calc.Calc;
import homework4.Calc.Div;
import homework4.Calc.Mul;
import homework4.Calc.Sub;

public class UseOfCalc {

	public static void main(String[] args) {

		Calc[] calcArr = new Calc[4];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		calcArr[0].setValue(5, 10);
		System.out.println(calcArr[0].calculate());
		calcArr[1].setValue(50, 25);
		System.out.println(calcArr[1].calculate());
		calcArr[2].setValue(4568, 413);
		System.out.println(calcArr[2].calculate());
		

	}
}
