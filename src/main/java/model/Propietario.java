package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Propietario {
    private String nombres;
    private String identificacion;
    private String telefono;
    private String direccion;
    private ArrayList<Mascota> mascotas;

    public Propietario(String nombres, String identificacion, String telefono, String direccion, ArrayList<Mascota> mascotas) {
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
