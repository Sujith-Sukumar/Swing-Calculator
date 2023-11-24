import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isOperatorClicked=false;
	
	JFrame jf;
	JLabel displayJLabel;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton subButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton addButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton mulButton;
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	JButton divButton;
	JButton clearButton;
	JButton deleteButton;
	String oldvalue;
	String operator;
	String currentText;
	JButton rootButton;
	JButton squareButton;
	JButton modButton;
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500, 800);
		jf.setLocation(600, 50);
		jf.getContentPane().setBackground(Color.orange);
		
		displayJLabel=new JLabel("");
		displayJLabel.setFont(new Font("arial", Font.PLAIN, 30) );
		displayJLabel.setBounds(30, 50, 440, 40);
		displayJLabel.setBackground(Color.white);
		displayJLabel.setOpaque(true);
		displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayJLabel.setForeground(Color.black);
		

		jf.add(displayJLabel);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,230,75,75);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		oneButton.setBackground(Color.black);
		oneButton.setForeground(Color.white);
		oneButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		twoButton=new JButton("2");
		twoButton.setBounds(130,230,75,75);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		twoButton.setBackground(Color.black);
		twoButton.setForeground(Color.white);
		twoButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		threeButton=new JButton("3");
		threeButton.setBounds(230,230,75,75);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		threeButton.setBackground(Color.black);
		threeButton.setForeground(Color.white);
		threeButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		subButton=new JButton("-");
		subButton.setBounds(365,130,75,75);
		subButton.addActionListener(this);
		jf.add(subButton);
		subButton.setBackground(Color.green);
		subButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,330,75,75);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		fourButton.setBackground(Color.black);
	    fourButton.setForeground(Color.white);
		fourButton.setFont(new Font("arial", Font.PLAIN, 30));
		
	    fiveButton=new JButton("5");
		fiveButton.setBounds(130,330,75,75);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		fiveButton.setBackground(Color.black);
		fiveButton.setForeground(Color.white);
		fiveButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,330,75,75);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		sixButton.setBackground(Color.black);
		sixButton.setForeground(Color.white);
		sixButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		addButton=new JButton("+");
		addButton.setBounds(365,230,75,75);
		addButton.addActionListener(this);
		jf.add(addButton);
		addButton.setBackground(Color.green);
		addButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,430,75,75);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		sevenButton.setBackground(Color.black);
		sevenButton.setForeground(Color.white);
		sevenButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,430,75,75);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		eightButton.setBackground(Color.black);
		eightButton.setForeground(Color.white);
		eightButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		nineButton=new JButton("9");
		nineButton.setBounds(230,430,75,75);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		nineButton.setBackground(Color.black);
		nineButton.setForeground(Color.white);
		nineButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		mulButton=new JButton("*");
		mulButton.setBounds(365,330,75,75);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		mulButton.setBackground(Color.green);
		mulButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		rootButton=new JButton("√");
		rootButton.setBounds(30,530,75,75);
		rootButton.addActionListener(this);
		jf.add(rootButton);
		rootButton.setFont(new Font("arial", Font.PLAIN, 30));
		rootButton.setBackground(Color.green);
		
		dotButton=new JButton(".");
		dotButton.setBounds(130,530,75,75);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		dotButton.setBackground(Color.green);
		dotButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		squareButton=new JButton("x²");
		squareButton.setBounds(230,530,75,75);
		squareButton.addActionListener(this);
		jf.add(squareButton);
		squareButton.setBackground(Color.green);
		squareButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		divButton=new JButton("/");
		divButton.setBounds(365,430,75,75);
		divButton.addActionListener(this);
		jf.add(divButton);
		divButton.setBackground(Color.green);
		divButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		clearButton=new JButton("C");
		clearButton.setBounds(230,130,75,75);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		clearButton.setBackground(Color.RED);
		clearButton.setForeground(Color.white);
		clearButton.setFont(new Font("arial", Font.PLAIN, 20));
		
		deleteButton=new JButton("DEL");
		deleteButton.setBounds(130,130,75,75);
		deleteButton.addActionListener(this);
		jf.add(deleteButton);
		deleteButton.setBackground(Color.RED);
		deleteButton.setForeground(Color.white);
		deleteButton.setFont(new Font("arial", Font.PLAIN, 20));
		
		modButton=new JButton("%");
		modButton.setBounds(230,630,75,75);
		modButton.addActionListener(this);
		jf.add(modButton);
		modButton.setBackground(Color.green);
		modButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		equalButton=new JButton("=");
		equalButton.setBounds(30,630,175,75);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		equalButton.setBackground(Color.black);
		equalButton.setForeground(Color.white);
		equalButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(365,530,75,175);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		zeroButton.setBackground(Color.black);
		zeroButton.setForeground(Color.white);
		zeroButton.setFont(new Font("arial", Font.PLAIN, 30));
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculator();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== oneButton) {	
			
			if(isOperatorClicked) {
				displayJLabel.setText("1");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"1");
			}
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("2");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"2");
			}
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("3");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"3");
			}
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("4");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"4");
			}
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("5");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"5");
			}
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("6");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"6");
			}
		}else if(e.getSource()== sevenButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("7");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"7");
			}
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("8");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"8");
			}
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("9");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"9");
			}
		}else if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				displayJLabel.setText("0");
				isOperatorClicked=false;
			}else {
			displayJLabel.setText(displayJLabel.getText()+"0");
			}
		}else if(e.getSource()== dotButton) {
			displayJLabel.setText(displayJLabel.getText()+".");
			
		}else if(e.getSource()== mulButton) { 
			isOperatorClicked=true;
			oldvalue=displayJLabel.getText();
			operator="*";
			
		}else if(e.getSource()== addButton) {
			
			isOperatorClicked=true;
			oldvalue=displayJLabel.getText();
			operator="+";
		}else if(e.getSource()== equalButton) {
			
			if(operator.equals("+")) {
			
			float newValue=Float.parseFloat(displayJLabel.getText());
			float result= Float.parseFloat(oldvalue)+newValue;
			displayJLabel.setText(result+"");
			
			}else if(operator.equals("*")) {
				float newValue=Float.parseFloat(displayJLabel.getText());
				float result= Float.parseFloat(oldvalue)*newValue;
				displayJLabel.setText(result+"");
			}else if(operator.equals("-")) {
				float newValue=Float.parseFloat(displayJLabel.getText());
				float result= Float.parseFloat(oldvalue)-newValue;
				displayJLabel.setText(result+"");
			}else if(operator.equals("/")) {
				float newValue=Float.parseFloat(displayJLabel.getText());
				float result= Float.parseFloat(oldvalue)/newValue;
				displayJLabel.setText(result+"");
			}else {
				displayJLabel.setText("Error");
			}
		}else if(e.getSource()== subButton) {
			isOperatorClicked=true;
			oldvalue=displayJLabel.getText();
			operator="-";
			
		}else if(e.getSource()== divButton) {
			isOperatorClicked=true;
			oldvalue=displayJLabel.getText();
			operator="/";
			
		}else if(e.getSource()==clearButton) {
			displayJLabel.setText("");
			
		}else if(e.getSource()==rootButton)	{
			
			 try {
	                double currentValue = Double.parseDouble(displayJLabel.getText());
	                double sqrtValue = Math.sqrt(currentValue);
	                displayJLabel.setText(String.valueOf(sqrtValue));
	            } catch (NumberFormatException ex) {
	                displayJLabel.setText("Error");
	            }
			 
		}else if(e.getSource()==deleteButton) {
			String currentText= displayJLabel.getText();
			if(!currentText.isEmpty()) {
				displayJLabel.setText(currentText.substring(0, currentText.length()-1));
			}
		
		}else if (e.getSource() == squareButton) {
		    try {
		        double currentValue = Double.parseDouble(displayJLabel.getText());
		        double squareValue = currentValue * currentValue;
		        displayJLabel.setText(String.valueOf(squareValue));
		    } catch (NumberFormatException ex) {
		        displayJLabel.setText("Error");
		    }
		    
		}else if (e.getSource() == modButton) {
		    try {
		        double currentValue = Double.parseDouble(displayJLabel.getText());
		        double modValue = currentValue % 2;  
		        displayJLabel.setText(String.valueOf(modValue));
		    } catch (NumberFormatException ex) {
		        displayJLabel.setText("Error");
		    }
		}

		
	}

}
