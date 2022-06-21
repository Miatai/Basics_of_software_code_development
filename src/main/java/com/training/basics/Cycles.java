package com.training.basics;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cycles {
	// 1.�������� ���������, ��� ������������ ������ ����� ����� �������������
	// �����. � ��������� ��������� ��� ����� �� 1 �� ���������� �������������
	// �����.
	public static int firstTask() {
		int sum = 0;
		int number = 0;
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("������� ����� ������������� �����: ");
			number = in.nextInt();
			in.close();
			if (number <= 0) {
				System.out.println(
						"������! �� ����� ������������� �����, ��� 0!");
				return 0;
			}
		} catch (Exception e) {
			System.out.println("������! �� ����� �� ����� �����!");
		}
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	// 2.��������� �������� ������� �� ������� [�,b] c ����� h.
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

	// 3.����� ����� ��������� ������ ��� �����.
	public static int thirdTask() {
		int result = 0;
		for (int i = 1; i <= 100; i++)
			result += i * i;
		return result;
	}

	// 4.��������� ��������� ���������� ������������ ��������� ������ ������� �����.
	public static BigInteger fourthTask() {
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 2; i <= 200; i++) {
			result = new BigInteger(result.multiply(BigInteger.valueOf(i * i)).toString());
		}
		return result;
	}

	// 5.���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������
	// ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���.
	public static double fivthTask(int firstN, int lastN, int e) {
		if (firstN > lastN) {
			System.out.println("��������� n ������ ���� ������ ���� ����� ��������� n.");
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

	// 6.������� �� ����� ������������ ����� ��������� � �� ���������� �������������
	// � ������ ����������.
	public static void sixthTask(String symbols) {
		for (char symbol : symbols.toCharArray()) {
			System.out.println("������: " + symbol + " �����������: " + (int) symbol);
		}
	}

	// 7.��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������,
	// ����� ������� � ������ �����. m � n �������� � ����������.
	public static void seventhTask() {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("������� �������� ����� m:");
			int m = in.nextInt();
			System.out.println("������� �������� ����� n:");
			int n = in.nextInt();
			in.close();
			if (m <= 0) {
				System.out.println("m ������ ���� ������ 0");
				return;
			}
			if (m > n) {
				System.out.println("n ������ ���� ������ ���� ����� m");
				return;
			}
			for (int i = m; i <= n; i++) {
				System.out.println("�����: " + i);
				for (int j = 2; j < i; j++) {
					if (i % j == 0) System.out.println("��� ��������: " + j);
				}
			}
		} catch (Exception e) {
			System.out.println("������! �� ����� ������������ �����!");
		}
	}

	// 8.���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� �
	// ������� �����.
	public static void eighthTask(int firstNumber, int secondNumber) {
		System.out.println("����������� �������: ");
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
