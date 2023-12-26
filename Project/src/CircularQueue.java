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

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cqSize;
	private JTextField element;
	private JTextField displayBox;
	private int cq[];
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(212, 10, 259, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER CIRCULARQUEUE  SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 57, 215, 18);
		contentPane.add(lblNewLabel_1);
		
		cqSize = new JTextField();
		cqSize.setBounds(263, 55, 96, 19);
		contentPane.add(cqSize);
		cqSize.setColumns(10);
		
		JButton create = new JButton("CREATE CIRCULAR QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Circular queue creation
				int size=Integer.valueOf(cqSize.getText());
				 cq=new int[size];	
				 String message="Circular queue of size "+size+" created ";
				 JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(263, 111, 235, 35);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(90, 173, 143, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(263, 171, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert code
				int elem;
				int size=Integer.valueOf(cqSize.getText());
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible !");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					String message="Element inserted at position "+r+" is "+cq[r];
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
				
			}
		});
		insert.setForeground(new Color(0, 0, 255));
		insert.setBackground(new Color(255, 255, 255));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(401, 170, 113, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete code
				int size=Integer.valueOf(cqSize.getText());
				if(count==0)     //Cq is empty
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible !");
				}
				else
				{
					String message="Elemet deleted at position "+f+" is "+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(0, 0, 255));
		delete.setBackground(new Color(255, 255, 255));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(260, 244, 99, 35);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				int size=Integer.valueOf(cqSize.getText());
				if(count==0)    //cq is empty
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible !");
				}
				else
				{
					String msg="";
					for(int i=1;i<=count;i++)
					{
						msg=msg+" "+cq[f];
						f=(f+1)%size;
					}
					displayBox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setBounds(263, 314, 99, 35);
		contentPane.add(display);
		
		displayBox = new JTextField();
		displayBox.setBounds(90, 384, 483, 19);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
	}

}
