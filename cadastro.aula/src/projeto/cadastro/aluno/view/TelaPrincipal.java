package projeto.cadastro.aluno.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

import projeto.cadastro.aluno.dao.LeitorDao;
import projeto.cadastro.aluno.model.Leitor;
import javax.swing.ImageIcon;
import java.awt.Color;


public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtRGM;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTextField txtEnd;
	private JTextField txtMun;
	private final ButtonGroup btnGroup = new ButtonGroup();
	private JTextField txtFalta;
	private JComboBox cmbUF;
	private JTextField txtCelular;
	private JComboBox cmbCurso;
	private JComboBox cmbCampus;
	private JTextField txtListar;
	private JComboBox cmbDisciplina;
	private JComboBox cmbSemestre;
	private JComboBox cmbNota;
	private Leitor Leitor;
	private LeitorDao dao;
	private JLabel lblPesq1;
	private JLabel lblPesq2;
	private JLabel lblRGM;
	private JLabel lblNome;
	private JLabel lblCurso;
	private JLabel lblDisc;
	private JLabel lblNota;
	private JLabel lblFalta;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 264, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salvar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			          public void actionPerformed(ActionEvent e) {
				
				try {
					
					
					
				Leitor = new Leitor();
				Leitor.setRGM(Integer.parseInt(txtRGM.getText()));
				Leitor.setNomeAluno(txtNome.getText());
				Leitor.setNascAluno(txtData.getText());
				Leitor.setCPF(txtCPF.getText());
				Leitor.setEmailAluno(txtEmail.getText());
				Leitor.setEndAluno(txtEnd.getText());
				Leitor.setMunAluno(txtMun.getText());
				Leitor.setUfAluno((String)cmbUF.getSelectedItem());
				Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
				Leitor.setCursoAluno(((String)cmbCurso.getSelectedItem()));
				Leitor.setCampusAluno((String)cmbCampus.getSelectedItem());
				Leitor.setPerAluno(btnGroup.toString());
				Leitor.setDiscAluno((String)cmbDisciplina.getSelectedItem());
				Leitor.setSemAluno((String)cmbSemestre.getSelectedItem());
				Leitor.setNotaAluno(((String)cmbNota.getSelectedItem()));
				Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));
				
				
				
				dao = new LeitorDao();
				dao.salvar(Leitor);
				
				
				System.out.print("Salvo com sucesso!");	
					
					
				}
				catch (Exception erro) {
					
					System.out.print(erro);
				}
				
				
					
			}
		});
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Alterar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				try {
				
					
				Leitor = new Leitor();
				Leitor.setRGM(Integer.parseInt(txtRGM.getText()));
				Leitor.setNomeAluno(txtNome.getText());
				Leitor.setNascAluno(txtData.getText());
				Leitor.setCPF(txtCPF.getText());
				Leitor.setEmailAluno(txtEmail.getText());
				Leitor.setEndAluno(txtEnd.getText());
				Leitor.setMunAluno(txtMun.getText());
				Leitor.setUfAluno((String)cmbUF.getSelectedItem());
				Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
				Leitor.setCursoAluno(((String)cmbCurso.getSelectedItem()));
				Leitor.setCampusAluno((String)cmbCampus.getSelectedItem());
				Leitor.setPerAluno(btnGroup.toString());
				Leitor.setDiscAluno((String)cmbDisciplina.getSelectedItem());
				Leitor.setSemAluno((String)cmbSemestre.getSelectedItem());
				Leitor.setNotaAluno(((String)cmbNota.getSelectedItem()));
				Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));
				
				
				
				dao = new LeitorDao();
				dao.alterar(Leitor);
				
				
				System.out.print("alterado com sucesso!");	
					
					
				}
				catch (Exception erro) {
					
					System.out.print(erro);
				}
			
			
			
			
			
			
			
			
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					dao = new LeitorDao();
					int RGM = Integer.parseInt(txtRGM.getText());
					Leitor = dao.consultar(RGM);

					lblRGM.setText("RGM: " + Leitor.getRGM());
					lblNome.setText(" Nome: " + Leitor.getNomeAluno());
					lblCurso.setText("Curso: " + Leitor.getCursoAluno());
					lblDisc.setText("Disciplina: " + Leitor.getDiscAluno());
					lblNota.setText("Nota: " + Leitor.getNotaAluno());
					lblFalta.setText("Falta: " + Leitor.getFalAluno());
					
					System.out.print("Mostrando");
					
				} catch (Exception erro) {
					
					System.out.print(erro);
				}
			}
			
		});

			
			
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					dao = new LeitorDao();
					int RGM = Integer.parseInt(txtRGM.getText());
					dao.excluir(RGM);
					
					System.out.print("Excluido com sucesso");
					
					
				} catch (Exception erro) {
					
					System.out.print(erro);
					
				}
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// menu Notas e Faltas		
				
				
				
				try {
					
					
					
					Leitor = new Leitor();
					Leitor.setRGM(Integer.parseInt(txtRGM.getText()));
					Leitor.setNomeAluno(txtNome.getText());
					Leitor.setNascAluno(txtData.getText());
					Leitor.setCPF(txtCPF.getText());
					Leitor.setEmailAluno(txtEmail.getText());
					Leitor.setEndAluno(txtEnd.getText());
					Leitor.setMunAluno(txtMun.getText());
					Leitor.setUfAluno((String)cmbUF.getSelectedItem());
					Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
					Leitor.setCursoAluno(((String)cmbCurso.getSelectedItem()));
					Leitor.setCampusAluno((String)cmbCampus.getSelectedItem());
					Leitor.setPerAluno(btnGroup.toString());
					Leitor.setDiscAluno((String)cmbDisciplina.getSelectedItem());
					Leitor.setSemAluno((String)cmbSemestre.getSelectedItem());
					Leitor.setNotaAluno(((String)cmbNota.getSelectedItem()));
					Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));
					
					
					
					dao = new LeitorDao();
					dao.salvar(Leitor);
					
					
					System.out.print("Salvo com sucesso!");	
						
						
					}
					catch (Exception erro) {
						
						System.out.print(erro);
					}
					
					
						
				}
			});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Alterar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					// menu Notas e Faltas
					
					Leitor = new Leitor();
					Leitor.setRGM(Integer.parseInt(txtRGM.getText()));
					Leitor.setNomeAluno(txtNome.getText());
					Leitor.setNascAluno(txtData.getText());
					Leitor.setCPF(txtCPF.getText());
					Leitor.setEmailAluno(txtEmail.getText());
					Leitor.setEndAluno(txtEnd.getText());
					Leitor.setMunAluno(txtMun.getText());
					Leitor.setUfAluno((String)cmbUF.getSelectedItem());
					Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
					Leitor.setCursoAluno(((String)cmbCurso.getSelectedItem()));
					Leitor.setCampusAluno((String)cmbCampus.getSelectedItem());
					Leitor.setPerAluno(btnGroup.toString());
					Leitor.setDiscAluno((String)cmbDisciplina.getSelectedItem());
					Leitor.setSemAluno((String)cmbSemestre.getSelectedItem());
					Leitor.setNotaAluno(((String)cmbNota.getSelectedItem()));
					Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));
					
					
					
					dao = new LeitorDao();
					dao.alterar(Leitor);
					
					
					System.out.print("alterado com sucesso!");	
						
						
					}
					catch (Exception erro) {
						
						System.out.print(erro);
					}
				
				
				
				
				
				
				
				
				}
			});	
				
			
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Excluir");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// menu Notas e Faltas
			
				try {
				dao = new LeitorDao();
				int RGM = Integer.parseInt(txtRGM.getText());
				dao.excluir(RGM);
				
				System.out.print("Excluido com sucesso");
				
				
			}
			catch (Exception erro) {
				
				System.out.print(erro);
				
			}
		
			
			
			
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// menu Notas e Faltas
				
				try {
					dao = new LeitorDao();
					int RGM = Integer.parseInt(txtRGM.getText());
					Leitor = dao.consultar(RGM);

					lblPesq1.setText("RGM: " + Leitor.getRGM());
					lblPesq1.setText("Nome: " + Leitor.getNomeAluno());
					lblPesq2.setText("Curso: " + Leitor.getCursoAluno());
					
					
					System.out.print("Mostrando");
					
				} catch (Exception erro) {
					
					System.out.print(erro);
				}
			}
				
			
	});
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 33, 575, 307);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 462, 198);
		panel.add(contentPane_1);
		
		JLabel btnRGM = new JLabel("RGM:");
		btnRGM.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM.setBounds(10, 11, 46, 14);
		contentPane_1.add(btnRGM);
		
		JLabel btnNome = new JLabel("Nome:");
		btnNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNome.setBounds(164, 9, 48, 19);
		contentPane_1.add(btnNome);
		
		txtRGM = new JTextField();
		txtRGM.setColumns(10);
		txtRGM.setBounds(63, 10, 91, 20);
		contentPane_1.add(txtRGM);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(222, 10, 230, 20);
		contentPane_1.add(txtNome);
		
		JLabel btnNascimento = new JLabel("Data de Nascimento:");
		btnNascimento.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNascimento.setBounds(10, 39, 154, 19);
		contentPane_1.add(btnNascimento);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(148, 39, 86, 20);
		contentPane_1.add(txtData);
		
		JLabel btnCPF = new JLabel("CPF:");
		btnCPF.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCPF.setBounds(244, 41, 33, 14);
		contentPane_1.add(btnCPF);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(287, 41, 165, 20);
		contentPane_1.add(txtCPF);
		
		JLabel btnEmail = new JLabel("E-mail:");
		btnEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEmail.setBounds(10, 79, 46, 14);
		contentPane_1.add(btnEmail);
		
		JLabel btnEndereco = new JLabel("Endere\u00E7o:");
		btnEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEndereco.setBounds(10, 104, 65, 16);
		contentPane_1.add(btnEndereco);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(85, 77, 367, 20);
		contentPane_1.add(txtEmail);
		
		txtEnd = new JTextField();
		txtEnd.setColumns(10);
		txtEnd.setBounds(85, 103, 367, 20);
		contentPane_1.add(txtEnd);
		
		JLabel btnMunicipio = new JLabel("Munic\u00EDpio:");
		btnMunicipio.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMunicipio.setBounds(10, 142, 65, 16);
		contentPane_1.add(btnMunicipio);
		
		txtMun = new JTextField();
		txtMun.setColumns(10);
		txtMun.setBounds(85, 141, 127, 20);
		contentPane_1.add(txtMun);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUf.setBounds(222, 142, 14, 16);
		contentPane_1.add(lblUf);
		
		JLabel btnCelular = new JLabel("Celular:");
		btnCelular.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCelular.setBounds(312, 142, 65, 16);
		contentPane_1.add(btnCelular);
		
		cmbUF = new JComboBox();
		cmbUF.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "SP"}));
		cmbUF.setBounds(247, 140, 55, 22);
		contentPane_1.add(cmbUF);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(366, 141, 86, 20);
		contentPane_1.add(txtCelular);
		txtCelular.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel contentPane_2 = new JPanel();
		contentPane_2.setLayout(null);
		contentPane_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_2.setBounds(0, 0, 446, 226);
		panel_1.add(contentPane_2);
		
		JLabel btnCurso = new JLabel("Curso:");
		btnCurso.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCurso.setBounds(21, 23, 46, 14);
		contentPane_2.add(btnCurso);
		
		JLabel btnCampus = new JLabel("Campus:");
		btnCampus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCampus.setBounds(21, 48, 69, 16);
		contentPane_2.add(btnCampus);
		
		JLabel btnPeriodo = new JLabel("Per\u00EDodo");
		btnPeriodo.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPeriodo.setBounds(21, 87, 49, 16);
		contentPane_2.add(btnPeriodo);
		
		JRadioButton rbdMatutino = new JRadioButton("Matutino");
		btnGroup.add(rbdMatutino);
		rbdMatutino.setBounds(102, 85, 74, 23);
		contentPane_2.add(rbdMatutino);
		
		JRadioButton rbdVespertino = new JRadioButton("Vespertino");
		btnGroup.add(rbdVespertino);
		rbdVespertino.setBounds(178, 85, 77, 23);
		contentPane_2.add(rbdVespertino);
		
		JRadioButton rbdNoturno = new JRadioButton("Noturno");
		btnGroup.add(rbdNoturno);
		rbdNoturno.setBounds(257, 85, 74, 23);
		contentPane_2.add(rbdNoturno);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b1.PNG"));
		btnNewButton.setBounds(0, 147, 90, 68);
		contentPane_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b2.PNG"));
		btnNewButton_1.setActionCommand("");
		btnNewButton_1.setBounds(88, 147, 89, 68);
		contentPane_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b4.PNG"));
		btnNewButton_2.setBounds(176, 147, 89, 68);
		contentPane_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b4.PNG"));
		btnNewButton_3.setBounds(264, 147, 89, 68);
		contentPane_2.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b5.PNG"));
		btnNewButton_3_1.setBounds(347, 147, 89, 68);
		contentPane_2.add(btnNewButton_3_1);
		
		cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"ADS", "Redes", "Ciencias da computa\u00E7ao"}));
		cmbCurso.setBounds(121, 20, 232, 22);
		contentPane_2.add(cmbCurso);
		
		cmbCampus = new JComboBox();
		cmbCampus.setModel(new DefaultComboBoxModel(new String[] {"Analia Franco", "Tatuape", "Sao Miguel"}));
		cmbCampus.setBounds(121, 46, 232, 22);
		contentPane_2.add(cmbCampus);
		
	
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel contentPane_3 = new JPanel();
		contentPane_3.setLayout(null);
		contentPane_3.setToolTipText("Programa\u00E7\u00E3o Orientada a Objeto\r\nT\u00E9cninas de Programa\u00E7\u00E3o\r\nBanco de Dados\r\nEngenharia de Software");
		contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_3.setBounds(0, 0, 434, 184);
		panel_2.add(contentPane_3);
		
		JLabel btnRGM_1 = new JLabel("RGM");
		btnRGM_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM_1.setBounds(10, 32, 37, 14);
		contentPane_3.add(btnRGM_1);
		
		JLabel btnDisciplina = new JLabel("Disciplina");
		btnDisciplina.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDisciplina.setBounds(10, 92, 59, 16);
		contentPane_3.add(btnDisciplina);
		
		JLabel btnSemestre = new JLabel("Semestre");
		btnSemestre.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSemestre.setBounds(7, 135, 62, 16);
		contentPane_3.add(btnSemestre);
		
		JLabel btnNota = new JLabel("Nota");
		btnNota.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNota.setBounds(189, 136, 46, 14);
		contentPane_3.add(btnNota);
		
		JLabel btnFalta = new JLabel("Falta");
		btnFalta.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFalta.setBounds(294, 136, 46, 14);
		contentPane_3.add(btnFalta);
		
		txtFalta = new JTextField();
		txtFalta.setColumns(10);
		txtFalta.setBounds(338, 134, 86, 20);
		contentPane_3.add(txtFalta);
		
		txtListar = new JTextField();
		txtListar.setBounds(60, 30, 86, 20);
		contentPane_3.add(txtListar);
		txtListar.setColumns(10);
		
		cmbDisciplina = new JComboBox();
		cmbDisciplina.setModel(new DefaultComboBoxModel(new String[] {"Redes", "banco de dados", "programa\u00E7ao"}));
		cmbDisciplina.setBounds(102, 90, 322, 22);
		contentPane_3.add(cmbDisciplina);
		
		cmbSemestre = new JComboBox();
		cmbSemestre.setModel(new DefaultComboBoxModel(new String[] {"primeiro", "segundo"}));
		cmbSemestre.setBounds(102, 133, 77, 22);
		contentPane_3.add(cmbSemestre);
		
		cmbNota = new JComboBox();
		cmbNota.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		cmbNota.setBounds(231, 133, 46, 22);
		contentPane_3.add(cmbNota);
		
		lblPesq1 = new JLabel("");
		lblPesq1.setBounds(173, 32, 251, 18);
		contentPane_3.add(lblPesq1);
		
		lblPesq2 = new JLabel("");
		lblPesq2.setBackground(Color.BLACK);
		lblPesq2.setBounds(60, 59, 364, 22);
		contentPane_3.add(lblPesq2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblRGM = new JLabel("");
		lblRGM.setBounds(39, 35, 172, 21);
		panel_3.add(lblRGM);
		
		lblNome = new JLabel("");
		lblNome.setBounds(251, 35, 190, 21);
		panel_3.add(lblNome);
		
		lblCurso = new JLabel("");
		lblCurso.setBounds(39, 80, 172, 21);
		panel_3.add(lblCurso);
		
		lblDisc = new JLabel("");
		lblDisc.setBounds(250, 80, 191, 21);
		panel_3.add(lblDisc);
		
		lblNota = new JLabel("");
		lblNota.setBounds(39, 131, 172, 21);
		panel_3.add(lblNota);
		
		lblFalta = new JLabel("");
		lblFalta.setBounds(250, 131, 172, 21);
		panel_3.add(lblFalta);
	}
}

