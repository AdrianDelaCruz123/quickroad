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

public class VistaRegistrar extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton registrar;
    private JButton atras;
    private JTextField usuario;
    private JPasswordField password;
    private JTextField apellido;
    private JTextField dni;
    private JTextField telefono;    
    private JTextField direccion;
    private JTextField tipo;
    private JLabel lblErrorTipo; 
	
	
	
    public VistaRegistrar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel panel = new JPanel(new GridLayout(10, 2, 5, 5));
      
        
        panel.add(new JLabel("Usuario"));
        usuario = new JTextField(10);
        panel.add(usuario);
        
        panel.add(new JLabel("Apellido"));
        apellido = new JTextField(10);  
        panel.add(apellido);
        
        panel.add(new JLabel("Dni"));
        dni = new JTextField(10);  
        panel.add(dni);

        panel.add(new JLabel("Telefono"));
        telefono = new JTextField(10);  
        panel.add(telefono);
        
        panel.add(new JLabel("Direccion"));
        direccion = new JTextField(10); 
        panel.add(direccion);
        
        panel.add(new JLabel("Tipo"));
        tipo = new JTextField(10);  
        panel.add(tipo);

        panel.add(new JLabel("Contraseña"));
        password = new JPasswordField(10);
        panel.add(password);
        
        lblErrorTipo = new JLabel(""); 
        lblErrorTipo.setForeground(Color.RED); 
        panel.add(lblErrorTipo);

        panel.add(new JLabel("")); 
        registrar = new JButton("Registrar");
        panel.add(registrar);
        
        panel.add(new JLabel("")); // Celda vacía para mantener alineación
		atras = new JButton("Atras");
		panel.add(atras);
        
		contentPane.add(panel);

    
    }

    public void mostrarErrorTipo(String mensaje) {
        lblErrorTipo.setText(mensaje); 
    }

    public JTextField getTxtUsuario() {
        return usuario;
    }

    public JTextField getTxtApellido() {
        return apellido;
    }

    public JTextField getTxtDni() {
        return dni;
    }

    public JTextField getTxtTelefono() {
        return telefono;
    }

    public JTextField getTxtDireccion() {
        return direccion;
    }

    public JTextField getTxtTipo() {
        return tipo;
    }

    public JPasswordField getTxtContraseña() {
        return password;
    }

    public JButton getBtnRegistrar() {
        return registrar;
    }
    
    public JButton getAtras() {
        return atras;
    }
}
