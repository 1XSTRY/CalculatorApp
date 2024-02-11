package pro.sky.Calculatorapp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorAppApplicationTests {

	private final CalculatorApp calculatorApp = new CalculatorApp();

	@ParameterizedTest
	@CsvSource({"5,5,10", "10,2,12", "0,0,0"})
	void add(int num1, int num2, String expected) {
		assertEquals(num1 + " + " + num2 + " = " + expected, calculatorApp.add(num1, num2));
	}

	@ParameterizedTest
	@CsvSource({"5,5,0", "10,2,8", "0,0,0"})
	void subtract(int num1, int num2, String expected) {
		assertEquals(num1 + " - " + num2 + " = " + expected, calculatorApp.subtract(num1, num2));
	}

	@ParameterizedTest
	@CsvSource({"5,5,25", "10,2,20", "0,0,0"})
	void multiply(int num1, int num2, String expected) {
		assertEquals(num1 + " * " + num2 + " = " + expected, calculatorApp.multiply(num1, num2));
	}

	@ParameterizedTest
	@CsvSource({"5,5,1", "10,2,5", "0,1,0"})
	void divide(int num1, int num2, String expected) {
		assertEquals(num1 + " / " + num2 + " = " + expected, calculatorApp.divide(num1, num2));
	}

}
