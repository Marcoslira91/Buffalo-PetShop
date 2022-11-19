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

public class TelaServicosGeral extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaServicosGeral frame = new TelaServicosGeral();
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
	public TelaServicosGeral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(355, 11, 69, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bem-vindo(a) ao setor de serviços!");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 13, 271, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Por favor, selecione uma das opções abaixo:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 38, 292, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Banho");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicoBanho tela= new TelaServicoBanho();
				tela.setVisible(true);
			}
		});
		btnNewButton.setBounds(149, 100, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tosa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicoTosa tela= new TelaServicoTosa();
				tela.setVisible(true);
			}
			
		});
		btnNewButton_1.setBounds(149, 144, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clínica");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicoClinica tela= new TelaServicoClinica();
				tela.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(149, 185, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLogin tela= new TelaLogin();
				tela.setVisible(true);
			}
			
		});
		btnNewButton_3.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
