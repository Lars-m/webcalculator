package calculator;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
  
  Calculator calc = new Calculator();
  
  public CalculatorTest() {
  }
  
  @Test
  public void testAdd(){
    int res = calc.add(3, 3);
    assertEquals(6, res);
  }
  
  
}
