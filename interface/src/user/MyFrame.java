package user;
import java.sql.*;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class MyFrame {

	private JFrame frmMyframe;
	private JTextField txtEnterName;
	private JLabel lblNewLabel;
	private JTextField txtEnterAddress;
	private JButton btnSubmit;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame window = new MyFrame();
					window.frmMyframe.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyFrame() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyframe = new JFrame();
		frmMyframe.setTitle("MyFrame");
		frmMyframe.setBounds(100, 100, 955, 606);
		frmMyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel lblName = new JLabel("name");
		frmMyframe.getContentPane().add(lblName);
		
		txtEnterName = new JTextField();
		txtEnterName.setText("Enter Name");
		txtEnterName.setHorizontalAlignment(SwingConstants.CENTER);
		frmMyframe.getContentPane().add(txtEnterName, BorderLayout.NORTH);
		txtEnterName.setColumns(10);
		
		lblNewLabel = new JLabel("record status");
		frmMyframe.getContentPane().add(lblNewLabel);
		
		txtEnterAddress = new JTextField();
		txtEnterAddress.setText("enter Address");
		frmMyframe.getContentPane().add(txtEnterAddress, BorderLayout.EAST);
		txtEnterAddress.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setAction(action);
		frmMyframe.getContentPane().add(btnSubmit, BorderLayout.SOUTH);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Connection con = null;
			try{  
				Class.forName("com.mysql.jdbc.Driver");
			  con =DriverManager.getConnection("jdbc:mysql://localhost/student","root","");

			PreparedStatement stmt=con.prepareStatement("insert into info values(?,?,?,?)");  
			stmt.setString(1,txtEnterName.getText());  
			stmt.setInt(2, 102);
			stmt.setInt(3, 90);
			stmt.setString(4, txtEnterAddress.getText());
			
			if(stmt.executeUpdate()!=0)
			{
				System.out.println("Record updated successfully");
				lblNewLabel.setText("Success");
			}
			else
			{
				System.out.println("unable to update record");
			}
			con.close();
		}
		catch(Exception a)
		{
			//System.out.println(e.getMessage());
			a.printStackTrace();
		}
		}
	}
}
