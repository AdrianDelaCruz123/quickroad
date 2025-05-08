package vistas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VerificarDni extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton insertar;
    private JButton atras;
    private JTextField dni;
    private JLabel lblErrorTipo; 
	
	
	
    public VerificarDni() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        
        lblErrorTipo = new JLabel(""); 
        lblErrorTipo.setForeground(Color.RED); 
        panel.add(lblErrorTipo);
        
        panel.add(new JLabel("Dni"));
        dni = new JTextField(10);  
        panel.add(dni);
        
        panel.add(new JLabel("")); 
        insertar = new JButton("Registrar");
        panel.add(insertar);
        
        panel.add(new JLabel("")); // Celda vacía para mantener alineación
		atras = new JButton("Atras");
		panel.add(atras);
        
		contentPane.add(panel);

    
    }

    public void mostrarErrorTipo(String mensaje) {
        lblErrorTipo.setText(mensaje); 
    }

    public JTextField getTxtDni() {
        return dni;
    }
    public JButton getAtras() {
        return atras;
    }
}
