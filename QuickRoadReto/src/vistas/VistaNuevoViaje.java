package vistas;

import javax.swing.*;
import java.awt.*;

public class VistaNuevoViaje extends JFrame {

    private JComboBox<String> comboRutas;
    private JTextField FechaSalida;
    private JTextField FechaLlegada;
    private JComboBox<String> comboEstado;
    private JTextField campoId;
    private JButton botonGuardar;
    private JButton botonCancelar;

    public VistaNuevoViaje() {
        setTitle("Nuevo Viaje");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));
        FechaLlegada = new JTextField();
        FechaSalida = new JTextField();
        
        comboRutas = new JComboBox<>(new String[]{
            "Madrid - Sevilla", 
            "Bilbao - Asturias", 
            "Barcelona - Madrid"
        });

        comboEstado = new JComboBox<>(new String[]{
            "No_Iniciado", "En_Transito", "Finalizado"
        });

        
        
        campoId = new JTextField();
        botonGuardar = new JButton("Guardar");
        botonCancelar = new JButton("Cancelar");

        add(new JLabel("ID del viaje:"));
        add(campoId);

        add(new JLabel("Ruta predeterminada:"));
        add(comboRutas);

        add(new JLabel("FechaSalida:"));
        add(FechaSalida);
        
        
        add(new JLabel("FechaLlegada:"));
        add(FechaLlegada);

        add(new JLabel("Estado:"));
        add(comboEstado);

        add(botonGuardar);
        add(botonCancelar);
    }

    public JComboBox<String> getComboRutas() {
        return comboRutas;
    }

    public JTextField getFechaSalida() {
        return FechaSalida;
    }
    public JTextField getFechaLlegada() {
        return FechaLlegada;
    }

    public JComboBox<String> getComboEstado() {
        return comboEstado;
    }

    public JTextField getCampoId() {
        return campoId;
    }

    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }
}
