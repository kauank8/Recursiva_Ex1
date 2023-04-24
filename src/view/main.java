package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class main {

	public static void main(String[] args) {
		SomaController s = new SomaController();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		int resul=s.soma(n);
		System.out.println(resul);

	}

}
