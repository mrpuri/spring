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

public class WelcomeFrame extends JFrame implements ActionListener{

	JTextField tfUsername;
	JButton  buttonRegister;
	private String email, password;
	WelcomeFrame( User u)
	{
		String name= u.getName();
		this.email=u.getEmail();
		this.password=u.getPassword();
		setLayout(new FlowLayout());
		JLabel lUsername = new JLabel("Welcome " + name );
		//tfUsername = new JTextField(20);
		
		buttonRegister = new JButton("View Details");
		buttonRegister.addActionListener(this);
		add(lUsername);
		//add(tfUsername);
	
		add(buttonRegister);
		
		setSize(300,500);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == buttonRegister)
		{
			  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		      newUserTemplate ud = (newUserTemplate)context.getBean("newuserDAO");
		      newUser data = ud.getUser(email,password);
		      ViewFrame vue= new ViewFrame(data);
		      
		      
		   
		}
	}
}