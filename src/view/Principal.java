package view;

import controller.DivideController;

public class Principal {
	
	public static void main(String[] args) {
		
		DivideController dc = new DivideController();
		int dividendo = 19;
		int divisor = 4;
		int div = dc.div(dividendo, divisor);
		
		System.out.println(div);
		
	}
	
}