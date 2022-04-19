package uniandes.dpoo.taller4.modelo;

import java.util.Collection;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class paneltop10 extends JList{			
	
	private Top10 top10;
	DefaultListModel<String> modelo = new DefaultListModel<>();
	
	public paneltop10 (Top10 toplista) {
		top10 = toplista;
		Collection<RegistroTop10> registro = top10.darRegistros();
		for (Iterator<RegistroTop10> iterator = registro.iterator(); iterator.hasNext();) {
			modelo.addElement(iterator.toString());
		}
	}

	

}
