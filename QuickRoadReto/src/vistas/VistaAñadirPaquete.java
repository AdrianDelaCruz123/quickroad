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

public class VistaAñadirPaquete extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton añadir;
    private JButton atras;
    private JTextField idViaje;
    private JTextField idRemitente;
    private JTextField idDestinatario;
    private JTextField descripcion;
    private JTextField peso;    
    private JTextField alto;
    private JTextField ancho;
    private JTextField fechaRecogida;
    private JTextField fechaEntrega;
    private JTextField estado;

    private JLabel lblErrorTipo; 
	
	
	
    public VistaAñadirPaquete() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel panel = new JPanel(new GridLayout(14, 2, 5, 5));
      
        
        panel.add(new JLabel("Id Viaje"));
        idViaje = new JTextField(10);
        panel.add(idViaje);
        
        panel.add(new JLabel("id Remitente"));
        idRemitente = new JTextField(10);
        panel.add(idRemitente);
        
        panel.add(new JLabel("id Destinatario"));
        idDestinatario = new JTextField(10);  
        panel.add(idDestinatario);
        
        panel.add(new JLabel("descripcion"));
        descripcion = new JTextField(10);  
        panel.add(descripcion);

        panel.add(new JLabel("peso"));
        peso = new JTextField(10);  
        panel.add(peso);
        
        panel.add(new JLabel("alto"));
        alto = new JTextField(10); 
        panel.add(alto);
        
        panel.add(new JLabel("ancho"));
        ancho = new JTextField(10);  
        panel.add(ancho);
        
        panel.add(new JLabel("fechaRecogida"));
        fechaRecogida = new JTextField(10);  
        panel.add(fechaRecogida);
        
        panel.add(new JLabel("fechaEntrega"));
        fechaEntrega = new JTextField(10);  
        panel.add(fechaEntrega);
        
        panel.add(new JLabel("Estado"));
        estado = new JTextField(10);  
        panel.add(estado);

        lblErrorTipo = new JLabel(""); 
        lblErrorTipo.setForeground(Color.RED); 
        panel.add(lblErrorTipo);

        panel.add(new JLabel("")); 
        añadir = new JButton("Añadir");
        panel.add(añadir);
        
        panel.add(new JLabel("")); // Celda vacía para mantener alineación
		atras = new JButton("Atras");
		panel.add(atras);
        
		contentPane.add(panel);

    
    }

    public void mostrarErrorTipo(String mensaje) {
        lblErrorTipo.setText(mensaje); 
    }

    
    public JTextField getIdViaje() {
        return idViaje;
    }
    
    public JTextField getFechaRecogida() {
        return fechaRecogida;
    }
    
    public JTextField getFechaEntrega() {
        return fechaEntrega;
    }
    
    public JTextField getEstado() {
        return estado;
    }

    public JTextField getIdDestinatario() {
        return idDestinatario;
    }

    public JTextField getDescripcion() {
        return descripcion;
    }

    public JTextField getPeso() {
        return peso;
    }

    public JTextField getAlto() {
        return alto;
    }

    public JTextField getAncho() {
        return ancho;
    }

    public JTextField getIdRemitente() {
        return idRemitente;
    }

    public JButton getBtnAñadir() {
        return añadir;
    }
    
    public JButton getAtras() {
        return atras;
    }
}
