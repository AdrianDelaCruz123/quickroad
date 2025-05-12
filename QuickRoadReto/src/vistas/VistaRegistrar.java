package vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
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
        setTitle("Registro de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(11, 2, 10, 10));  

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblUsuario);

        usuario = new JTextField(10);
        usuario.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(usuario);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblApellido);

        apellido = new JTextField(10);
        apellido.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(apellido);

        JLabel lblDni = new JLabel("DNI");
        lblDni.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblDni);

        dni = new JTextField(10);
        dni.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(dni);

        JLabel lblTelefono = new JLabel("Teléfono");
        lblTelefono.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblTelefono);

        telefono = new JTextField(10);
        telefono.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(telefono);

        JLabel lblDireccion = new JLabel("Dirección");
        lblDireccion.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblDireccion);

        direccion = new JTextField(10);
        direccion.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(direccion);

        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblTipo);

        tipo = new JTextField(10);
        tipo.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(tipo);

        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblContraseña);

        password = new JPasswordField(10);
        password.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(password);

        lblErrorTipo = new JLabel(""); 
        lblErrorTipo.setFont(new Font("Arial", Font.PLAIN, 12));
        lblErrorTipo.setForeground(Color.RED);
        contentPane.add(lblErrorTipo);

        registrar = new JButton("Registrar");
        registrar.setFont(new Font("Arial", Font.BOLD, 14));
        registrar.setBackground(new Color(34, 139, 34));  
        registrar.setForeground(Color.WHITE);
        registrar.setFocusPainted(false);
        contentPane.add(registrar);

        atras = new JButton("Atrás");
        atras.setFont(new Font("Arial", Font.BOLD, 14));
        atras.setBackground(new Color(70, 130, 180));  
        atras.setForeground(Color.WHITE);
        atras.setFocusPainted(false);
        contentPane.add(atras);
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
