package InterfaceGrafica.mercado_simplesPOO;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import InterfaceGrafica.POO.tela;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MenuMercado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMercado frame = new MenuMercado();
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
	public MenuMercado() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItenProduto = new JMenuItem("Produto");
		menuItenProduto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Produto tela_produto = new Produto();
				tela_produto.setVisible(true);
				tela_produto.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		menuItenProduto.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\produtos (1).png"));
		mnNewMenu.add(menuItenProduto);
		
		JMenuItem menuItemFornecedor = new JMenuItem("Fornecedor");
		menuItemFornecedor.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\fornecedor.png"));
		mnNewMenu.add(menuItemFornecedor);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\saida-de-emergencia.png"));
		menuBar.add(btnNewButton);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuBar.add(menuItem);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\celular.png"));
		lblNewLabel.setBounds(10, 11, 414, 212);
		contentPane.add(lblNewLabel);
	}
}
