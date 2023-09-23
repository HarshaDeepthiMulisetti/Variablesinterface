package com_Intvariables;
interface Math{
	public static final double	PI = 3.14;//by default p and s,final
	
}

public class Samplecls implements Math {
public static void main(String[] args) {
		
		//Calculate area of circle
		int radious =2;
		//call interface constant Math.PI
		double area = PI*radious*radious;
		
		System.out.println("Area of Circle ="+ area);		
		
	}
}
