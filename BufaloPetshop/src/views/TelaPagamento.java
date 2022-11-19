package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaPagamento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamento frame = new TelaPagamento();
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
	public TelaPagamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BuffalosPetShop");
		lblNewLabel.setFont(new Font("Agency FB", Font.ITALIC, 14));
		lblNewLabel.setBounds(359, 11, 75, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Débito");
		btnNewButton.setBounds(161, 72, 104, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Crédito");
		btnNewButton_1.setBounds(161, 127, 104, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Dinheiro/Pix");
		btnNewButton_2.setBounds(161, 183, 104, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione uma forma de pagamento:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 11, 240, 32);
		contentPane.add(lblNewLabel_1);
	}

}
