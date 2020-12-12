package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {
	public static void main(String[] args) {
	hello("World");
	hello("user");
	hello("Алексей");
Square s = new Square(5);

			System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
Rectable r = new Rectable(5.0, 6.0);

		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b +" = " + r.area());
}
public static void hello(String sombody) {

	System.out.println("Hello, " + sombody + "!");
}
}