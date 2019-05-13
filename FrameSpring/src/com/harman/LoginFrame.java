package com.harman;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harman.UserTemplate;

public class LoginFrame extends JFrame implements ActionListener{

	JTextField tfUsername, tfPassword;
	JButton buttonLogin, buttonRegister;
	
	LoginFrame()
	{
		setLayout(new FlowLayout());
		JLabel lUsername = new JLabel("Username");
		JLabel lPassword = new JLabel("Password");
		tfUsername = new JTextField(20);
		tfPassword = new JTextField(20);
		buttonLogin = new JButton("Login");
		buttonRegister = new JButton("Register");
		buttonLogin.addActionListener(this);
		buttonRegister.addActionListener(this);
		add(lUsername);
		add(tfUsername);
		add(lPassword);
		add(tfPassword);
		add(buttonLogin);
		add(buttonRegister);
		
		setSize(300,500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == buttonLogin)
		{
			  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		      UserTemplate ud = (UserTemplate)context.getBean("userDAO");
		      String email = tfUsername.getText();
		      String password = tfPassword.getText();
		      System.out.println("LoginFrame, email: " + email + "\tpass: " + password);
				
		       User u = ud.getUser(email,password);
		      WelcomeFrame welcome = new WelcomeFrame(u);
		      
		}
		else if(ae.getSource() == buttonRegister)
		{
				// new RegisterFrame();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginFrame();
	}
	

}
