package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.TextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
public class MainList extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainList frame = new MainList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 274, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 258, 538);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(87, 10, 74, 21);
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField.setText("\uC6B0\uB9AC\uCC57\uC811\uC18D");
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\uC628\uB77C\uC778:");
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(12, 46, 53, 21);
		panel.add(textField_1);
		
		JList listOnMember = new JList();
		listOnMember.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listOnMember.setBounds(22, 77, 213, 174);
		panel.add(listOnMember);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC624\uD504\uB77C\uC778:");
		textField_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(12, 259, 67, 21);
		panel.add(textField_2);
		
		JList listOffMember = new JList();
		listOffMember.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listOffMember.setBounds(22, 290, 213, 174);
		panel.add(listOffMember);
		
		JButton btnNewButton = new JButton("\uCC44 \uD305");
		btnNewButton.setBounds(22, 505, 97, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("\uCC44 \uD305 \uBC29");
		button.setBounds(138, 505, 97, 23);
		panel.add(button);
	}
}