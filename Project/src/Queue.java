import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField queueSize;
	private JTextField insertElement;
	private JTextField displayBox;
	private int q[];
	private int r=-1;
	private int f=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE  DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(209, 10, 185, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(84, 54, 138, 18);
		contentPane.add(lblNewLabel_1);
		
		queueSize = new JTextField();
		queueSize.setBounds(232, 52, 96, 19);
		contentPane.add(queueSize);
		queueSize.setColumns(10);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue code
				int size=Integer.valueOf(queueSize.getText());
				q=new int [size];
				String message="Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(232, 100, 155, 33);
		contentPane.add(create);
		
		JLabel element = new JLabel("ENTER AN INTEGER ELEMENT");
		element.setFont(new Font("Constantia", Font.BOLD, 14));
		element.setBounds(21, 150, 273, 18);
		contentPane.add(element);
		
		insertElement = new JTextField();
		insertElement.setBounds(232, 148, 155, 19);
		contentPane.add(insertElement);
		insertElement.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code
				int elem;
				int size=Integer.valueOf(queueSize.getText());
			if(r==size-1)
			{
				JOptionPane.showMessageDialog(contentPane, "Insertion not possible !");
			}
			else
			{
				elem=Integer.valueOf(insertElement.getText());
				r++;
				q[r]=elem;
				String message="Element inserted at position "+r+" is "+q[r];
				JOptionPane.showMessageDialog(contentPane,  message);
				insertElement.setText("");
			}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(408, 140, 96, 33);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code
				if(r==-1 || f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else
				{
					String message=" Element deleted at position "+f+" is "+q[f];
					JOptionPane.showConfirmDialog(contentPane, message);
					f++;
					delete.setText("");
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(232, 223, 96, 33);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				if(r==-1|| f>r) 
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					String msg="";
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					displayBox.setText(msg);
				}
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(232, 299, 103, 33);
		contentPane.add(display);
		
		displayBox = new JTextField();
		displayBox.setBounds(84, 371, 492, 19);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
	}

}
