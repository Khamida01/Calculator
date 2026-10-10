package my.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Создаем сканер для чтения ввода из консоли
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Простой калькулятор ");
		// Ввод первого числа
		System.out.print("Введите первое число: ");
		double num1 = scanner.nextDouble();
		// Ввод оператора
		System.out.print("Введите операцию (+, -, *, /): ");
		char operation = scanner.next().charAt(0);
		// Ввод второго числа
		System.out.print("Введите второе число: ");
		double num2 = scanner.nextDouble();

		double result = 0;
		boolean validOperation = true;
		// Логика вычислений
		switch (operation) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Ошибка: деление на ноль невозможно!");
				validOperation = false;
			}
			break;
		default:
			System.out.println("Ошибка: неверный знак операции");
			validOperation = false;

		}
		// Вывод результата, если всё прошло успешно
		if (validOperation) {
			System.out.println("Результат: " + num1 + " " + operation + " " + num2 + " = " + result);
		}
		scanner.close();

	}
}
