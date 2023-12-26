import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;

public class HomeDSUsingSwings extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int s[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDSUsingSwings frame = new HomeDSUsingSwings();
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
	public HomeDSUsingSwings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 369);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(189, 10, 224, 20);
		contentPane.add(lblNewLabel);
		
		Component glue = Box.createGlue();
		glue.setBounds(303, 104, 1, 1);
		contentPane.add(glue);
		
		JButton Stack = new JButton("STACK");
		Stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//STACK window opening CODE
				Stack s=new Stack();
				s.setVisible(true);
				
				
			}
		});
		Stack.setForeground(Color.RED);
		Stack.setFont(new Font("Constantia", Font.BOLD, 14));
		Stack.setBounds(55, 134, 97, 35);
		contentPane.add(Stack);
		
		JButton Queue = new JButton("QUEUE");
		Queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//QUEUE window opening code CODE
				Queue queue = new Queue();
				queue.setVisible(true);
			}
		});
		Queue.setForeground(Color.MAGENTA);
		Queue.setFont(new Font("Constantia", Font.BOLD, 14));
		Queue.setBounds(403, 134, 97, 35);
		contentPane.add(Queue);
		
		JButton CQueue = new JButton("CIRCULAR QUEUE");
		CQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CIRCULAR QUEUE  window opening CODE
				CircularQueue circularQueue = new CircularQueue();
				circularQueue.setVisible(true);
			}
		});
		CQueue.setForeground(Color.BLUE);
		CQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		CQueue.setBounds(204, 244, 177, 33);
		contentPane.add(CQueue);
		
		JButton Array = new JButton("ARRAY");
		Array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Array a=new Array();
				a.setVisible(true);
			}
		});
		Array.setFont(new Font("Constantia", Font.BOLD, 14));
		Array.setBounds(236, 34, 105, 35);
		contentPane.add(Array);
	}
}
