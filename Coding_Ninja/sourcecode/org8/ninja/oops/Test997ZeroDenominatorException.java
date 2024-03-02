package org8.ninja.oops;

import org.nininja.utils.Fraction2;
import org.nininja.utils.ZeroDenominatorException;

public class Test997ZeroDenominatorException {
	public static void temp() {
		Fraction2 f1 = new Fraction2(20,30);
		f1.print();
		// 2/3
		
		f1.setNumerator(12);
		// 4/1
		int d = f1.getDenominator();
		System.out.println(d);
		f1.print();
//		
		f1.setNumerator(10);
		int i = 47;
		try {
			i++;
			f1.setDenominator(0);	
			i++;
			
		} catch(ZeroDenominatorException e) {
			System.out.println("Hey dont input 0 as denominator");
		} finally {
			
		}
		
		
		System.out.println(i);
		
		
		// 1/3
		f1.print();
//		
		Fraction2 f2 = new Fraction2(3,4);
		f1.add(f2);
		f1.print();
		// f1 => 13/12
		f2.print();
		// f2 => 3/4
//		
		Fraction2 f3 = new Fraction2(4,5);
		f3.multiply(f2);
		f3.print();
		// f3 => 3/5
		f2.print();
		// f2 => 3/4
//		
		Fraction2 f4 = Fraction2.add(f1, f3);
		f1.print();
		f3.print();
		f4.print();
	}
	
	public static void main(String[] args) throws ZeroDenominatorException{
		temp();
//		String s = "";
//		File f;
//		try {
//			f = new File(s);
//			// read file
//		} catch (FileNotFoundException exception) {
//	
//		} finally {
//			f.close();
//		}
		
		
		
	}
}