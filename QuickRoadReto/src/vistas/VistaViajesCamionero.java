package vistas;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Clases.Viaje;

public class VistaViajesCamionero extends JFrame {
    private JPanel contentPane;
    private JButton botonAtras;
    private JButton botonNoIniciado;
    private JButton botonEnTransito;
    private JButton botonFinalizado;
    private JList<Viaje> listaViajes;
    private DefaultListModel<Viaje> modeloLista;

    public VistaViajesCamionero() {
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
        botonAtras = new JButton("Volver");
        botonNoIniciado = new JButton("No Iniciado");
        botonEnTransito = new JButton("En Tránsito");
        botonFinalizado = new JButton("Finalizado");

        panelBotones.add(botonNoIniciado);
        panelBotones.add(botonEnTransito);
        panelBotones.add(botonFinalizado);
        panelBotones.add(botonAtras);

        contentPane.add(panelBotones, BorderLayout.SOUTH);
    }

    public JButton getBotonAtras() { 
    	return botonAtras; 
    }
    
    public JButton getBotonNoIniciado() { 
    	return botonNoIniciado;
    }
    
    public JButton getBotonEnTransito() { 
    	return botonEnTransito;
    }
    
    public JButton getBotonFinalizado() { 
    	return botonFinalizado;
    }

    public DefaultListModel<Viaje> getModeloLista() { 
    	return modeloLista;
    }
    
    public JList<Viaje> getListaViajes() { 
    	return listaViajes; 
    }
}
