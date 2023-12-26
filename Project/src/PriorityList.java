import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;
import java.awt.event.ActionEvent;

public class PriorityList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField element;
	private JTextField displayBox;
	private JTextField countOfElements;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PriorityList frame = new PriorityList();
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
	public PriorityList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRIORITYLIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel.setBounds(185, 21, 243, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(100, 75, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton create = new JButton("CREATE PRIORITYLIST");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATION OF PRIORITY LIST
				PriorityQueue<Integer> priorityQ = new PriorityQueue<>();
				int count=Integer.valueOf(countOfElements.getText());
		    JOptionPane.showMessageDialog(contentPane, "Priority  List of length "+count+" is created");
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(185, 98, 198, 48);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER ELEMENT TO ADD");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 181, 178, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(232, 179, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertion code
				PriorityQueue<Integer> pq = new PriorityQueue<>();
				int count=Integer.valueOf(countOfElements.getText());
				int elem=Integer.valueOf(element.getText());
			/*	for(int i=0;i<=count-1;i++)
				{
				*/
				int i=1;
				while(i<=count)    //as long as i==count
				{
					try {
						pq.add(elem);
						element.setText("");
					} finally {
						
					}
					i++;	
				}
				JOptionPane.showMessageDialog(contentPane, "Element Added");

				
				
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(355, 178, 96, 33);
		contentPane.add(insert);
		
		JButton ALSize = new JButton("SIZE OF LINKEDLIST");
		ALSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//size of priority list
				PriorityQueue<Integer> pq = new PriorityQueue<>();
				int count=Integer.valueOf(countOfElements.getText());
				String message="Size of Priority list is "+count;
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		ALSize.setFont(new Font("Constantia", Font.BOLD, 14));
		ALSize.setBounds(185, 231, 184, 42);
		contentPane.add(ALSize);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(232, 333, 96, 33);
		contentPane.add(display);
		
		displayBox = new JTextField();
		displayBox.setBounds(89, 376, 450, 19);
		contentPane.add(displayBox);
		displayBox.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER COUNT OF ELEMENTS");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(16, 70, 206, 18);
		contentPane.add(lblNewLabel_3);
		
		countOfElements = new JTextField();
		countOfElements.setBounds(232, 68, 96, 19);
		contentPane.add(countOfElements);
		countOfElements.setColumns(10);
	}
}
