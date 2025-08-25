package InterfaceGrafica.mercado_simplesPOO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Menu_Antigo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Antigo frame = new Menu_Antigo();
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
	public Menu_Antigo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\cadastro.png"));
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 251, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFornecedor = new JButton("TELA FORNECEDOR");
		// Define o cursor como mão ao passar o mouse
		btnFornecedor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor tela_fornecedor = new Fornecedor();
				
				tela_fornecedor.setVisible(true);
				tela_fornecedor.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnFornecedor.setForeground(new Color(0, 0, 0));
		btnFornecedor.setBounds(57, 84, 148, 23);
		contentPane.add(btnFornecedor);
		
		JButton btnProduto = new JButton("TELA PRODUTO");
		btnProduto.setBackground(new Color(255, 255, 255));
		btnProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produto tela_produto = new Produto();
				
				tela_produto.setVisible(true);
				tela_produto.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnProduto.setForeground(new Color(0, 0, 0));
		btnProduto.setBounds(57, 50, 148, 23);
		// Define o cursor como mão ao passar o mouse
btnProduto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		contentPane.add(btnProduto);
		
		JButton btnLogoff = new JButton("LOGOFF");
		btnLogoff.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\casa.png"));
		btnLogoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Mercado logon = new Login_Mercado();
				
				logon.setVisible(true);
				logon.setLocationRelativeTo(null);
				dispose();
				
				
			}
		});
		btnLogoff.setForeground(new Color(0, 0, 0));
		btnLogoff.setBounds(57, 118, 148, 23);
		contentPane.add(btnLogoff);
		// Define o cursor como mão ao passar o mouse
		btnLogoff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JLabel labelproduto = new JLabel("");
		labelproduto.setHorizontalAlignment(SwingConstants.CENTER);
		labelproduto.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\produtos.png"));
		labelproduto.setBounds(10, 152, 90, 95);
		contentPane.add(labelproduto);
	}
}
