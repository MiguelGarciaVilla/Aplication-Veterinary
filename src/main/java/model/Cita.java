package model;

import java.time.LocalDate;

public class Cita {
    private String codigo;
    private LocalDate fecha;
    private double costo;
    private String hora;
    private String motivo;
    private String observaciones;
    private String estado;
    private double duracion;
    private Mascota mascota;
    private Veterinario veterinario;


    public Cita(String codigo, LocalDate fecha, double costo, String hora, String motivo, String observaciones, String estado, double duracion, Mascota mascota) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.costo = costo;
        this.hora = hora;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.duracion = duracion;
        this.mascota = mascota;
    }

    public boolean fueAtendidoPorJuanCarlos(){
        boolean resultado = false;
        if(veterinario.getNombres().equals("Juan Carlos")){
            resultado = true;
        }
        return resultado;
    }
    public boolean fueEntreEl12y20() {
        boolean resultado = false;
        LocalDate inicio = LocalDate.of(2025, 8, 12);
        LocalDate fin = LocalDate.of(2025, 8, 20);
        if(fecha.isAfter(inicio) && fecha.isBefore(fin)) {
            resultado = true;
        }
        return resultado;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
