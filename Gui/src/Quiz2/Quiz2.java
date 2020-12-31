package Quiz2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

public class Quiz2 {

	private JFrame frmWaterCalculator;
	private JTextField textFieldweight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
					window.frmWaterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaterCalculator = new JFrame();
		frmWaterCalculator.setForeground(new Color(0, 255, 255));
		frmWaterCalculator.setFont(new Font("Dialog", Font.BOLD, 14));
		frmWaterCalculator.setTitle("Water Calculator");
		frmWaterCalculator.setBounds(100, 100, 611, 376);
		frmWaterCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWaterCalculator.getContentPane().setLayout(null);
		
		JLabel lblHowMuchWater = new JLabel("How much water should I drink?");
		lblHowMuchWater.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblHowMuchWater.setBounds(115, 49, 421, 31);
		frmWaterCalculator.getContentPane().add(lblHowMuchWater);
		
		JLabel lblNewLabel = new JLabel("My weight (kg):");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(115, 90, 179, 56);
		frmWaterCalculator.getContentPane().add(lblNewLabel);
		
		textFieldweight = new JTextField();
		textFieldweight.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldweight.setFont(new Font("Times New Roman", Font.BOLD, 25));
		textFieldweight.setBounds(256, 88, 172, 56);
		frmWaterCalculator.getContentPane().add(textFieldweight);
		textFieldweight.setColumns(10);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.setBackground(SystemColor.activeCaption);
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int weight;
				double water;
				
				try {
					weight=Integer.parseInt(textFieldweight.getText());
					
					water= weight * 0.033;
					
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + " L of water a day!");
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnTellMe.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnTellMe.setBounds(192, 186, 179, 46);
		frmWaterCalculator.getContentPane().add(btnTellMe);
	}
}
