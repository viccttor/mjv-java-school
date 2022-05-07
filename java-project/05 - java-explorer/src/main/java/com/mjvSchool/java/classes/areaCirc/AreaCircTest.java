package com.mjvSchool.java.classes.areaCirc;

public class AreaCircTest {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(3);
		
		AreaCirc a2 = new AreaCirc(22);
		
		AreaCirc a3 = new AreaCirc();
		a3.raio = 3;
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(a3.area());
		System.out.println(AreaCirc.area(50));

	}

}
