package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;



public class loginPage {
	
	private JFrame frame;
	private JTextField txtName;
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage window = new loginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public loginPage() {
		initialize();
	}
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 900, 650);
		frame.setLocationRelativeTo(null);
		
		frame.getContentPane().setLayout(null);
		
		JPanel idPanelLeft = new JPanel();
		idPanelLeft.setBounds(505, 295, 10, 64);
		idPanelLeft.setBackground(new Color(123, 104, 238));
		frame.getContentPane().add(idPanelLeft);
		
		JLabel leftPanel = new JLabel("New label");
		leftPanel.setIcon(new ImageIcon(loginPage.class.getResource("/images/leftPanel.jpg")));
		leftPanel.setBounds(0, 0, 450, 650);
		
		frame.getContentPane().add(leftPanel);
		
		JLabel closeIcon = new JLabel("New label");
		closeIcon.setBounds(836, 0, 64, 64);
		closeIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		closeIcon.setIcon(new ImageIcon(loginPage.class.getResource("/images/closeIcon.png")));
		frame.getContentPane().add(closeIcon);
		
		JPanel idPanel = new JPanel();
		idPanel.setBounds(505, 295, 325, 64);
		idPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		idPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(idPanel);
		idPanel.setLayout(null);
		
		JLabel askID = new JLabel("User");
		askID.setBounds(32, 13, 94, 16);
		askID.setForeground(new Color(211, 211, 211));
		askID.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		idPanel.add(askID);
		
		txtName = new JTextField();
		txtName.setBorder(null);
		txtName.setBounds(32, 29, 158, 25);
		txtName.setFont(new Font("Gill Sans MT", Font.PLAIN, 18));
		txtName.setForeground(Color.DARK_GRAY);
		idPanel.add(txtName);
		txtName.setColumns(10);
		
		JPanel passPanel = new JPanel();
		passPanel.setBounds(505, 357, 325, 64);
		passPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		passPanel.setBackground(Color.WHITE);
		frame.getContentPane().add(passPanel);
		passPanel.setLayout(null);
		
		JLabel askPass = new JLabel("Password");
		askPass.setForeground(new Color(211, 211, 211));
		askPass.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
		askPass.setBounds(32, 13, 94, 16);
		passPanel.add(askPass);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setDisabledTextColor(Color.DARK_GRAY);
		passwordField.setBounds(32, 29, 158, 22);
		passPanel.add(passwordField);
		
		JLabel hosGeldinLabel = new JLabel("HOS GELDINIZ 4300");
		hosGeldinLabel.setFont(new Font("Bell MT", Font.PLAIN, 45));
		hosGeldinLabel.setForeground(new Color(0, 206, 209));
		hosGeldinLabel.setBounds(472, 203, 383, 56);
		frame.getContentPane().add(hosGeldinLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 128));
		separator.setBounds(462, 203, 383, 43);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(575, 447, 189, 49);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel loginlable = new JLabel("     Login\u015F Do");
		loginlable.addMouseListener(new MouseAdapter() {
			@SuppressWarnings({ "deprecation", "static-access" })
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtName.getText().equals("devendra1")&&passwordField.getText().equals("pass")) {
					shipping framex = new shipping();
					framex.getFrame().setVisible(true);
					frame.dispose();
				}
				else if(txtName.getText().equals("devendra2")&&passwordField.getText().equals("123")) {
					shipping framex = new shipping();
					framex.getFrame().setVisible(true);
					frame.dispose();
				}
				else if (txtName.getText().equals("") || passwordField.getText().equals("")) {
					JOptionPane sc = new JOptionPane();
					sc.showMessageDialog(frame, "Username and Password Field is empty","Warning",JOptionPane.ERROR_MESSAGE);
				}
				else {	
					JOptionPane sc = new JOptionPane();
					sc.showMessageDialog(frame, "Username and Password not match","Warning",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		loginlable.setForeground(new Color(255, 255, 255));
		loginlable.setFont(new Font("Gill Sans MT", Font.PLAIN, 30));
		loginlable.setBounds(0, 0, 189, 49);
		panel.add(loginlable);
		
		JLabel logoLabel = new JLabel("New label");
		logoLabel.setIcon(new ImageIcon(loginPage.class.getResource("/images/logo.png")));
		logoLabel.setBounds(512, 30, 300, 171);
		frame.getContentPane().add(logoLabel);
	}
}