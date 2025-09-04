package model;

import javax.swing.*;
import java.awt.*;

public class GestionCitas extends JFrame {

    public GestionCitas() {
        setTitle("Gestión de Citas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel lblCodigo = new JLabel("Código:");
        JTextField txtCodigo = new JTextField(15);
        JLabel lblFecha = new JLabel("Fecha:");
        JTextField txtFecha = new JTextField(15);
        JLabel lblMascota = new JLabel("Mascota:");
        JTextField txtMascota = new JTextField(15);
        JLabel lblPropietario = new JLabel("Propietario:");
        JTextField txtPropietario = new JTextField(15);
        JLabel lblVeterinario = new JLabel("Veterinario:");
        JTextField txtVeterinario = new JTextField(15);
        JLabel lblMotivo = new JLabel("Especialidad:");
        JTextArea txtMotivo = new JTextArea(3, 15);
        JScrollPane scrollMotivo = new JScrollPane(txtMotivo);

        JButton btnRegistrar = new JButton("Registrar");

        panel.add(lblCodigo);
        panel.add(txtCodigo);
        panel.add(lblFecha);
        panel.add(txtFecha);
        panel.add(lblMascota);
        panel.add(txtMascota);
        panel.add(lblPropietario);
        panel.add(txtPropietario);
        panel.add(lblVeterinario);
        panel.add(txtVeterinario);
        panel.add(lblMotivo);
        panel.add(scrollMotivo);


        JPanel panelBottom = new JPanel();
        panelBottom.add(btnRegistrar);


        add(panel, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestionCitas().setVisible(true);
        });
    }
}