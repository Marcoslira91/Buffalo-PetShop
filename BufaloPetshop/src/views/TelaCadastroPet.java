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

public class TelaCadastroPet extends JFrame {

	private JPanel contentPane;
	private JTextField jnome;
	private JTextField jtipo;
	private JTextField jraca;
	private JTextField jcor;
	private JTextField jdataNascimento;
	private JTextField jpedigree;
	private final ButtonGroup sexobuttonGroup = new ButtonGroup();
	

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
		
		JRadioButton machoradioButton = new JRadioButton("Macho");
		sexobuttonGroup.add(machoradioButton);
		machoradioButton.setBounds(325, 107, 109, 23);
		contentPane.add(machoradioButton);
		
		JRadioButton femearadioButton = new JRadioButton("Fêmea");
		sexobuttonGroup.add(femearadioButton);
		femearadioButton.setBounds(325, 144, 109, 23);
		contentPane.add(femearadioButton);
		
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
			
				char sexo = '\0';
				if(machoradioButton.isSelected()) {
					sexo='M';
					String nome= jnome.getText();
					String tipo= jtipo.getText();
					String raca=jraca.getText();
					String dataNascimento= jdataNascimento.getText();
					String pedigree= jpedigree.getText();
					String cor= jcor.getText();
					
					try {
						 
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Pet(nome,tipo,raca,pedigree,cor,dataNascimento,sexo) "
						+ "VALUE ( '"+nome+"','"+tipo+"','"+raca+"','"+pedigree+"','"+cor+"','"+dataNascimento+"','"+sexo+"')");
						
						JOptionPane.showMessageDialog(rootPane, "Pet cadastrado :)");
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					dispose();
					TelaMenu tela= new TelaMenu();
					tela.setVisible(true);
				} else if(femearadioButton.isSelected()) {
					sexo='F';
							String nome= jnome.getText();
					String tipo= jtipo.getText();
					String raca=jraca.getText();
					String dataNascimento= jdataNascimento.getText();
					String pedigree= jpedigree.getText();
					String cor= jcor.getText();
					
					try {
					 
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Pet(nome,tipo,raca,pedigree,cor,dataNascimento,sexo) "
						+ "VALUE ( '"+nome+"','"+tipo+"','"+raca+"','"+pedigree+"','"+cor+"','"+dataNascimento+"','"+sexo+"')");
						 
							JOptionPane.showMessageDialog(rootPane, "Pet cadastrado :)");
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					dispose();
					TelaMenu tela= new TelaMenu();
						tela.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Selecione sexo para continuar!");
				}
				
				jnome.setText("");
				jtipo.setText("");
				jdataNascimento.setText("");
				jraca.setText("");
				jpedigree.setText("");
				jcor.setText("");
				
				
				
			}
			
		});
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		jnome = new JTextField();
		jnome.setBounds(10, 70, 86, 20);
		contentPane.add(jnome);
		jnome.setColumns(10);
		
		jtipo = new JTextField();
		jtipo.setBounds(10, 124, 86, 20);
		contentPane.add(jtipo);
		jtipo.setColumns(10);
		
		jraca = new JTextField();
		jraca.setBounds(10, 178, 86, 20);
		contentPane.add(jraca);
		jraca.setColumns(10);
		
		jcor = new JTextField();
		jcor.setBounds(157, 70, 86, 20);
		contentPane.add(jcor);
		jcor.setColumns(10);
		
		jdataNascimento = new JTextField();
		jdataNascimento.setBounds(157, 124, 86, 20);
		contentPane.add(jdataNascimento);
		jdataNascimento.setColumns(10);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("Cor:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_5.setBounds(157, 57, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Data de nascimento:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(151, 111, 111, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(354, 73, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		
		JButton btnNewButton_2 = new JButton("Salvar e cadastrar\r\n mais um");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				char sexo = '\0';
				if(machoradioButton.isSelected()) {
					sexo='M';
					String nome= jnome.getText();
					String tipo= jtipo.getText();
					String raca=jraca.getText();
					String dataNascimento= jdataNascimento.getText();
					String pedigree= jpedigree.getText();
					String cor= jcor.getText();
					
					try {
					 
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Pet(nome,tipo,raca,pedigree,cor,dataNascimento,sexo) "
						+ "VALUE ( '"+nome+"','"+tipo+"','"+raca+"','"+pedigree+"','"+cor+"','"+dataNascimento+"','"+sexo+"')");
						
						JOptionPane.showMessageDialog(rootPane, "Pet cadastrado :)");
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					dispose();
					TelaCadastroPet tela= new TelaCadastroPet();
					tela.setVisible(true);
				} else if(femearadioButton.isSelected()) {
					sexo='F';
							String nome= jnome.getText();
					String tipo= jtipo.getText();
					String raca=jraca.getText();
					String dataNascimento= jdataNascimento.getText();
					String pedigree= jpedigree.getText();
					String cor= jcor.getText();
					
					try {
						 
						
						java.sql.Statement s= ConnectionFactory.createConnectionToMySQL().createStatement();
						 s.executeUpdate(" INSERT INTO Pet(nome,tipo,raca,pedigree,cor,dataNascimento,sexo) "
						+ "VALUE ( '"+nome+"','"+tipo+"','"+raca+"','"+pedigree+"','"+cor+"','"+dataNascimento+"','"+sexo+"')");
						 
							JOptionPane.showMessageDialog(rootPane, "Pet cadastrado :)");
								
					}
					catch (Exception e1) {
						
						System.out.println(e1);
					}
					dispose();
					TelaCadastroPet tela= new TelaCadastroPet();
					tela.setVisible(true);;
				}else {
					JOptionPane.showMessageDialog(null,"Selecione sexo para continuar!");
				}
				
				jnome.setText("");
				jtipo.setText("");
				jdataNascimento.setText("");
				jraca.setText("");
				jpedigree.setText("");
				jcor.setText("");
			
		
			}
		});
		btnNewButton_2.setBounds(121, 227, 199, 23);
		contentPane.add(btnNewButton_2);
		
		jpedigree = new JTextField();
		jpedigree.setColumns(10);
		jpedigree.setBounds(157, 178, 86, 20);
		contentPane.add(jpedigree);
		
		JLabel lblNewLabel_6_1 = new JLabel("Pedigree:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6_1.setBounds(151, 164, 111, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_9 = new JLabel("AAAA/MM/DD");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_9.setBounds(167, 144, 64, 14);
		contentPane.add(lblNewLabel_9);
	}

}
