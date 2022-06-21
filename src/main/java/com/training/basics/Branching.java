package com.training.basics;

public class Branching {
	// 1.���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����
	// �����������, � ���� ��, �� ����� �� �� �������������.
	public static String firstTask(double x, double y) {
		if (180 - (x + y) <= 0) return "�� ����������";
		if (x == 90 || y == 90 || 180 - (x + y) == 90)
			return "����������� ���������� � �������� �������������";
		return "����������� ���������� � �� �������� �������������";
	}

	// 2.����� max{min(a, b), min(c, d)}.
	public static double secondTask(double a, double b, double c, double d) {
		double minAB;
		double minCD;
		if (a <= b) minAB = a;
		else minAB = b;
		if (c <= d) minCD = c;
		else minCD = d;
		return minAB >= minCD ? minAB : minCD;
		// return Math.max(Math.min(a, b), Math.min(c, d));
	}

	// 3.���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ���
	// ����������� �� ����� ������.
	public static boolean thirdTask(double x1, double y1, double x2, double y2,
			double x3, double y3) {
		return (x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3) ? true : false;
	}

	// 4.������ ������� �, � �������������� ��������� � ������� �, �, z �������.
	// ����������, ������� �� ������ ����� ���������.
	public static boolean fourthTask(double a, double b, double x, double y,
			double z) {
		return (a >= x && (b >= y || b >= z)) || (a >= y && (b >= x || b >= z))
				|| (a >= z && (b >= x || b >= y)) ? true : false;
	}
	// 5.��������� �������� �������.
	public static double fivthTask(double x) {
		return x <= 3 ? (x * x) - 3 * x + 9 : 1 / ((x * x * x) + 6);
	}
}
