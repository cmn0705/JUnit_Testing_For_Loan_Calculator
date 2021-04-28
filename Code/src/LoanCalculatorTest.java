import static org.junit.Assert.*;

import org.junit.Test;
public class LoanCalculatorTest {
	LoanCalculator lc= new LoanCalculator();

	@Test
	public void test1() {
		assertEquals(lc.payment(0,10,20),"Your total is: $0.00");
	}
	@Test
	public void test2() {
		assertEquals(lc.payment(100,0,20),"Your total is: $5.00");
	}
	@Test
	public void test3() {
		assertEquals(lc.payment(100,10,0),"Input Error");
	}
	@Test
	public void test4() {
		assertEquals(lc.payment(100,10,-1),"Input Error");
	}
	@Test
	public void test5() {
		assertEquals(lc.payment(100,10,20),"Your total is: $5.45");
	}
}