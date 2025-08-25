package InterfaceGrafica.mercado_simplesPOO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Produto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtQuantidade;
	private JTextField txtPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto();
					frame.setVisible(true);
					
					// COLOCAR TELA (INTERFACE) NO MEIO DA JANELA

					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Produto() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\novo-produto.png"));
		setTitle("MERCADO KIBARATO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 449);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 492, 273);
		panel.setBackground(new Color(204, 255, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOME:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 61, 62, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("CADASTRO DOS PRODUTOS");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(82, 10, 356, 41);
		panel.add(lblNewLabel_2);
		
		JLabel lblDescreioproduto = new JLabel("DESCRIÇÃO:");
		lblDescreioproduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescreioproduto.setBounds(10, 105, 103, 19);
		panel.add(lblDescreioproduto);
		
		JLabel lblQuantidade = new JLabel("QUANTIDADE:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidade.setBounds(10, 150, 108, 19);
		panel.add(lblQuantidade);
		
		JLabel lblPreo = new JLabel("PREÇO:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreo.setBounds(10, 191, 108, 19);
		panel.add(lblPreo);
		
		JLabel labelRestultado = new JLabel("");
		labelRestultado.setBounds(20, 293, 460, 85);
		contentPane.add(labelRestultado);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//saída NOVA JANELA opção 01
				/*
				JOptionPane.showMessageDialog(null, "Cadastro do produto \n Nome: "+
				txtNome.getText()+"\nDescrição: "+
						txtDescricao.getText()+"\nQuantidade:"+
				txtQuantidade.getText()+
				"\nPreço:"+txtPreco.getText());
				*/
		      /*
		       //Saída NA PRÓPRIA TELA opção 02
				// Pegando o que o usuário digitou
				String nome = txtNome.getText();
				String descricao = txtDescricao.getText();
				String quantidade = txtQuantidade.getText();
				String preco = txtPreco.getText();

				// Montando a mensagem para aparecer no JLabel
				 //<html> serve para quebrar linha usando <br>, para ficar organizado
				String saida = "<html>Produto: " + nome + "<br>Descrição: " + descricao +
				              "<br>Quantidade: " + quantidade + "<br>Preço: " + preco + "</html>";

				// Mostrando a mensagem no JLabel txtLabel
				labelRestultado.setText(saida);
*/
				
				//campo obrigatório E SAIDA NA PROPRIA TELA 
				
				// Pegando o que o usuário digitou
				// .trim() tira espaços
				String nome = txtNome.getText().trim();// .trim() tira espaços
				String descricao = txtDescricao.getText().trim();
				String quantidade = txtQuantidade.getText().trim();
				String preco = txtPreco.getText().trim();
				
				// Verificando se algum campo está vazio
				if (nome.isEmpty() || descricao.isEmpty() || quantidade.isEmpty() || preco.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os  campos!", "Atenção",JOptionPane.WARNING_MESSAGE);
				} else {
				// Montando a mensagem para aparecer no JLabel
				 //<html> serve para quebrar linha usando <br>, para ficar organizado
				
				String saida = "<html>Produto: " + nome + "<br>Descrição: " + descricao +
				              "<br>Quantidade: " + quantidade + "<br>Preço: " + preco + "</html>";

				// Mostrando a mensagem no JLabel txtLabel
				labelRestultado.setText(saida);
				}
				}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOk.setBounds(34, 236, 108, 27);
		panel.add(btnOk);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LIMPAR TELA - QUAL CAMPO.SET PARA MODIFICAR O CAMPO
				txtNome.setText("");
				txtDescricao.setText("");
				txtQuantidade.setText("");
				txtPreco.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(194, 236, 108, 27);
		panel.add(btnLimpar);
		
		JButton btnSair = new JButton("SAIR");
		btnSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login_Mercado tela_login = new Login_Mercado();
					tela_login.setVisible(true);
					tela_login.setLocationRelativeTo(null);
					dispose();
					
							    			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSair.setBounds(349, 236, 108, 27);
		panel.add(btnSair);
		
		txtNome = new JTextField();
		txtNome.setBounds(117, 61, 321, 21);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(117, 107, 321, 21);
		panel.add(txtDescricao);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(117, 152, 146, 21);
		panel.add(txtQuantidade);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(117, 193, 146, 21);
		panel.add(txtPreco);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(204, 204, 204));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Cursos\\JAVA - Eclipse\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\novo-produto.png"));
		lblNewLabel_1.setBounds(34, 9, 62, 51);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\novo-produto (1).png"));
		lblNewLabel_1_1.setBounds(349, 150, 82, 71);
		panel.add(lblNewLabel_1_1);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu_Antigo retorno_menu = new Menu_Antigo();
				retorno_menu.setVisible(true);
				retorno_menu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnMenu.setBounds(419, 381, 85, 21);
		contentPane.add(btnMenu);
		
		
		
		
	}
}

	