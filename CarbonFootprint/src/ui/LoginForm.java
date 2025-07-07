/*
 *	Nguyen Quang Bao
 */
package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	
	// constructor
	public LoginForm(String title) {
		this.setTitle(title);
		addUI();
	}
	
	// UI functions
	private void addUI() {
		
		// Create a container
		Container con = getContentPane();
		JPanel mainPanel = new JPanel();
		
		// Divide into 2 parts left and right
		mainPanel.setLayout(new GridLayout(1, 2));
		con.add(mainPanel);

		// Green is the main color.
		Color greenTheme = new Color(76, 175, 80);

		// Left Panel - Welcome Back (Login)
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(greenTheme);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.setBorder(BorderFactory.createEmptyBorder(80, 40, 80, 40));

		JLabel welcomeLabel = new JLabel("Welcome Back!");
		welcomeLabel.setForeground(Color.WHITE);
		welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
		welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		JLabel descLabel = new JLabel("<html><div style='text-align: center;'>To keep connected with us<br>please login with your personal info</div></html>");
		descLabel.setForeground(Color.WHITE);
		descLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
		descLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		JButton signInBtn = new JButton("SIGN IN");
		signInBtn.setFocusPainted(false);
		signInBtn.setBackground(Color.WHITE);
		signInBtn.setForeground(greenTheme);
		signInBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
		signInBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		signInBtn.setMaximumSize(new Dimension(200, 40));

		leftPanel.add(Box.createVerticalGlue());
		leftPanel.add(welcomeLabel);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
		leftPanel.add(descLabel);
		leftPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		leftPanel.add(signInBtn);
		leftPanel.add(Box.createVerticalGlue());

		// Right Panel - Create Account
		JPanel rightPanel = new JPanel();
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.setBackground(Color.WHITE);
		rightPanel.setBorder(BorderFactory.createEmptyBorder(50, 40, 50, 40));

		JLabel createLabel = new JLabel("Create Account");
		createLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
		createLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

		JTextField nameField = new JTextField();
		nameField.setMaximumSize(new Dimension(300, 35));
		nameField.setBorder(BorderFactory.createTitledBorder("Name"));

		JTextField emailField = new JTextField();
		emailField.setMaximumSize(new Dimension(300, 35));
		emailField.setBorder(BorderFactory.createTitledBorder("Email"));

		JPasswordField passwordField = new JPasswordField();
		passwordField.setMaximumSize(new Dimension(300, 35));
		passwordField.setBorder(BorderFactory.createTitledBorder("Password"));

		JButton signUpBtn = new JButton("SIGN UP");
		signUpBtn.setFocusPainted(false);
		signUpBtn.setBackground(greenTheme);
		signUpBtn.setForeground(Color.WHITE);
		signUpBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
		signUpBtn.setMaximumSize(new Dimension(300, 40));
		signUpBtn.setAlignmentX(Component.CENTER_ALIGNMENT);

		rightPanel.add(createLabel);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		rightPanel.add(nameField);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		rightPanel.add(emailField);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		rightPanel.add(passwordField);
		rightPanel.add(Box.createRigidArea(new Dimension(0, 30)));
		rightPanel.add(signUpBtn);

		// Add 2 panels into mainPanel
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);

	}
	
	// Form display function
	public void showLoginForm() {
		this.setVisible(true);
		this.setSize(800, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
