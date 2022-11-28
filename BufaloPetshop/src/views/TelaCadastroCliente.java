package views;
import java.sql.Connection;
import java.sql.DriverManager;
import factory.ConnectionFactory;  
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.xdevapi.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField jnome;
	private JTextField jcpf;
	private JTextField jtelefone;
	private JTextField jendereco;
	private JTextField jemail;
	private final ButtonGroup sexobuttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(360, 0, 74, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Preencha abaixo com as informações solicitadas:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 321, 25);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton masculinoradioButton = new JRadioButton("Masculino");
		sexobuttonGroup.add(masculinoradioButton);
		masculinoradioButton.setBounds(325, 107, 109, 23);
		contentPane.add(masculinoradioButton);
		
		JRadioButton femininoradioButton = new JRadioButton("Feminino");
		sexobuttonGroup.add(femininoradioButton);
		femininoradioButton.setBounds(325, 144, 109, 23);
		contentPane.add(femininoradioButton);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(354, 73, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroGeral tela= new TelaCadastroGeral();
				tela.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char sexo = '\0';
				if(masculinoradioButton.isSelected()) {
					sexo='M';
					String nome= jnome.getText();
					String cpf= jcpf.getText();
					String telefone= jtelefone.getText();
					String endereco= jendereco.getText();
					String email= jemail.getText();
					
					try {
						//trocar_nome_da_classe_pra_db
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Cliente(nome,cpf,email,telefone,endereco,sexo) "
						+ "VALUE ( '"+nome+"','"+cpf+"','"+email+"','"+telefone+"','"+endereco+"','"+sexo+"')");
						
						JOptionPane.showMessageDialog(rootPane, "Conta criada com sucesso");
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					dispose();
					TelaCadastroPet tela= new TelaCadastroPet();
					tela.setVisible(true);
				} else if(femininoradioButton.isSelected()) {
					sexo='F';
					String nome= jnome.getText();
					String cpf= jcpf.getText();
					String telefone= jtelefone.getText();
					String endereco= jendereco.getText();
					String email= jemail.getText();
					
					try {
						//trocar_nome_da_classe_pra_db
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Cliente(nome,cpf,email,telefone,endereco,sexo) "
						+ "VALUE ( '"+nome+"','"+cpf+"','"+email+"','"+telefone+"','"+endereco+"','"+sexo+"')");
						
						JOptionPane.showMessageDialog(rootPane, "Conta criada com sucesso");
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					dispose();
					TelaCadastroPet tela= new TelaCadastroPet();
					tela.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Selecione sexo para continuar!");
				}
				
				jnome.setText("");
				jcpf.setText("");
				jtelefone.setText("");
				jendereco.setText("");
				jemail.setText("");
				
				
			}
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 57, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CPF:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_4.setBounds(10, 111, 26, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Endereço:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(157, 111, 62, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Telefone:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_7.setBounds(160, 57, 59, 14);
		contentPane.add(lblNewLabel_7);
		
		jnome = new JTextField();
		jnome.setBounds(10, 70, 86, 20);
		contentPane.add(jnome);
		jnome.setColumns(10);
		
		jcpf = new JTextField();
		jcpf.setBounds(10, 124, 86, 20);
		contentPane.add(jcpf);
		jcpf.setColumns(10);
		
		jtelefone = new JTextField();
		jtelefone.setBounds(157, 70, 86, 20);
		contentPane.add(jtelefone);
		jtelefone.setColumns(10);
		
		jendereco = new JTextField();
		jendereco.setBounds(159, 124, 86, 20);
		contentPane.add(jendereco);
		jendereco.setColumns(10);
		
		jemail = new JTextField();
		jemail.setColumns(10);
		jemail.setBounds(10, 179, 86, 20);
		contentPane.add(jemail);
		
		JLabel lblNewLabel_6_1 = new JLabel("Email:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6_1.setBounds(10, 165, 62, 14);
		contentPane.add(lblNewLabel_6_1);
	}
}
