package vistas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton iniciarsesion;
    private JButton registrar;
    private JButton botonRenueve;
    private JButton botonBaja;
    private JTextField usuario;
    private JPasswordField password;

    public JButton getBotonBaja() {
        return botonBaja;
    }

    public JButton getBotonRenueve() {
        return botonRenueve;
    }

    public JButton getIniciarSesion() {
        return iniciarsesion;
    }
    
    public JButton getRegistrar() {
        return registrar;
    }

    public JTextField getTxtUsuario() {
        return usuario;
    }

    public JPasswordField getTxtContraseña() {
        return password;
    }

    public VistaLogin() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 200, 450, 350);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));  // Borde alrededor del contenido
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Espaciado entre los componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Etiqueta de Usuario
        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        contentPane.add(lblUsuario, gbc);

        // Campo de texto Usuario
        usuario = new JTextField(20);
        usuario.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPane.add(usuario, gbc);

        // Etiqueta de Contraseña
        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPane.add(lblContraseña, gbc);

        // Campo de texto Contraseña
        password = new JPasswordField(20);
        password.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(password, gbc);

        // Botón Iniciar Sesión
        iniciarsesion = new JButton("Iniciar Sesión");
        iniciarsesion.setFont(new Font("Arial", Font.BOLD, 14));
        iniciarsesion.setBackground(new Color(34, 139, 34));  // Color verde
        iniciarsesion.setForeground(Color.WHITE);
        iniciarsesion.setFocusPainted(false);  // Quitar borde al hacer clic
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        contentPane.add(iniciarsesion, gbc);

        // Botón Registrar
        registrar = new JButton("Registrar");
        registrar.setFont(new Font("Arial", Font.BOLD, 14));
        registrar.setBackground(new Color(70, 130, 180));  // Color azul
        registrar.setForeground(Color.WHITE);
        registrar.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        contentPane.add(registrar, gbc);

        // Botón "He olvidado mi sesión"
        botonRenueve = new JButton("He olvidado mi sesión");
        botonRenueve.setFont(new Font("Arial", Font.PLAIN, 12));
        botonRenueve.setForeground(Color.BLUE);
        botonRenueve.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        contentPane.add(botonRenueve, gbc);

        // Botón Dar de Baja
        botonBaja = new JButton("Dar de baja");
        botonBaja.setFont(new Font("Arial", Font.PLAIN, 12));
        botonBaja.setForeground(Color.RED);
        botonBaja.setFocusPainted(false);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        contentPane.add(botonBaja, gbc);

        // Fondo y bordes
        contentPane.setBackground(new Color(255, 255, 255));  // Fondo blanco
    }

}
