package uniandes.dpoo.taller4.modelo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelbotones extends JPanel{
	private JLabel lbN1;
	private JTextField txtN1;
	private JLabel lbN2;
	private JTextField txtN2;
	private JButton btnReiniciar;
	private JButton btnVertop10;
	private JButton btnNuevo ;
	private interfaz interfa; 
	
	public panelbotones (interfaz padre) {
		interfa = padre;
		setBorder(new TitledBorder("Entradas"));
		setPreferredSize(new Dimension(600, 200));
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		lbN1 = new JLabel("Num 1");
		txtN1 = new JTextField();
		
		lbN2 = new JLabel("Num 2");
		txtN2 = new JTextField();
		
		
		JPanel auxN = new JPanel();
		auxN.setLayout(new BorderLayout());
		auxN.setPreferredSize(new Dimension(10,20));
		auxN.add(lbN1, BorderLayout.WEST);
		auxN.add(txtN1,BorderLayout.CENTER);
		
		JPanel auxC = new JPanel();
		auxC.setLayout(new BorderLayout());
		auxC.add(lbN2,BorderLayout.WEST);
		auxC.add(txtN2,BorderLayout.CENTER);
		
		
		btnReiniciar = new JButton("reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 interfa.reiniciar();
			}
		});
		btnVertop10 = new JButton("btnVertop10");
		btnVertop10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("btnVertop10");
			}
		});
		
		btnNuevo = new JButton("me rindo");
		btnNuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				interfa.nuevo();
			}
		});
		JPanel auxS = new JPanel();
		auxS.setLayout(new FlowLayout());
		auxS.add(btnReiniciar);
		auxS.add(btnVertop10);
		auxS.add(btnNuevo);
		
		add(auxN, BorderLayout.WEST);
		add(auxC, BorderLayout.CENTER);
		add(auxS, BorderLayout.SOUTH);
	}
}
