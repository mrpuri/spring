package com.harman;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewFrame extends JFrame implements ActionListener{
	JTextField tfUsername, tfPassword, tfAge, tfNumber, tfEmail, tfAddress;
	private String email, password, address, name;
	private int age;
	private Float number;
	ViewFrame( newUser Userinfo)
	{
		this.email= Userinfo.getEmail();
		this.password= Userinfo.getPassword();
		this.name= Userinfo.getName();
		this.age= Userinfo.getAge();
		this.number= Userinfo.getNumber();
		this.address= Userinfo.getAddress();
		setLayout(new FlowLayout());
		JLabel lUsername = new JLabel("name");
		JLabel lemail = new JLabel("email");
		JLabel lPassword = new JLabel("password");
		
		JLabel laddress = new JLabel("address");
		JLabel lage = new JLabel("age");
		JLabel lnumber = new JLabel("number");
		tfUsername = new JTextField(name);
		tfPassword  = new JTextField(password);
		tfAge = new JTextField(String.valueOf(age));
		tfNumber = new JTextField(number.toString());
		tfEmail = new JTextField(email);
		tfAddress = new JTextField(address);
		add(lUsername);
		add(tfUsername);
		add(lemail);
		add(tfEmail);
		add(lPassword);
		add(tfPassword);
		add(lage);
		add(tfAge);
		add(laddress);
		add(tfAddress);
		add(lnumber);
		add(tfNumber);
		setSize(300,500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
