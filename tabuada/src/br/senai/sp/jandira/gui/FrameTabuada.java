package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;
	
	
	public Color corPainel = new Color(225, 225, 225 );
	public Color corLabel = new Color(121, 121, 121);
	public Color corDoBotaoC = new Color(124, 194, 130);
	public Color corDoBotaoL = new Color(251, 196, 68 );
	public Color corResultado = new Color(253, 238, 234);
	public Color corDoTitulo = new Color(210, 129, 117);
	public Font fontTitulo = new Font("arial", Font.BOLD, 14);
	public Font fontResult = new Font("SansSerif", Font.PLAIN, 19);
	
	
	
	// config de tela
	
	public void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
	// componentes de tela
		
		Container painel = tela.getContentPane();
				
		JLabel labelTabuada = new JLabel();
		Font fonteTabuada = new Font("SansSerif", Font.BOLD, 28);
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(110, 20, 210, 30);
		labelTabuada.setForeground(corDoTitulo);
		labelTabuada.setFont(fonteTabuada);
		
		//icone
		
		ImageIcon icon = new ImageIcon("C:/Users/22282222/eclipse-workspace/tabuada/tabuada/src/br/senai/sp/jandira/model/contabilidade64.png");
		JLabel icone = new JLabel(icon);
		icone.setBounds(20,20,80,80);
		
		//subtitulo
		
		JTextArea labelSubtitulo= new JTextArea();
		Font labelTexto = new Font("SansSerif", Font.ROMAN_BASELINE, 12);
		labelSubtitulo.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule"
		+ "a tabuada que desejar em segundos!");
		labelSubtitulo.setBounds(110, 50, 330, 35);;
		labelSubtitulo.setForeground(Color.GRAY);
		labelSubtitulo.setEditable(false);
		labelSubtitulo.setOpaque(false);
		labelSubtitulo.setLineWrap(true);
		labelSubtitulo.setFont(labelTexto);
		
		//mostrar multiplicando
		JLabel labelMultiplicando = new JLabel();
		Font multiplicandoII = new Font("SansSerif", Font.PLAIN, 14);
		labelMultiplicando.setBounds(30, 120, 200, 35);
		labelMultiplicando.setHorizontalAlignment(JLabel.RIGHT);
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(multiplicandoII);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(250, 120, 200, 35);
		textFieldMultiplicando.setBorder(BorderFactory.createLineBorder(Color.black));
		textFieldMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		//mostrar minimo multiplicador
		
		JLabel labelMinimo = new  JLabel();
		Font minimiF = new Font("SansSerif", Font.PLAIN, 14);
		labelMinimo.setText("Minímo Multiplicador:");
		labelMinimo.setHorizontalAlignment(JLabel.RIGHT);
		labelMinimo.setBounds(30, 160, 200, 35);
		labelMinimo.setFont(minimiF);
		
	
		JTextField textFieldMinimo = new JTextField();
		textFieldMinimo.setBounds(250, 160, 200, 35);
		textFieldMinimo.setBorder(BorderFactory.createLineBorder(Color.black));
		textFieldMinimo.setHorizontalAlignment(JTextField.RIGHT);
		
		
		//mostar maximo multiplicador
		JLabel labelMaximo = new JLabel();
		Font maxF = new Font("SansSerif",Font.PLAIN	, 14);
		labelMaximo.setText("Maxímo Multiplicador:");
		labelMaximo.setHorizontalAlignment(JLabel.RIGHT);
		labelMaximo.setBounds(30, 200, 200, 35);
		labelMaximo.setFont(maxF);
		

		JTextField textFieldMax = new JTextField();
		textFieldMax.setBounds(250, 200, 200, 35);
		textFieldMax.setBorder(BorderFactory.createLineBorder(Color.black));
		textFieldMax.setHorizontalAlignment(JTextField.RIGHT);
		
		//Botao Calcular

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(120, 262, 171, 35);
		buttonCalcular.setForeground(Color.white);
		Color corDoBotao = new Color(00, 130,00);
		buttonCalcular.setBackground(corDoBotao);
		
		//botao limpar

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(300, 262, 150, 35);
		buttonLimpar.setForeground(Color.white);
		buttonLimpar.setBackground(corDoBotaoL);

		// resultado
		JLabel labelResult = new JLabel();
		labelResult.setText("Resultado:");
		labelResult.setBounds(70, 342, 600, 30);
		labelResult.setForeground(Color.black);
		labelResult.setFont(new Font("Arial", Font.BOLD, 13));
		
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(60, 390, 400, 220);
		JList<String> listLista = new JList<>();
		listLista.setBackground(new Color(253, 238, 234));
		listLista.setFont(fontResult);
		
		//mostrar na tela 
		painel.add(labelTabuada);
		painel.add(labelSubtitulo);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimo);
		painel.add(textFieldMinimo);
		painel.add(textFieldMax);
		painel.add(labelMaximo);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResult);
		painel.add(listLista);
		painel.add(scroll);
		painel.add(icone);
		
		
	
		tela.setVisible(true);
		 
		 buttonCalcular.addActionListener(new ActionListener() {
			 
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if (textFieldMultiplicando.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "O multiplicando é obrigatório!");
						textFieldMultiplicando.requestFocus();
					} else if (textFieldMinimo.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "O mínimo multiplicador é obrigatório!");
						textFieldMinimo.requestFocus();
					} else if (textFieldMax.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "O máximo multiplicador é obrigatório!");
						textFieldMax.requestFocus();
					} else if(Integer.parseInt(textFieldMultiplicando.getText()) > 1000 || Integer.parseInt(textFieldMinimo.getText()) > 1000 || Integer.parseInt(textFieldMax.getText()) > 1000) {
						JOptionPane.showMessageDialog(null, "Os valores devem ser menor ou igual a 1000!", "ERRO", JOptionPane.OK_OPTION);
					} else {
						
						Tabuada tabuada = new Tabuada();
						tabuada.multiplicado = Integer.parseInt(textFieldMultiplicando.getText());
						tabuada.minMultiplicador = Integer.parseInt(textFieldMinimo.getText());
						tabuada.maxMultiplicador = Integer.parseInt(textFieldMax.getText());
						if(tabuada.maxMultiplicador < tabuada.minMultiplicador) {
							JOptionPane.showMessageDialog(null, "Multiplicador mínimo maior que o máximo", "ERRO", JOptionPane.OK_OPTION);
							textFieldMultiplicando.setText("");
							textFieldMinimo.setText("");
							textFieldMax.setText("");
						} else {
							
							listLista.setListData(tabuada.getTabuada());
							scroll.getViewport().add(listLista);
							
						}
					}
					


				}
			});
		 
		 	buttonLimpar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					textFieldMultiplicando.setText(null);
					textFieldMinimo.setText(null);
					textFieldMax.setText(null);

					DefaultListModel<String> lista = new DefaultListModel<>();
					listLista.setModel(lista);
					
				}
			});
					
					
				}

		 
	}



