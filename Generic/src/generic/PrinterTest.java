package generic;

public class PrinterTest {

	public static void main(String[] args) {
		Powder tmp = new Powder();
		Printer<Powder> printer = new Printer<Powder>();
		printer.setMaterial(tmp);
		System.out.println(printer.toString());
		
		/* Printer의 제너릭 타입 T가 Material의 상속이기 때문에 Integer는 불가능
		Printer<Integer> intPrinter = new Printer<Integer>();
		Integer tmp2 = new Integer(2);
		intPrinter.setMaterial(tmp2);
		System.out.println(intPrinter.toString());
		*/
	}

}
