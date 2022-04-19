package uniandes.dpoo.taller4.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class interfaz extends JFrame{
	
	private Tablero tab;
	private int tamanio;
	private paneltablero paneltab;
	private panelbotones panelbot;
	
	public interfaz() {
		
		tab = new Tablero(tamanio);
		paneltab = new paneltablero();
		panelbot = new panelbotones(this);
		setTitle("lights out");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(new Dimension(700,700));
		setLayout(new FlowLayout());
		setResizable(false);
		setVisible(true);
		setBackground(new Color(13,17,23 ));
		add(paneltab);
		add(panelbot);
		
		
	}
	
	
	public static void main(String[] args) {
		new interfaz();
	}
	
	public void reiniciar() {
		paneltab.reiniciar();
	}
	public void nuevo() {
		paneltab.nuevo();
	}
	
	
	
	

}
