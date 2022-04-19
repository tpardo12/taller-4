package uniandes.dpoo.taller4.modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class paneltablero extends JPanel implements MouseListener {
	
	private Tablero tab;
	private int tamanio = 7;
	private boolean[][] tablero;
	private int dificultad = 2;
	
	
	public paneltablero() {
		addMouseListener(this);
		setBorder(new TitledBorder("Entradas"));
		tab = new Tablero(tamanio);
		setPreferredSize(new Dimension(400,400));
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		tablero = tab.darTablero();
		tab.desordenar(dificultad);
		
		
	}
	
	

	public void reiniciar() {
		
		tab.reiniciar();
		repaint();
	}
	
	public void nuevo() {
		
		tab = new Tablero(tamanio);
		tablero = tab.darTablero();
		tab.desordenar(dificultad);
		repaint();
	}
	
	private int[] convertirCoordenadasACasilla(int x, int y)
	{
		int ladoTablero = tablero.length;
		int altoPanelTablero = getHeight();
		int anchoPanelTablero = getWidth();
		int altoCasilla = altoPanelTablero / ladoTablero;
		int anchoCasilla = anchoPanelTablero / ladoTablero;
		int fila = (int) (y / altoCasilla);
		int columna = (int) (x / anchoCasilla);
		
		System.out.print(fila);
		System.out.print(columna);
		return new int[] { fila, columna };
	}
	
	

	
	   public void paint(Graphics g){
		   super.paint(g);
		   int posfila = 0;
		   int columna = 0;
		  
		
		   Graphics2D g2d = (Graphics2D) g;
		   
	
		   for (int selector  = 0; selector < tamanio ;  selector ++) {
			  if (selector != 0) {
				  posfila += 400/tamanio ;
			  }
			  columna = 0;
		
			   for (int selector2  = 0; selector2 < tamanio ;  selector2 ++) {
				   if (selector2 != 0) {
					   columna += 400/tamanio ;
				   }
				 
				   RoundRectangle2D.Double rectangle = new RoundRectangle2D.Double(columna,posfila,400/tamanio,400/tamanio,10,10);
				   g2d.draw(rectangle);
				   System.out.print(tablero[selector][selector2]);
				   
	               if (tablero[selector][selector2] == true) {
	            	  
	          
	            	   g2d.setColor(new Color(0,0,0)); 
				   }
	               else {
	            	   
	            	   g2d.setColor(new Color (255,227,29)); 
	               }
	               g2d.fill(rectangle);
				
			   }
		   }
	   }







	@Override
	public void mouseClicked(MouseEvent e) {

		
	}







	@Override
	public void mousePressed(MouseEvent e) {
		
		int click_x = e.getX();
		int click_y = e.getY();
		int[] casilla = convertirCoordenadasACasilla(click_x, click_y);
		tab.jugar(casilla[0], casilla[1]);
		repaint();
	}







	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	   
}
