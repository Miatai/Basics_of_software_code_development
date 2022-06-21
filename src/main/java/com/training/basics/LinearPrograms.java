package com.training.basics;

public class LinearPrograms {
	// 1.Ќайдите значение функции: z = ( (a Ц 3 ) * b / 2) + c.
	public static double firstTask(double a, double b, double c) {
		return ((a - 3) * (b / 2)) + c;
	}

	// 2.¬ычислить значение выражени€ по формуле (все переменные принимают
	// действительные значени€):
	public static double secondTask(double a, double b, double c) {
		return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
				- (Math.pow(a, 3) * c + Math.pow(b, -2));
	}

	// 3.¬ычислить значение выражени€ по формуле (все переменные принимают
	// действительные значени€):
	public static double thirdTask(double x, double y, double t, double g) {
		return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * t
				* g * x * y;
	}

	// 4.ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и
	// целой част€х). ѕомен€ть местами дробную и целую части числа и вывести
	// полученное значение числа.
	public static double fourthTask(double r) {
		return (int) ((r % 1) * 1000) + (r / 1000 - (r % 1) / 1000);
	}

	// 5.ƒано натуральное число “, которое представл€ет длительность прошедшего
	// времени в секундах. ¬ывести данное значение длительности в часах, минутах и
	// секундах в следующей форме: ЌЌч ћћмин SSc.
	public static String fivthTask(int t) {
		return String.valueOf(t / 3600) + "ч " + String.valueOf((t % 3600) / 60)
				+ "м " + String.valueOf((t % 3600) % 60) + "с";
	}

	// 6.ƒл€ данной области составить линейную программу, котора€ печатает true,
	// если точка с координатами (х, у) принадлежит закрашенной области, и false Ч в
	// противном случае:
	public static boolean sixthTask(double x, double y) {
		if (x <= 2 && x >= -2 && y <= 4 && y >= 0)
			return true;
		if (x <= 4 && x >= -4 && y <= 0 && y >= -3)
			return true;
		return false;
	}

}
