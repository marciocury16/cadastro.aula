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
import javax.swing.JOptionPane;
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
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtRGM;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTextField txtEnd;
	private JTextField txtMun;
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
	private JLabel lblPesq3;
	private JLabel lblRGM;
	private JLabel lblNome;
	private JLabel lblCurso;
	private JLabel lblDisc;
	private JLabel lblNota;
	private JLabel lblFalta;
	private JLabel lblPesq2;
	private JPanel panel_11;
	private JRadioButton rbdMatutino;
	private JRadioButton rbdVespertino;
	private JRadioButton rbdNoturno;
	private final ButtonGroup btnGroup = new ButtonGroup();

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
					Leitor.setUfAluno((String) cmbUF.getSelectedItem());
					Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
					Leitor.setCursoAluno(((String) cmbCurso.getSelectedItem()));
					Leitor.setCampusAluno((String) cmbCampus.getSelectedItem());

					if (rbdMatutino.isSelected()) {

						Leitor.setPerAluno("Matutino");
					}

					if (rbdVespertino.isSelected()) {

						Leitor.setPerAluno("Vespertino");

					}

					if (rbdNoturno.isSelected()) {

						Leitor.setPerAluno("Noturno");
					}

					Leitor.setDiscAluno((String) cmbDisciplina.getSelectedItem());
					Leitor.setSemAluno((String) cmbSemestre.getSelectedItem());
					Leitor.setNotaAluno(((String) cmbNota.getSelectedItem()));
					Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));

					dao = new LeitorDao();
					dao.salvar(Leitor);

					System.out.println(" Salvo com sucesso!");

				} catch (Exception erro) {

					System.out.println(erro);
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
					Leitor.setUfAluno((String) cmbUF.getSelectedItem());
					Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
					Leitor.setCursoAluno(((String) cmbCurso.getSelectedItem()));
					Leitor.setCampusAluno((String) cmbCampus.getSelectedItem());

					if (rbdMatutino.isSelected()) {

						Leitor.setPerAluno("Matutino");
					}

					if (rbdVespertino.isSelected()) {

						Leitor.setPerAluno("Vespertino");

					}

					if (rbdNoturno.isSelected()) {

						Leitor.setPerAluno("Noturno");
					}
					Leitor.setDiscAluno((String) cmbDisciplina.getSelectedItem());
					Leitor.setSemAluno((String) cmbSemestre.getSelectedItem());
					Leitor.setNotaAluno(((String) cmbNota.getSelectedItem()));
					Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));

					dao = new LeitorDao();
					dao.alterar(Leitor);

					System.out.println(" alterado com sucesso!");

				} catch (Exception erro) {

					System.out.println(erro);
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

					System.out.println(" Mostrando");

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

					System.out.println(" Excluido com sucesso");

				} catch (Exception erro) {

					System.out.println(erro);

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
					Leitor.setUfAluno((String) cmbUF.getSelectedItem());
					Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
					Leitor.setCursoAluno(((String) cmbCurso.getSelectedItem()));
					Leitor.setCampusAluno((String) cmbCampus.getSelectedItem());

					if (rbdMatutino.isSelected()) {

						Leitor.setPerAluno("Matutino");
					}

					if (rbdVespertino.isSelected()) {

						Leitor.setPerAluno("Vespertino");

					}

					if (rbdNoturno.isSelected()) {

						Leitor.setPerAluno("Noturno");
					}

					Leitor.setDiscAluno((String) cmbDisciplina.getSelectedItem());
					Leitor.setSemAluno((String) cmbSemestre.getSelectedItem());
					Leitor.setNotaAluno(((String) cmbNota.getSelectedItem()));
					Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));

					dao = new LeitorDao();
					dao.salvar(Leitor);

					System.out.println(" Salvo com sucesso!");
					
				} catch (Exception erro) {

					System.out.println(erro);
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
					Leitor.setUfAluno((String) cmbUF.getSelectedItem());
					Leitor.setCelAluno(Integer.parseInt(txtCelular.getText()));
					Leitor.setCursoAluno(((String) cmbCurso.getSelectedItem()));
					Leitor.setCampusAluno((String) cmbCampus.getSelectedItem());

					if (rbdMatutino.isSelected()) {

						Leitor.setPerAluno("Matutino");
					}

					if (rbdVespertino.isSelected()) {

						Leitor.setPerAluno("Vespertino");

					}

					if (rbdNoturno.isSelected()) {

						Leitor.setPerAluno("Noturno");
					}
					Leitor.setDiscAluno((String) cmbDisciplina.getSelectedItem());
					Leitor.setSemAluno((String) cmbSemestre.getSelectedItem());
					Leitor.setNotaAluno(((String) cmbNota.getSelectedItem()));
					Leitor.setFalAluno(Integer.parseInt(txtFalta.getText()));

					dao = new LeitorDao();
					dao.alterar(Leitor);

					System.out.println(" alterado com sucesso!");


				} catch (Exception erro) {

					System.out.println(erro);
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

					System.out.println(" Excluido com sucesso");

				} catch (Exception erro) {

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
					int RGM1 = Integer.parseInt(txtListar.getText());
					Leitor = dao.consulta1(RGM1);

					lblPesq1.setText("RGM: " + Leitor.getRGM());
					lblPesq2.setText("Nome: " + Leitor.getNomeAluno());
					lblPesq3.setText("Curso: " + Leitor.getCursoAluno());

					System.out.println(" Mostrando");

				} catch (Exception erro) {

					System.out.print(erro);
				}
			}

		});
		mnNewMenu_1.add(mntmNewMenuItem_8);

		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Sobre");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Criado e desenvoldio pelo Grupo TECH NINJA ");

			}
		});
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
		cmbUF.setModel(new DefaultComboBoxModel(new String[] { "Selecione", "SP" }));
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

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\git\\cadastro.aula\\Bot\u00F5es\\b1.PNG"));
		btnNewButton.setBounds(0, 147, 90, 68);
		contentPane_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\git\\cadastro.aula\\Bot\u00F5es\\b2.PNG"));
		btnNewButton_1.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b2.PNG"));
		btnNewButton_1.setActionCommand("");
		btnNewButton_1.setBounds(88, 147, 89, 68);
		contentPane_2.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\git\\cadastro.aula\\Bot\u00F5es\\b3.PNG"));
		btnNewButton_2.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b4.PNG"));
		btnNewButton_2.setBounds(176, 147, 89, 68);
		contentPane_2.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\git\\cadastro.aula\\Bot\u00F5es\\b4.PNG"));
		btnNewButton_3.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b4.PNG"));
		btnNewButton_3.setBounds(264, 147, 89, 68);
		contentPane_2.add(btnNewButton_3);

		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\git\\cadastro.aula\\Bot\u00F5es\\b5.PNG"));
		btnNewButton_3_1.setSelectedIcon(new ImageIcon("C:\\Users\\Usu\u00E1rio\\Pictures\\Bot\u00F5es\\b5.PNG"));
		btnNewButton_3_1.setBounds(347, 147, 89, 68);
		contentPane_2.add(btnNewButton_3_1);

		cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] { "ADS", "Redes", "Ciencias da computa\u00E7ao" }));
		cmbCurso.setBounds(121, 20, 232, 22);
		contentPane_2.add(cmbCurso);

		cmbCampus = new JComboBox();
		cmbCampus.setModel(new DefaultComboBoxModel(new String[] { "Analia Franco", "Tatuape", "Sao Miguel" }));
		cmbCampus.setBounds(121, 46, 232, 22);
		contentPane_2.add(cmbCampus);

		rbdMatutino = new JRadioButton("Matutino");
		btnGroup.add(rbdMatutino);
		rbdMatutino.setBounds(83, 85, 67, 23);
		contentPane_2.add(rbdMatutino);

		rbdVespertino = new JRadioButton("Vespertino");
		btnGroup.add(rbdVespertino);
		rbdVespertino.setBounds(146, 85, 77, 23);
		contentPane_2.add(rbdVespertino);

		rbdNoturno = new JRadioButton("Noturno");
		btnGroup.add(rbdNoturno);
		rbdNoturno.setBounds(225, 85, 109, 23);
		contentPane_2.add(rbdNoturno);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);

		JPanel contentPane_3 = new JPanel();
		contentPane_3.setLayout(null);
		contentPane_3.setToolTipText(
				"Programa\u00E7\u00E3o Orientada a Objeto\r\nT\u00E9cninas de Programa\u00E7\u00E3o\r\nBanco de Dados\r\nEngenharia de Software");
		contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_3.setBounds(0, 0, 434, 184);
		panel_2.add(contentPane_3);

		JLabel btnRGM_1 = new JLabel("RGM");
		btnRGM_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRGM_1.setBounds(10, 32, 37, 14);
		contentPane_3.add(btnRGM_1);

		JLabel btnDisciplina = new JLabel("Disciplina");
		btnDisciplina.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDisciplina.setBounds(10, 120, 59, 16);
		contentPane_3.add(btnDisciplina);

		JLabel btnSemestre = new JLabel("Semestre");
		btnSemestre.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSemestre.setBounds(10, 157, 62, 16);
		contentPane_3.add(btnSemestre);

		JLabel btnNota = new JLabel("Nota");
		btnNota.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNota.setBounds(191, 158, 46, 14);
		contentPane_3.add(btnNota);

		JLabel btnFalta = new JLabel("Falta");
		btnFalta.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFalta.setBounds(287, 158, 46, 14);
		contentPane_3.add(btnFalta);

		txtFalta = new JTextField();
		txtFalta.setColumns(10);
		txtFalta.setBounds(338, 156, 86, 20);
		contentPane_3.add(txtFalta);

		txtListar = new JTextField();
		txtListar.setBounds(60, 30, 86, 20);
		contentPane_3.add(txtListar);
		txtListar.setColumns(10);

		cmbSemestre = new JComboBox();
		cmbSemestre.setModel(new DefaultComboBoxModel(new String[] { "primeiro", "segundo" }));
		cmbSemestre.setBounds(102, 155, 77, 22);
		contentPane_3.add(cmbSemestre);

		cmbNota = new JComboBox();
		cmbNota.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
		cmbNota.setBounds(231, 155, 46, 22);
		contentPane_3.add(cmbNota);

		JPanel jpRGM = new JPanel();
		jpRGM.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpRGM.setBounds(167, 16, 96, 40);
		contentPane_3.add(jpRGM);
		jpRGM.setLayout(null);

		lblPesq1 = new JLabel("");
		lblPesq1.setBounds(10, 11, 77, 18);
		jpRGM.add(lblPesq1);
		lblPesq1.setBackground(UIManager.getColor("Button.darkShadow"));

		panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_11.setBounds(263, 16, 167, 40);
		contentPane_3.add(panel_11);
		panel_11.setLayout(null);

		lblPesq2 = new JLabel("");
		lblPesq2.setBounds(10, 11, 137, 20);
		panel_11.add(lblPesq2);

		cmbDisciplina = new JComboBox();
		cmbDisciplina.setBounds(102, 118, 322, 22);
		contentPane_3.add(cmbDisciplina);
		cmbDisciplina
				.setModel(new DefaultComboBoxModel(new String[] { "Redes", "banco de dados", "programa\u00E7ao" }));

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(54, 65, 376, 44);
		contentPane_3.add(panel_4);
		panel_4.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setLayout(null);

		lblPesq3 = new JLabel("");
		lblPesq3.setBounds(10, 11, 351, 22);
		panel_4.add(lblPesq3);
		lblPesq3.setBackground(Color.BLACK);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.setBounds(30, 16, 184, 43);
		panel_3.add(panel_5);
		panel_5.setLayout(null);

		lblRGM = new JLabel("");
		lblRGM.setBounds(0, 11, 184, 21);
		panel_5.add(lblRGM);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.setBounds(241, 16, 202, 43);
		panel_3.add(panel_6);
		panel_6.setLayout(null);

		lblNome = new JLabel("");
		lblNome.setBounds(0, 11, 202, 21);
		panel_6.add(lblNome);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_7.setBounds(30, 75, 184, 43);
		panel_3.add(panel_7);
		panel_7.setLayout(null);

		lblCurso = new JLabel("");
		lblCurso.setBounds(0, 11, 184, 21);
		panel_7.add(lblCurso);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBounds(241, 75, 203, 43);
		panel_3.add(panel_8);
		panel_8.setLayout(null);

		lblDisc = new JLabel("");
		lblDisc.setBounds(0, 11, 203, 21);
		panel_8.add(lblDisc);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_9.setBounds(30, 136, 184, 43);
		panel_3.add(panel_9);
		panel_9.setLayout(null);

		lblNota = new JLabel("");
		lblNota.setBounds(0, 11, 184, 21);
		panel_9.add(lblNota);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_10.setBounds(239, 136, 206, 43);
		panel_3.add(panel_10);
		panel_10.setLayout(null);

		lblFalta = new JLabel("");
		lblFalta.setBounds(0, 11, 202, 21);
		panel_10.add(lblFalta);
	}
}