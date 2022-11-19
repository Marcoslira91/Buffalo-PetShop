package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(360, 11, 74, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel_1.setBounds(174, 45, 86, 22);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(174, 108, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 162, 86, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(173, 93, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaMenu tela= new TelaMenu();
				tela.setVisible(true);
			}
			
			
			
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicosGeral tela= new TelaServicosGeral();
				tela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_3.setBounds(204, 128, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(173, 148, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bem-vindo(a)!");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 17, 148, 14);
		contentPane.add(lblNewLabel_5);
	}
}
