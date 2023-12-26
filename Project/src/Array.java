import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel Array = new JLabel("ARRAY DATASTRUCTURE");
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField delPosition;
	private JTextField displayBox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 427);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		Array.setBounds(204, 10, 189, 27);
		Array.setFont(new Font("Constantia", Font.BOLD, 15));
		contentPane.add(Array);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(396, 19, 0, 0);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER ARRAY LENGTH");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(64, 83, 162, 18);
		contentPane.add(lblNewLabel_2);
		
		length = new JTextField();
		length.setBounds(245, 81, 122, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton Createarray = new JButton("CREATE ARRAY");
		Createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO CREATE ARRAY
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" created";
                JOptionPane.showMessageDialog(contentPane, message);				
				
				
			}
		});
		Createarray.setFont(new Font("Constantia", Font.BOLD, 13));
		Createarray.setBounds(245, 128, 138, 37);
		contentPane.add(Createarray);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(22, 190, 225, 18);
		contentPane.add(lblNewLabel_3);
		
		element = new JTextField();
		element.setBounds(245, 188, 102, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_4.setBounds(350, 190, 96, 18);
		contentPane.add(lblNewLabel_4);
		
		position = new JTextField();
		position.setBounds(423, 188, 79, 19);
		contentPane.add(position);
		position.setColumns(10);
		
		JButton delete = new JButton("INSERT");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO INSERT 
				int pos=Integer.valueOf(position.getText());
				if(pos>=arr.length)
				{
					String message="Insertion not possible at "+pos+" !";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else
				{
				int elem=Integer.valueOf(element.getText());
				arr[pos]=elem;
				String message="Element inserted at position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				position.setText("");
				}
			}
		});
		delete.setForeground(new Color(0, 0, 255));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(509, 181, 102, 37);
		contentPane.add(delete);
		
		JLabel lblNewLabel_5 = new JLabel("ENTER POSITION TO DELETE ");
		lblNewLabel_5.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_5.setBounds(22, 257, 226, 47);
		contentPane.add(lblNewLabel_5);
		
		delPosition = new JTextField();
		delPosition.setBounds(245, 266, 96, 25);
		contentPane.add(delPosition);
		delPosition.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE TO DELETE
			int pos=Integer.valueOf(delPosition.getText());
			if(pos>=arr.length)
			{
				String message="Deletion not possible at "+pos+" !";

				JOptionPane.showMessageDialog(contentPane,message);
			}
			arr[pos]=0;
			String message="Element deleted at position "+pos;
			JOptionPane.showMessageDialog(contentPane,message );
			delPosition.setText("");
			
				
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(348, 266, 98, 27);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DISPLAY");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE To DISPLAY
			String msg="";
			for(int i=0;i<=arr.length-1;i++)
			{
				msg=msg+" "+arr[i];
			}
			displayBox.setText(msg);
			}
		});
		btnNewButton_3.setForeground(new Color(128, 0, 0));
		btnNewButton_3.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_3.setBounds(247, 314, 102, 27);
		contentPane.add(btnNewButton_3);
		
		displayBox = new JTextField();
		displayBox.setForeground(Color.GREEN);
		displayBox.setBounds(94, 361, 486, 19);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
	}
}
