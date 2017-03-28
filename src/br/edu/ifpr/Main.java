package br.edu.ifpr;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame {

	public static void main(String[] args) {
		JFrame tela = new JFrame();
		
		tela.add(new Controller());
		tela.setSize(280,250);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Calculadora de respeito");
		tela.setResizable(false);
		tela.setVisible(true);
	}

}
