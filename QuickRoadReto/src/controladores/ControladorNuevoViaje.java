package controladores;

import Clases.Viaje;
import repositorios.RepositorioViaje;
import vistas.VistaNuevoViaje;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorNuevoViaje {
    private VistaNuevoViaje vista;

    public ControladorNuevoViaje(VistaNuevoViaje vista) {
        this.vista = vista;

        this.vista.getBotonGuardar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = vista.getCampoId().getText();
                String fechaSalida = vista.getFechaSalida().getText();
                String fechaLlegada = vista.getFechaLlegada().getText();
                String estado = (String) vista.getComboEstado().getSelectedItem();
                String ruta = (String) vista.getComboRutas().getSelectedItem();
                String[] partes = ruta.split(" - ");
                String origen = partes[0];
                String destino = partes[1];

                Viaje viaje = new Viaje(id, origen, destino, fechaSalida, fechaLlegada, estado);

                boolean exito = RepositorioViaje.insertarViaje(viaje);

                if (exito) {
                    JOptionPane.showMessageDialog(vista, "Viaje insertado correctamente.");
                    vista.dispose();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al insertar el viaje.");
                }
            }
        });

        this.vista.getBotonCancelar().addActionListener(e -> vista.dispose());
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}
