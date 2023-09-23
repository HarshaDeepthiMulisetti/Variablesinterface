package com_Intvariables;


	 interface Sampleinterface {
		int Limit=100;
		String name="Harsha"; 
		
	}
	public class Sampleclass implements Sampleinterface{
		public static void main(String[] args) {
			System.out.println("Limit is "+Limit);
			System.out.println("name is "+name);
			//int Limit=150; its cont modified
		}
	}


