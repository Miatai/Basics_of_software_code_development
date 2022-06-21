package com.training.basics;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cycles {
	// 1.Напишите программу, где пользователь вводит любое целое положительное
	// число. А программа суммирует все числа от 1 до введенного пользователем
	// числа.
	public static int firstTask() {
		int sum = 0;
		int number = 0;
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Введите целое положительное число: ");
			number = in.nextInt();
			in.close();
			if (number <= 0) {
				System.out.println(
						"Ошибка! Вы ввели отрицательное число, или 0!");
				return 0;
			}
		} catch (Exception e) {
			System.out.println("Ошибка! Вы ввели не целое число!");
		}
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	// 2.Вычислить значения функции на отрезке [а,b] c шагом h.
	public static void secondTask(double a, double b, double h) {
		System.out.println("  y  |  x  ");
		System.out.println("___________");
		double y = 0;
		for (double i = a; i <= b; i += h) {
			if (i > 2) y = i;
			else y = -i;
			System.out.println(y + "|" + i);
		}
	}

	// 3.Найти сумму квадратов первых ста чисел.
	public static int thirdTask() {
		int result = 0;
		for (int i = 1; i <= 100; i++)
			result += i * i;
		return result;
	}

	// 4.Составить программу нахождения произведения квадратов первых двухсот чисел.
	public static BigInteger fourthTask() {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 2; i <= 200; i++) {
			result = new BigInteger(result.multiply(BigInteger.valueOf(i * i)).toString());
		}
		return result;
	}

	// 5.Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	// которых больше или равен заданному е. Общий член ряда имеет вид.
	public static double fivthTask(int firstN, int lastN, int e) {
		if (firstN > lastN) {
			System.out.println("Начальное n должно быть меньше либо равно последней n.");
			return 0;
		}
		double result = 0;
		double member = 0;
		for (int i = firstN; i <= lastN; i++) {
			member = (1 / Math.pow(2, i) + (1 / Math.pow(3, i)));
			if (Math.abs(member) >= e) result += member;
			System.out.println(member + "---" + result);
		}
		return result;
	}

	// 6.Вывести на экран соответствий между символами и их численными обозначениями
	// в памяти компьютера.
	public static void sixthTask(String symbols) {
		for (char symbol : symbols.toCharArray()) {
			System.out.println("символ: " + symbol + " обозначение: " + (int) symbol);
		}
	}

	// 7.Для каждого натурального числа в промежутке от m до n вывести все делители,
	// кроме единицы и самого числа. m и n вводятся с клавиатуры.
	public static void seventhTask() {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Введите значение числа m:");
			int m = in.nextInt();
			System.out.println("Введите значение числа n:");
			int n = in.nextInt();
			in.close();
			if (m <= 0) {
				System.out.println("m должно быть больше 0");
				return;
			}
			if (m > n) {
				System.out.println("n должно быть больше либо равно m");
				return;
			}
			for (int i = m; i <= n; i++) {
				System.out.println("число: " + i);
				for (int j = 2; j < i; j++) {
					if (i % j == 0) System.out.println("его делители: " + j);
				}
			}
		} catch (Exception e) {
			System.out.println("Ошибка! Вы ввели неправильное число!");
		}
	}

	// 8.Даны два числа. Определить цифры, входящие в запись как первого так и
	// второго числа.
	public static void eighthTask(int firstNumber, int secondNumber) {
		System.out.println("совпадающие символы: ");
		Set<Character> matchingSymbols = new HashSet<>();
		for (char symbolOfFirstNumber : String.valueOf(firstNumber).toCharArray()) {
			for (char symbolOfSecondNumber : String.valueOf(secondNumber).toCharArray()) {
				if (symbolOfFirstNumber == symbolOfSecondNumber) {
					matchingSymbols.add(symbolOfFirstNumber);
				}
			}
		}
		System.out.println(matchingSymbols.toString());
	}
}
