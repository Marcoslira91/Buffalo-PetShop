package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class TelaMenu extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBounds(179, 11, 71, 25);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BuffalosPetShop");
		lblNewLabel_1.setBounds(363, 0, 71, 23);
		lblNewLabel_1.setFont(new Font("Agency FB", Font.ITALIC, 14));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Login\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaLogin tela= new TelaLogin();
				tela.setVisible(true);
			
			}
		});
		btnNewButton_1.setBounds(161, 146, 106, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Por favor, para prosseguir selecione uma das opções abaixo:");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 63, 386, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Vet");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaLoginVet tela= new TelaLoginVet();
				tela.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(161, 180, 106, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("\"Excelência em tudo que fazemos\"");
		lblNewLabel_3.setFont(new Font("Agency FB", Font.ITALIC, 15));
		lblNewLabel_3.setBounds(147, 227, 159, 23);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Cadastar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaCadastroGeral tela= new TelaCadastroGeral();
				tela.setVisible(true);
			}
		});
		btnNewButton.setBounds(161, 113, 106, 23);
		contentPane.add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
