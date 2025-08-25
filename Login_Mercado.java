package InterfaceGrafica.mercado_simplesPOO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Login_Mercado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Login_Mercado frame = new Login_Mercado();
					
				frame.setVisible(true);
				
				// COLOCAR  TELA (INTERFACE) NO MEIO DA JANELA
				
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
	public Login_Mercado() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\casa.png"));
		setResizable(false);
		setTitle("MERCADO KIBARATO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		panel.setBounds(24, 22, 296, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SENHA");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(27, 108, 72, 19);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_1 = new JLabel("USUÁRIO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(27, 64, 72, 19);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtUsuario = new JTextField();
		txtUsuario.setBackground(new Color(51, 153, 255));
		txtUsuario.setBounds(124, 66, 114, 19);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ACESSO AO SISTEMA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(27, 25, 259, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		btnEntrar.setBounds(130, 152, 108, 27);
		panel.add(btnEntrar);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exemplo sem banco de dados
				
			String usuario;
			String senha;
			// Pega o texto digitado no campo de usuário e senha
			usuario = (txtUsuario.getText()); 
			senha = (txtSenha.getText());
			
			//ESTRUTURA CONDICIONAL e criando um objeto
			
			if (usuario.equals("ROBSON") && senha.equals("123")) {
				JOptionPane.showMessageDialog(null, "Acesso liberado!", "Menssagem", JOptionPane.INFORMATION_MESSAGE);
				// Instancia um novo objeto da tela de produto
				Menu_Antigo tela_menu = new Menu_Antigo();
				 // Deixa a tela de produto visível
				tela_menu.setVisible(true);
				 // Fecha (descarta) a tela atual (login)
				// COLOCAR  TELA (INTERFACE) NO MEIO DA JANELA
				tela_menu.setLocationRelativeTo(null);
				dispose();//fechar tela anterior
				MenuMercado tela_Menunovo = new MenuMercado();
				 // Deixa a tela de produto visível
				tela_Menunovo.setVisible(true);
				 // Fecha (descarta) a tela atual (login)
				// COLOCAR  TELA (INTERFACE) NO MEIO DA JANELA
				tela_Menunovo.setLocationRelativeTo(null);
				dispose();//fechar tela anterior
			}
				else {
					JOptionPane.showMessageDialog(null, "Dados incorreto!", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
				
			
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtSenha = new JPasswordField();
		txtSenha.setBackground(new Color(51, 153, 255));
		txtSenha.setBounds(124, 110, 114, 19);
		panel.add(txtSenha);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Java\\eclipse-workspace\\SenaiAula\\src\\InterfaceGrafica\\imagens\\produtos.png"));
		lblNewLabel_3.setBounds(10, 137, 102, 104);
		panel.add(lblNewLabel_3);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					//System.exit(0);
				
				
				// 2º opção 
				/* setVisible (false);
				JOptionPane.showMessageDialog(null,"Volte Sempre!!!");
			}
				
				*/
				// 3º opção 
				int resposta = JOptionPane.showConfirmDialog(
				        null, 
				        "Deseja realmente sair?", 
				        "Confirmação", 
				        JOptionPane.YES_NO_OPTION
				    );
				    
				    if (resposta == JOptionPane.YES_OPTION) {
				        System.exit(0); // Sai se o usuário confirmar
				        if(resposta == JOptionPane.NO_OPTION) {
				        	
				        }
				    }}
			
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCancelar.setBackground(UIManager.getColor("Button.background"));
		btnCancelar.setBounds(130, 188, 108, 27);
		panel.add(btnCancelar);
	}
}
