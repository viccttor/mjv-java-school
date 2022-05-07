package com.mjvSchool.java.classes.areaCirc;

public class AreaCirc {
	double raio;
	static final double PI = 3.14;
	
	AreaCirc () {
		
	}
	
	AreaCirc (double raioInicial) {
		 raio = raioInicial;
	}
	
	 double area () {
		double area = PI * Math.pow(raio, 2);
		return area;
	}
	 
	 static double area (double raio) {
		 return  PI * Math.pow(raio, 2);
		 
	 }
}
