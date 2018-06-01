package ar.edu.ub.p3.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ar.edu.ub.p3.modelo.Tutoria;

public class TutoriaView extends JFrame /*implements IViewTutoriaModel*/ {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<IViewTutoriaModelListener> viewListeners;	
	private TutoriaPanel panelTutoria;
	
	private JButton btnGrabarTutoria;
	private JButton btnCargarTutoria;

	public TutoriaView(List<IViewTutoriaModelListener> viewListeners){
		this.setViewListeners(viewListeners);		
		
		this.inicializarVentana();
		
		this.agregarPaneles();

		this.setVisible(true);
	}
	
	public TutoriaView(){
		this( new LinkedList<IViewTutoriaModelListener>());
	}

	private void inicializarVentana() {
		this.setSize( 600,600);
		this.setLocation(200, 200);
		this.setResizable( false );
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void agregarPaneles() {		
		this.setPanelTutoria( new TutoriaPanel() );
		
		//Agrego los componentes
		this.add( this.getPanelTutoria(), BorderLayout.CENTER );
		this.add( this.crearPanelBotones(), BorderLayout.SOUTH );
	}

	private JPanel crearPanelBotones() {
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout( new GridLayout(1,2));
		
		//Creo el boton para grabar los cambios
		this.setBtnGrabarTutoria( new JButton("Grabar"));
		this.getBtnGrabarTutoria().addActionListener( this::onBtnGrabarTutoria );
		
		//Creo el boton para cargar los ultimos cambios
		this.setBtnCargarTutoria( new JButton("Cargar"));
		this.getBtnCargarTutoria().addActionListener( this::onBtnCargarTutoria );
		
		panelBotones.add( this.getBtnGrabarTutoria());
		panelBotones.add( this.getBtnCargarTutoria());
		
		return panelBotones;
	}
	
	private List<IViewTutoriaModelListener> getViewListeners() {
		return viewListeners;
	}

	private void setViewListeners(List<IViewTutoriaModelListener> viewListeners) {
		this.viewListeners = viewListeners;
	}

	private JButton getBtnGrabarTutoria() {
		return btnGrabarTutoria;
	}

	private void setBtnGrabarTutoria(JButton btnGrabarTutoria) {
		this.btnGrabarTutoria = btnGrabarTutoria;
	}

	public void onBtnGrabarTutoria(ActionEvent e) {
		this.updateModel();
	}
	
	public void onBtnCargarTutoria(ActionEvent e) {
		this.loadInput();
	}

	private void updateModel() {
		for( IViewTutoriaModelListener listener : this.getViewListeners() )
			listener.update( this.getPanelTutoria() );
	}
	
	private TutoriaPanel getPanelTutoria() {
		return panelTutoria;
	}

	private void setPanelTutoria(TutoriaPanel panelTutoria) {
		this.panelTutoria = panelTutoria;
	}

	private JButton getBtnCargarTutoria() {
		return btnCargarTutoria;
	}

	private void setBtnCargarTutoria(JButton btnCargarTutoria) {
		this.btnCargarTutoria = btnCargarTutoria;
	}

	public void setInput(Tutoria tutoria) {
		this.getPanelTutoria().setInput( tutoria );
		this.loadInput();			
	}

	private void loadInput() {
		this.getPanelTutoria().loadInput();					
	}


}
