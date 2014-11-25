package yy.practice.datastructure.chapter4;

import org.junit.Test;

public class TestParsingArithmeticExpression {

	@Test
	public void testInToPostCoverter() {

		ArithmeticExpressionInPostCoverter convertor = new ArithmeticExpressionInPostCoverter();
		try {
			System.out.println(convertor.doConvert("A*(B+C)-D/(E+F)"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	@Test
	public void testParsePost() {
		ArithmeticExpressionInPostCoverter convertor = new ArithmeticExpressionInPostCoverter();
		ArithmeticExpressionParsePost parser = new ArithmeticExpressionParsePost();
		try {
			String post = convertor.doConvert("6*(5+4)-3/(2+1)");
			System.out.println(post);
			int result = parser.doParse(post);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

}
