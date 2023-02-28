package controller;

public class DivideController {
	
	public DivideController() {
		
		super();
		
	}
	
	public int div(int dividendo, int divisor) {
		
		if (dividendo%divisor == 0) {
			
			return 0;
			
		} else {
			
			dividendo = dividendo - 1;
			return 1 + div(dividendo, divisor);
			
		}
		
	}
	
}