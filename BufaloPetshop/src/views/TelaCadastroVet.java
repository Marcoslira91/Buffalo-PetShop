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

public class TelaCadastroVet extends JFrame {
	
	private JPanel contentPane;
	private JTextField jnome;
	private JTextField jcpf;
	private JTextField jtelefone;
	private JTextField jendereco;
	private JTextField jcrmv;
	private final ButtonGroup sexobuttonGroup = new ButtonGroup();
	private JTextField jemail;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroVet frame = new TelaCadastroVet();
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
	public TelaCadastroVet() {
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
		
		JButton btnNewButton_1 = new JButton("Concluir");
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
					String crmv=jcrmv.getText();
					try {
					 
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Veterinario(nome,cpf,email,telefone,endereço,crmv,sexo) "
						+ "VALUE ( '"+nome+"','"+cpf+"','"+email+"','"+telefone+"','"+endereco+"','"+crmv+"','"+sexo+"')");
						
						 
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					JOptionPane.showMessageDialog(rootPane, "Conta criada com sucesso");
 					dispose();
 					TelaMenu tela= new TelaMenu();
 					tela.setVisible(true);
				} else if(femininoradioButton.isSelected()) {
					sexo='F';
					String nome= jnome.getText();
					String cpf= jcpf.getText();
					String telefone= jtelefone.getText();
					String endereco= jendereco.getText();
					String email= jemail.getText();
					String crmv=jcrmv.getText();
					try {
						 
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Veterinario(nome,cpf,email,telefone,endereço,crmv,sexo) "
						+ "VALUE ( '"+nome+"','"+cpf+"','"+email+"','"+telefone+"','"+endereco+"','"+crmv+"','"+sexo+"')");
						 
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					JOptionPane.showMessageDialog(rootPane, "Conta criada com sucesso");
 					dispose();
 					TelaMenu tela= new TelaMenu();
 					tela.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Selecione sexo para continuar!");
				}
				
				jnome.setText("");
				jcpf.setText("");
				jtelefone.setText("");
				jendereco.setText("");
				jemail.setText("");
				jcrmv.setText("");

			
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
		
		jcrmv = new JTextField();
		jcrmv.setBounds(157, 178, 86, 20);
		contentPane.add(jcrmv);
		jcrmv.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("CRMV:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_10.setBounds(157, 164, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		jemail = new JTextField();
		jemail.setColumns(10);
		jemail.setBounds(10, 178, 86, 20);
		contentPane.add(jemail);
		
		JLabel lblNewLabel_10_1 = new JLabel("Email:");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_10_1.setBounds(10, 164, 46, 14);
		contentPane.add(lblNewLabel_10_1);
	}

}
