package controller;

public class SomaController {
	public SomaController() {
		
	}
	
	public int soma(int n) {
		//condiçao de parada
		if(n<0) {
			return 0;
		}
		else {
			return n+soma(n-1);	
		}
	}
}
