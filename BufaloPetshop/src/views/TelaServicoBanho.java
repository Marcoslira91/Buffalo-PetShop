package views;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import factory.db; 

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;

public class TelaServicoBanho extends JFrame {

	private JPanel contentPane;
	private JTextField jnome;
	private JTextField jtipo;
	private JTextField jraca;
	private JTextField jpeso;
	private JTextField jpesquisa;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaServicoBanho frame = new TelaServicoBanho();
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
	public TelaServicoBanho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(479, 11, 69, 17);
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
		btnNewButton_3.setBounds(10, 312, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Banho");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(169, 19, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Digite o ID do seu pet:");
		lblNewLabel_2.setBounds(10, 63, 136, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jbdc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BuffalosPet");
					java.sql.Statement s= db.createConnectionToMySQL().createStatement();
					String query= "SELECT * from Pet where nome= ?";
					//s.executeQuery(query);
					PreparedStatement pst = (PreparedStatement) db.createConnectionToMySQL();
					pst.setString(1, jpesquisa.getText());
					ResultSet rs = pst.executeQuery(query);
					//ResultSetMetaData rsmd= rs.getMetaData();
			/*
					DefaultTableModel model=(DefaultTableModel)table.getModel();
				
					int cols= rsmd.getColumnCount();
					String[]colName= new String[cols];
					for (int i=0; i<cols;i++) {
						colName[i]=rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
					}
					*/
				
				if(rs.next()) {
						jnome.setText(rs.getString("nome"));
						jtipo.setText(rs.getString("tipo"));
						jraca.setText(rs.getString("raca"));
						jpeso.setText(rs.getString("peso"));
						
						
						
					}else {
						System.out.println("erro");
					}
					 
				}
				
				catch(Exception e1) {
				
				}
	
			}
		});
		btnNewButton.setBounds(252, 60, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição:");
		lblNewLabel_5.setBounds(146, 275, 69, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(149, 289, 270, 45);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Concluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaServicoDecisao tela= new TelaServicoDecisao();
				tela.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(459, 324, 89, 23);
		contentPane.add(btnNewButton_1);
		
		jnome = new JTextField();
		jnome.setBounds(10, 91, 89, 31);
		contentPane.add(jnome);
		jnome.setColumns(10);
		
		jtipo = new JTextField();
		jtipo.setBounds(10, 133, 89, 21);
		contentPane.add(jtipo);
		jtipo.setColumns(10);
		
		jraca = new JTextField();
		jraca.setBounds(10, 165, 89, 29);
		contentPane.add(jraca);
		jraca.setColumns(10);
		
		jpeso = new JTextField();
		jpeso.setBounds(10, 205, 89, 25);
		contentPane.add(jpeso);
		jpeso.setColumns(10);
		
		jpesquisa = new JTextField();
		jpesquisa.setBounds(139, 61, 76, 20);
		contentPane.add(jpesquisa);
		jpesquisa.setColumns(10);
		
		table = new JTable();
		table.setBounds(262, 94, 260, 164);
		contentPane.add(table);
	}
}
