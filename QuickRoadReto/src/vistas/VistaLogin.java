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
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));  
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets(10, 10, 10, 10);  
        grid.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel Usuario = new JLabel("Usuario");
        Usuario.setFont(new Font("Arial", Font.BOLD, 14));
        grid.gridx = 0;
        grid.gridy = 0;
        grid.gridwidth = 1;
        contentPane.add(Usuario, grid);

        usuario = new JTextField(20);
        usuario.setFont(new Font("Arial", Font.PLAIN, 14));
        grid.gridx = 1;
        grid.gridy = 0;
        contentPane.add(usuario, grid);

        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setFont(new Font("Arial", Font.BOLD, 14));
        grid.gridx = 0;
        grid.gridy = 1;
        contentPane.add(lblContraseña, grid);

        password = new JPasswordField(20);
        password.setFont(new Font("Arial", Font.PLAIN, 14));
        grid.gridx = 1;
        grid.gridy = 1;
        contentPane.add(password, grid);

        iniciarsesion = new JButton("Iniciar Sesión");
        iniciarsesion.setFont(new Font("Arial", Font.BOLD, 14));
        iniciarsesion.setBackground(new Color(34, 139, 34));  
        iniciarsesion.setForeground(Color.WHITE);
        iniciarsesion.setFocusPainted(false);  
        grid.gridx = 0;
        grid.gridy = 2;
        grid.gridwidth = 2;
        contentPane.add(iniciarsesion, grid);

        registrar = new JButton("Registrar");
        registrar.setFont(new Font("Arial", Font.BOLD, 14));
        registrar.setBackground(new Color(70, 130, 180));  
        registrar.setForeground(Color.WHITE);
        registrar.setFocusPainted(false);
        grid.gridx = 0;
        grid.gridy = 3;
        grid.gridwidth = 2;
        contentPane.add(registrar, grid);

        botonRenueve = new JButton("He olvidado mi sesión");
        botonRenueve.setFont(new Font("Arial", Font.PLAIN, 12));
        botonRenueve.setForeground(Color.BLUE);
        botonRenueve.setFocusPainted(false);
        grid.gridx = 0;
        grid.gridy = 4;
        grid.gridwidth = 2;
        contentPane.add(botonRenueve, grid);

        botonBaja = new JButton("Dar de baja");
        botonBaja.setFont(new Font("Arial", Font.PLAIN, 12));
        botonBaja.setForeground(Color.RED);
        botonBaja.setFocusPainted(false);
        grid.gridx = 0;
        grid.gridy = 5;
        grid.gridwidth = 2;
        contentPane.add(botonBaja, grid);

        contentPane.setBackground(new Color(255, 255, 255)); 
        setContentPane(contentPane);

    }

}
