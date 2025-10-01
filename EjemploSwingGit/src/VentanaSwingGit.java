import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class VentanaSwingGit extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public VentanaSwingGit() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplo Swing + Git");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menuFichero = new JMenu("File");
		barraMenu.add(menuFichero);
		
		JMenuItem itemMostrar = new JMenuItem("Mostrar");
		menuFichero.add(itemMostrar);
		JMenuItem itemLimpiar = new JMenuItem("Limpiar");
		menuFichero.add(itemLimpiar);
		JMenuItem itemSalir = new JMenuItem("Salir");
		menuFichero.add(itemSalir);
		
		JTabbedPane panelPestanas = new JTabbedPane();
		add(panelPestanas, BorderLayout.CENTER);
		
		panelPestanas.addTab("Datos Personales", new JPanel());
		panelPestanas.add("Información", new JPanel());
		panelPestanas.add("Comentarios", new JPanel());
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new VentanaSwingGit();
	}

}
