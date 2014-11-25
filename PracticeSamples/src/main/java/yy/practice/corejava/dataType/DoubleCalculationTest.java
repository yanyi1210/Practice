package yy.practice.corejava.dataType;

import java.math.BigDecimal;

public class DoubleCalculationTest {
	
	
	public static void main(String arg[]){
		double x = 3.5d;
		double y = 2.3d;
		double result1 = x-y;

		BigDecimal premium = BigDecimal.valueOf(x);
		BigDecimal netToCompany = BigDecimal.valueOf(y);
		BigDecimal commission = premium.subtract(netToCompany);
//		BigDecimal commission2 = premium-netToCompany;
		double result2 = commission.doubleValue();
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
	

}
