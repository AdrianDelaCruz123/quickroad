package vistas;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Clases.Viaje;


public class VistaViajes extends JFrame {
    private JPanel contentPane;
    private JButton botonAtras;
    private JButton botonAñadir;
    private JList<Viaje> listaViajes;
    private DefaultListModel<Viaje> modeloLista;

    public VistaViajes() {
        setTitle("Gestión de Viajes");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        contentPane = new JPanel(new BorderLayout(10, 10));
        contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));
        setContentPane(contentPane);

        modeloLista = new DefaultListModel<>();
        listaViajes = new JList<>(modeloLista);
        JScrollPane scroll = new JScrollPane(listaViajes);
        scroll.setBorder(new TitledBorder("Lista de Viajes"));
        contentPane.add(scroll, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botonAñadir = new JButton("Añadir Viaje");
        botonAtras = new JButton("Volver");
        panelBotones.add(botonAñadir);
        panelBotones.add(botonAtras);
        contentPane.add(panelBotones, BorderLayout.SOUTH);
    }

    public JButton getBotonAtras() { return botonAtras; }
    public JButton getBotonAñadir() { return botonAñadir; }
    public DefaultListModel<Viaje> getModeloLista() { return modeloLista; }
    public JList<Viaje> getListaViajes() { return listaViajes; }
}
