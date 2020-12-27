package ArithmaticFunction;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArithmaticFunction {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArithmaticFunction window = new ArithmaticFunction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ArithmaticFunction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 857, 496);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(35, 92, 387, 73);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(432, 92, 387, 73);
		frame.getContentPane().add(textFieldNum2);
		
		
		JButton btnNewButton = new JButton("Add(+)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e ) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(150, 237, 199, 73);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnMinus = new JButton("Minus(-)");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans=0;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e ) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnMinus.setBounds(536, 237, 199, 73);
		frame.getContentPane().add(btnMinus);
		
		JButton btnDevide = new JButton("Devide(\u00F7)");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1, num2, ans=0;
				try {
					num1 = Double.parseDouble(textFieldNum1.getText());
					num2 = Double.parseDouble(textFieldNum2.getText());
					
					ans = num1 / num2;
					textFieldAns.setText(Double.toString(ans));
				}catch(Exception e ) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnDevide.setBounds(536, 359, 199, 73);
		frame.getContentPane().add(btnDevide);
		
		JButton btnMultiple = new JButton("Multiply(\u00D7)");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans=0;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e ) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnMultiple.setBounds(150, 359, 199, 73);
		frame.getContentPane().add(btnMultiple);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(359, 325, 167, 64);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(410, 295, 135, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(164, 43, 97, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Num2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(606, 43, 97, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
	}
}
