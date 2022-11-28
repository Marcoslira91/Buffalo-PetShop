package views;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Random;

import factory.ConnectionFactory;
import model.Pet;

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

import dao.PetDAO;

import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaServicoBanho extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField jnome;
	private JTextField jtipo;
	private JTextField jraca;
	private JTextField jid;

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
		setBounds(100, 100, 610, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(515, 11, 69, 17);
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
		
		JButton btnNewButton = new JButton("Buscar Pets");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelo= (DefaultTableModel) table.getModel();
				 PetDAO dao = new PetDAO();
				 try {
					 for(Pet p: dao.listarTodosPets()) {
						 modelo.addRow(new Object[] {
				p.getIdPet(),
				p.getNome(),
				p.getTipo(),
				p.getRaca(),
				p.getSexo(),
				p.getPedigree(),
				p.getDataNascimento()			 
						 });
					 }
					 
				 }
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"ERRO!");
				}
		 
			}
		});
		btnNewButton.setBounds(10, 173, 122, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Descrição:");
		lblNewLabel_5.setBounds(146, 275, 69, 14);
		contentPane.add(lblNewLabel_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(149, 289, 270, 45);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Selecionar pet\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				switch(JOptionPane.showConfirmDialog(null, "ID:"+jid.getText()+"\n"+"Nome:"+jnome.getText()
				+"\n"+"Tipo:"+jtipo.getText()
				,"Confrimar serviço para:", JOptionPane.YES_NO_OPTION))
				{
				case 0:
					Random random= new Random();
					int senha=random.nextInt(1000);
					JOptionPane.showMessageDialog(null,"ID:"+jid.getText()+"\n"+"Nome:"+jnome.getText()
					+"\n"+"Tipo:"+jtipo.getText() +"\nTotal:\nR$:50,00", "VALOR", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null,"Sua senha é: "+ senha);
					dispose();
					TelaServicoDecisao tela= new TelaServicoDecisao();
					 tela.setVisible(true);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, "Selecione um pet para continuar", "AVISO", JOptionPane.INFORMATION_MESSAGE);
					dispose();
					TelaServicoBanho tela1= new TelaServicoBanho();
					tela1.setVisible(true);
					break;
				}
				 
			}
		});
		btnNewButton_1.setBounds(459, 324, 125, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Pet p= new Pet();
				PetDAO dao= new PetDAO();
				int index= table.getSelectedRow();
				
				p= dao.listarTodosPets().get(index);
				
				jnome.setText(p.getNome());
				jtipo.setText(p.getTipo());
				jraca.setText(p.getRaca());
				jid.setText(String.valueOf(p.getIdPet()));
	 
			}
		});
		scrollPane.setBounds(10, 39, 551, 123);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Tipo", "Raca", "Sexo", "Pedigree", "Datanasc"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(23);
		table.getColumnModel().getColumn(4).setPreferredWidth(35);
		table.getColumnModel().getColumn(6).setPreferredWidth(63);
		
		jnome = new JTextField();
		jnome.setBounds(498, 207, 86, 20);
		contentPane.add(jnome);
		jnome.setColumns(10);
		
		jtipo = new JTextField();
		jtipo.setBounds(498, 238, 86, 20);
		contentPane.add(jtipo);
		jtipo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(453, 210, 42, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo:\r\n");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(459, 241, 36, 14);
		contentPane.add(lblNewLabel_4);
		
		jraca = new JTextField();
		jraca.setColumns(10);
		jraca.setBounds(498, 269, 86, 20);
		contentPane.add(jraca);
		
		JLabel lblNewLabel_6_1 = new JLabel("Raca:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6_1.setBounds(455, 275, 42, 14);
		contentPane.add(lblNewLabel_6_1);
		
		jid = new JTextField();
		jid.setColumns(10);
		jid.setBounds(498, 174, 46, 20);
		contentPane.add(jid);
		
		JLabel lblNewLabel_7 = new JLabel("Id:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(472, 177, 23, 14);
		contentPane.add(lblNewLabel_7);
	}
}
