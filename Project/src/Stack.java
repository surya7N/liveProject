import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField stackSize;
	private JTextField element;
	private JTextField displayBox;
	private int s[];
	private int top=-1;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 451);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(221, 10, 176, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER STACK SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(104, 48, 139, 18);
		contentPane.add(lblNewLabel_1);
		
		stackSize = new JTextField();
		stackSize.setBounds(253, 46, 96, 19);
		contentPane.add(stackSize);
		stackSize.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation 
				int size=Integer.valueOf(stackSize.getText());
				s=new int [size];
				String message="Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(252, 87, 145, 35);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(81, 149, 162, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(253, 147, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				int size=Integer.valueOf(stackSize.getText());
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "push not possible...");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					top++;                                     //inserting in FILO (first in last out order)(first inserted element deleted last)
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "push Successful !");
					element.setText("");
				}
			}
		});
		push.setForeground(Color.BLUE);
		push.setBackground(Color.WHITE);
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(393, 140, 96, 27);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code
			  if(top==-1)
			  {
				  JOptionPane.showMessageDialog(contentPane,"Delete not possible");
			  }
			  else
			  {
				  String message="Element deleted at position "+top+" is "+s[top];
				  JOptionPane.showMessageDialog(contentPane, message);
				  top--;
				  pop.setText("");
			  }
			}
		});
		pop.setForeground(Color.BLUE);
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(253, 225, 85, 35);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible !");
				}
				else	
				{	
				 String msg="";

					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+s[top];
					}
					displayBox.setText(msg);
				}
			
			}
		});
		display.setForeground(Color.BLUE);
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(253, 294, 106, 41);
		contentPane.add(display);
		
		displayBox = new JTextField();
		displayBox.setBounds(104, 369, 409, 19);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
	}
}
