package com.training.basics;

public class LinearPrograms {
	// 1.������� �������� �������: z = ( (a � 3 ) * b / 2) + c.
	public static double firstTask(double a, double b, double c) {
		return ((a - 3) * (b / 2)) + c;
	}

	// 2.��������� �������� ��������� �� ������� (��� ���������� ���������
	// �������������� ��������):
	public static double secondTask(double a, double b, double c) {
		return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
				- (Math.pow(a, 3) * c + Math.pow(b, -2));
	}

	// 3.��������� �������� ��������� �� ������� (��� ���������� ���������
	// �������������� ��������):
	public static double thirdTask(double x, double y, double t, double g) {
		return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * t
				* g * x * y;
	}

	// 4.���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� �
	// ����� ������). �������� ������� ������� � ����� ����� ����� � �������
	// ���������� �������� �����.
	public static double fourthTask(double r) {
		return (int) ((r % 1) * 1000) + (r / 1000 - (r % 1) / 1000);
	}

	// 5.���� ����������� ����� �, ������� ������������ ������������ ����������
	// ������� � ��������. ������� ������ �������� ������������ � �����, ������� �
	// �������� � ��������� �����: ��� ����� SSc.
	public static String fivthTask(int t) {
		return String.valueOf(t / 3600) + "� " + String.valueOf((t % 3600) / 60)
				+ "� " + String.valueOf((t % 3600) % 60) + "�";
	}

	// 6.��� ������ ������� ��������� �������� ���������, ������� �������� true,
	// ���� ����� � ������������ (�, �) ����������� ����������� �������, � false � �
	// ��������� ������:
	public static boolean sixthTask(double x, double y) {
		if (x <= 2 && x >= -2 && y <= 4 && y >= 0)
			return true;
		if (x <= 4 && x >= -4 && y <= 0 && y >= -3)
			return true;
		return false;
	}

}
