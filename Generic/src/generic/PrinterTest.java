package generic;

public class PrinterTest {

	public static void main(String[] args) {
		Powder tmp = new Powder();
		Printer<Powder> printer = new Printer<Powder>();
		printer.setMaterial(tmp);
		System.out.println(printer.toString());
	
		/* Printer�� ���ʸ� Ÿ�� T�� Material�� ����̱� ������ Integer�� �Ұ���
		Printer<Integer> intPrinter = new Printer<Integer>();
		Integer tmp2 = new Integer(2);
		intPrinter.setMaterial(tmp2);
		System.out.println(intPrinter.toString());
		*/
	}

}
