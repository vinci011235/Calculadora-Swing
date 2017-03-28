package br.edu.ifpr;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Controller extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField output;
	private JButton zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove;
	private JButton mais, menos, multi, div, igual, clear;
	private double number1;
	private String op;
	
	public Controller(){
		super();

		TrataBotao action = new TrataBotao();
		
		this.setLayout(null);

		output = new JTextField("0",20);
		output.setBounds(25, 10, 230, 25);
		this.add(output);
		
		um = new JButton("1");
		um.setBounds(25, 40, 50, 30);
		um.addActionListener(action);
		this.add(um);

		dois = new JButton("2");
		dois.setBounds(85, 40, 50, 30);
		dois.addActionListener(action);
		this.add(dois);
		
		tres = new JButton("3");
		tres.setBounds(145, 40, 50, 30);
		tres.addActionListener(action);
		this.add(tres);
		
		mais = new JButton("+");
		mais.setBounds(205, 40, 50, 30);
		mais.addActionListener(action);
		this.add(mais);
		
		quatro = new JButton("4");
		quatro.setBounds(25, 80, 50, 30);
		quatro.addActionListener(action);
		this.add(quatro);
		
		cinco = new JButton("5");
		cinco.setBounds(85, 80, 50, 30);
		cinco.addActionListener(action);
		this.add(cinco);
		
		seis = new JButton("6");
		seis.setBounds(145, 80, 50, 30);
		seis.addActionListener(action);
		this.add(seis);
		
		menos = new JButton("-");
		menos.setBounds(205, 80, 50, 30);
		menos.addActionListener(action);
		this.add(menos);

		sete = new JButton("7");
		sete.setBounds(25, 120, 50, 30);
		sete.addActionListener(action);
		this.add(sete);
		
		oito = new JButton("8");
		oito.setBounds(85, 120, 50, 30);
		oito.addActionListener(action);
		this.add(oito);
	
		nove = new JButton("9");
		nove.setBounds(145, 120, 50, 30);
		nove.addActionListener(action);
		this.add(nove);
		
		multi = new JButton("x");
		multi.setBounds(205, 120, 50, 30);
		multi.addActionListener(action);
		this.add(multi);
		
		clear = new JButton("C");
		clear.setBounds(25, 160, 50, 30);
		clear.addActionListener(action);
		this.add(clear);
		
		zero = new JButton("0");
		zero.setBounds(85, 160, 50, 30);
		zero.addActionListener(action);
		this.add(zero);
		
		igual = new JButton("=");
		igual.setBounds(145, 160, 50, 30);
		igual.addActionListener(action);
		this.add(igual);
		
		div = new JButton("/");
		div.setBounds(205, 160, 50, 30);
		div.addActionListener(action);
		this.add(div);
		System.out.println(number1);
	}
	
	private class TrataBotao implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(zero)){
				if(output.getText().equals("0"))
					output.setText("0");
				else
					output.setText(output.getText() + "0");
			}
			if(e.getSource().equals(um)){
				if(output.getText().equals("0")){
					output.setText("1");
				}else
					output.setText(output.getText() + "1");
			}
			if(e.getSource().equals(dois)){
				if(output.getText().equals("0")){
					output.setText("2");
				}else
					output.setText(output.getText() + "2");
			}
			if(e.getSource().equals(tres)){
				if(output.getText().equals("0")){
					output.setText("3");
				}else
					output.setText(output.getText() + "3");
			}
			if(e.getSource().equals(quatro)){
				if(output.getText().equals("0")){
					output.setText("4");
				}else
					output.setText(output.getText() + "4");
			}
			if(e.getSource().equals(cinco)){
				if(output.getText().equals("0")){
					output.setText("5");
				}else
					output.setText(output.getText() + "5");
			}
			if(e.getSource().equals(seis)){
				if(output.getText().equals("0")){
					output.setText("6");
				}else
					output.setText(output.getText() + "6");
			}
			if(e.getSource().equals(sete)){
				if(output.getText().equals("0")){
					output.setText("7");
				}else
					output.setText(output.getText() + "7");
			}
			if(e.getSource().equals(oito)){
				if(output.getText().equals("0")){
					output.setText("8");
				}else
					output.setText(output.getText() + "8");
			}
			if(e.getSource().equals(nove)){
				if(output.getText().equals("0")){
					output.setText("9");
				}else
					output.setText(output.getText() + "9");
			}
			
			//tratamento dos operadores
			if(e.getSource().equals(clear)){
					output.setText("0");
			}
			if(e.getSource().equals(mais)){
				number1 = Integer.parseInt(output.getText());
				output.setText("");
				op = "+";
			}
			if(e.getSource().equals(menos)){
				number1 = Integer.parseInt(output.getText());
				output.setText("");
				op = "-";
			}
			if(e.getSource().equals(multi)){
				number1 = Integer.parseInt(output.getText());
				output.setText("");
				op = "x";
			}
			if(e.getSource().equals(div)){
				number1 = Integer.parseInt(output.getText());
				output.setText("");
				op = "/";
			}
			if(e.getSource().equals(igual)){
				output.setText(toString(Calculator(number1, op, Integer.parseInt(output.getText()))));
			}

		}

		private String toString(double calculator) {
			return "= " + calculator;
		}
	}
	
	public double Calculator(double number1, String op, double number2){
		double res = 0;
		
		switch (op){
		case "+":
			res = number1 + number2;
			break;
		case "-":
			res = number1 - number2;
			break;
		case "x":
			res = number1 * number2;
			break;
		case "/":
			if(number2 == 0){
				res = number1;
			}else
				res = number1 / number2;
		}
		return res;
	}
}
