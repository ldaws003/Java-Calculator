import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class helloworldsclass {

	private JFrame frame;
	private JTextField textField;
	private static String operation;
	private static double num1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helloworldsclass window = new helloworldsclass();
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
	public helloworldsclass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					operation = "addition";
					textField.setText("");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		button.setBounds(370, 91, 54, 23);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(96, 27, 237, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					operation = "subtract";
					textField.setText("");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		button_1.setBounds(370, 125, 54, 23);
		frame.getContentPane().add(button_1);
		
		JButton btnNewButton = new JButton("\u00F7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					operation = "divide";
					textField.setText("");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		btnNewButton.setBounds(370, 159, 54, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_2 = new JButton("\u00D7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					operation = "multiply";
					textField.setText("");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		button_2.setBounds(370, 193, 54, 23);
		frame.getContentPane().add(button_2);
		
		JButton btnNewButton_1 = new JButton("cosine");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP);
					ans = java.lang.Math.cos(num1);
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		btnNewButton_1.setBounds(10, 91, 81, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSine = new JButton("sine");
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP); 
					ans = java.lang.Math.sin(num1);
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		btnSine.setBounds(10, 125, 81, 23);
		frame.getContentPane().add(btnSine);
		
		JButton btnTangent = new JButton("tangent");
		btnTangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP);
					ans = java.lang.Math.tan(num1);
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}				
		});
		btnTangent.setBounds(10, 159, 81, 23);
		frame.getContentPane().add(btnTangent);
		
		JButton button_3 = new JButton("%");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DecimalFormat df = new DecimalFormat("#.###");
				double num1, ans;
				
				try {
					num1 = Double.parseDouble(textField.getText());
					ans = num1 / 100;
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
				
			}
		});
		button_3.setBounds(370, 227, 54, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u221A(\u00D7)");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP);
					if (num1 < 0) {
						JOptionPane.showMessageDialog(null, "Can't show imaginary numbers.");
					} else {
						ans = java.lang.Math.sqrt(num1);
						textField.setText(df.format(ans));
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}	
			}
		});
		button_4.setBounds(10, 193, 81, 23);
		frame.getContentPane().add(button_4);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP);
					ans = java.lang.Math.pow(num1, 2);
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		btnX.setBounds(10, 227, 81, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnLnx = new JButton("ln(x)");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP);
					ans = java.lang.Math.log(num1);
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		btnLnx.setBounds(101, 91, 81, 23);
		frame.getContentPane().add(btnLnx);
		
		JButton btnNewButton_2 = new JButton("e^x");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                DecimalFormat df = new DecimalFormat("#.###");
				
				double num1, ans;
				try {
					num1 = Double.parseDouble(textField.getText());
					df.setRoundingMode(RoundingMode.HALF_UP);
					ans = java.lang.Math.exp(num1);
					textField.setText(df.format(ans));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter a Valid Number.");
				}
			}
		});
		btnNewButton_2.setBounds(101, 124, 81, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DecimalFormat df = new DecimalFormat("#.###");
				df.setRoundingMode(RoundingMode.HALF_UP);
				
				double num2, ans;
				try {
					switch(operation) {
					case "addition":
						try {
							num2 = Double.parseDouble(textField.getText());
							ans = num1 + num2;
							textField.setText(df.format(ans));
							operation = "";
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
						}
						break;
						
					case "subtract":
						try {
							num2 = Double.parseDouble(textField.getText());
							ans = num1 - num2;
							textField.setText(df.format(ans));
							operation = "";
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
						}
						break;
						
					case "divide":
						try {
							num2 = Double.parseDouble(textField.getText());
							if(num2 == 0) {
								JOptionPane.showMessageDialog(null, "Cannot Divide by Zero");
							} else {
								ans = num1 / num2;
								textField.setText(df.format(ans));
								operation = "";
							}
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
						}
						break;
						
					case "multiply":
						try {
							num2 = Double.parseDouble(textField.getText());
							ans = num1 * num2;
							textField.setText(df.format(ans));
							operation = "";
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
						}
					}
					
				} catch (Exception e){
					JOptionPane.showMessageDialog(null, "Please Choose an Operation");				
				}
			}
		});
		btnNewButton_3.setBounds(274, 227, 74, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}