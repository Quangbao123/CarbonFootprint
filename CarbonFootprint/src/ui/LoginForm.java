package ui;

import javax.swing.JFrame;

public class LoginForm extends JFrame {
	public LoginForm(String title) {
		this.setTitle(title);
	}
	public void showLoginForm() {
		this.setVisible(true);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
