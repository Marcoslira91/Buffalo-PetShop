package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroPet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPet frame = new TelaCadastroPet();
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
	public TelaCadastroPet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(359, 11, 75, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preencha abaixo com as informações solicitadas:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 310, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroCliente tela= new TelaCadastroCliente();
				tela.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Concluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaMenu tela= new TelaMenu();
				tela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(10, 70, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 124, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 178, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(157, 70, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(157, 124, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(10, 57, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raça:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(10, 164, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(157, 57, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ano de nascimento:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(151, 111, 111, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(354, 73, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(325, 107, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
		rdbtnNewRadioButton_1.setBounds(325, 144, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_2 = new JButton("Salvar e cadastrar\r\n mais um");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroPet tela= new TelaCadastroPet();
				tela.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(121, 227, 199, 23);
		contentPane.add(btnNewButton_2);
	}

}
