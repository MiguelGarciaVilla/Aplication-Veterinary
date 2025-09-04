package model;

import java.util.ArrayList;

public class Veterinario {
    private String nombres;
    private String identificacion;
    private String targetaProfesional;
    private int añosExperiencia;
    private String telefono;
    private String correo;
    private Especialidad especialidad;
    private ArrayList<Cita> citas;

    public Veterinario(String nombres, String identificacion, String targetaProfesional, int añosExperiencia, String telefono, String correo, Especialidad especialidad, ArrayList<Cita> citas) {
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.targetaProfesional = targetaProfesional;
        this.añosExperiencia = añosExperiencia;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = especialidad;
        this.citas = citas;
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

    public String getTargetaProfesional() {
        return targetaProfesional;
    }

    public void setTargetaProfesional(String targetaProfesional) {
        this.targetaProfesional = targetaProfesional;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
}
