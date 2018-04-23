package ihm;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Application extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JSplitPane splitPane = new JSplitPane();
	private JButton btnLoiExponentielle;
	private JPanel panel_information;
	private JPanel panel_titre;
	private JPanel panel_bouton;
	private JButton btnLoiUniforme;
	private JButton btnLoiNormale;
	private JButton btnLoiPoisson;
	private JLabel lblTitre;
	private JPanel panel_khi2;
	private JLabel lblKhi;
	private JTextField textField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
	      public void run(){
	        try{
	          Application frame = new Application();
	          frame.setVisible(true);
	        } catch (Exception e) {
	          e.printStackTrace();
	        }
	      }
	    });
	}
	
	public Application() {
		setDefaultCloseOperation(3);
	    setBounds(100, 100, 779, 522);
	    setTitle("Vérification de la fonction random de la librairie Java Math");
	    this.contentPane = new JPanel();
	    this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(this.contentPane);
	    this.contentPane.setLayout(new BorderLayout(0, 0));
	    
	    this.panel_information = new JPanel();
	    this.contentPane.add(this.panel_information, "North");
	    this.panel_information.setLayout(new BorderLayout(0, 0));
	    
	    this.panel_titre = new JPanel();
	    this.panel_information.add(this.panel_titre, "North");
	    
	    this.lblTitre = new JLabel("Tester les lois");
	    this.lblTitre.setFont(new Font("Tahoma", 0, 18));
	    this.panel_titre.add(this.lblTitre);
	    
	    this.panel_bouton = new JPanel();
	    this.panel_information.add(this.panel_bouton, "Center");
	    
	    this.btnLoiExponentielle = new JButton("Loi exponentielle");
	    this.panel_bouton.add(this.btnLoiExponentielle);
	    this.btnLoiExponentielle.addActionListener(this);
	    
	    this.btnLoiUniforme = new JButton("Loi uniforme");
	    this.panel_bouton.add(this.btnLoiUniforme);
	    this.btnLoiUniforme.addActionListener(this);
	    
	    this.btnLoiNormale = new JButton("Loi normale");
	    this.panel_bouton.add(this.btnLoiNormale);
	    this.btnLoiNormale.addActionListener(this);
	    
	    this.btnLoiPoisson = new JButton("Loi de poisson");
	    this.panel_bouton.add(this.btnLoiPoisson);
	    this.btnLoiPoisson.addActionListener(this);
	    
	    this.panel_khi2 = new JPanel();
	    this.panel_information.add(this.panel_khi2, "South");
	    
	    this.lblKhi = new JLabel("Khi2 = ");
	    this.panel_khi2.add(this.lblKhi);
	    

	    this.textField = new JTextField();
	    this.panel_khi2.add(this.textField);
	    this.textField.setEditable(false);
	    this.textField.setColumns(10);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
