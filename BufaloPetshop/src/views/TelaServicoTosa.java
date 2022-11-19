package views;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaServicoTosa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaServicoTosa frame = new TelaServicoTosa();
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
	public TelaServicoTosa() {
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
		
		JLabel lblNewLabel_1 = new JLabel(" Serviço selecionado: ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 13, 156, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Voltar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicosGeral tela= new TelaServicosGeral();
				tela.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Tosa");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(169, 19, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(156, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Digite o ID do seu pet:");
		lblNewLabel_2.setBounds(10, 63, 136, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(252, 60, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("informações do pet");
		lblNewLabel_4.setBounds(57, 92, 158, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição:");
		lblNewLabel_5.setBounds(206, 143, 69, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(216, 164, 208, 45);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Concluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicoDecisao tela= new TelaServicoDecisao();
				tela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
