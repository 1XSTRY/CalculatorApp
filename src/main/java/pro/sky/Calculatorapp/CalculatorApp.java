package pro.sky.Calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class CalculatorApp {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApp.class, args);
	}
	@GetMapping
	public String welcome() {
		return "Добро пожаловать в калькулятор";
	}

	@GetMapping("/plus")
	public String add(@RequestParam int num1, @RequestParam int num2) {
		return num1 + " + " + num2 + " = " + (num1 + num2);
	}

	@GetMapping("/minus")
	public String subtract(@RequestParam int num1, @RequestParam int num2) {
		return num1 + " - " + num2 + " = " + (num1 - num2);
	}

	@GetMapping("/multiply")
	public String multiply(@RequestParam int num1, @RequestParam int num2) {
		return num1 + " * " + num2 + " = " + (num1 * num2);
	}

	@GetMapping("/divide")
	public String divide(@RequestParam int num1, @RequestParam int num2) {
		if (num2 == 0) {
			return "Ошибка: деление на 0 невозможно";
		}
		return num1 + " / " + num2 + " = " + (num1 / num2);
	}

	@GetMapping("/divide")
	public String divideOperation(@RequestParam int num1, @RequestParam int num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Ошибка: деление на 0 невозможно");
		}
		return num1 + " / " + num2 + " = " + (num1 / num2);
	}
}
