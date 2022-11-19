package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroGeral frame = new TelaCadastroGeral();
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
	public TelaCadastroGeral() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(360, 0, 74, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bem-vindo a tela de cadastro! ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 11, 241, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quem você deseja cadastrar hoje?");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(99, 64, 253, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroCliente tela= new TelaCadastroCliente();
				tela.setVisible(true);
			}
		});
		btnNewButton.setBounds(162, 113, 103, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Veterinário");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroVet tela= new TelaCadastroVet();
				tela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(162, 147, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaMenu tela= new TelaMenu();
				tela.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
