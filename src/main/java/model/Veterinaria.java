package model;
import model.Mascota;
import java.util.ArrayList;

public class Veterinaria {

    private String nombre;
    private String ubcacion;
    private String nit;
    private ArrayList<Mascota> listaMascotas;
    private ArrayList<Cita> listaCitas;
    private ArrayList<Veterinario> listaVeterinarios;
    private ArrayList<Propietario> listaPropietarios;


    public Veterinaria(String nombre, String ubcacion, String nit, ArrayList<Mascota> listaMascotas, ArrayList<Cita> listaCitas, ArrayList<Veterinario> listaVeterinarios, ArrayList<Propietario> listaPropietarios) {
        this.nombre = nombre;
        this.ubcacion = ubcacion;
        this.nit = nit;
        this.listaMascotas = listaMascotas;
        this.listaCitas = listaCitas;
        this.listaVeterinarios = listaVeterinarios;
        this.listaPropietarios = listaPropietarios;
    }

    @Override
    public String toString() {
        return "Veterinaria Amigos Peludos\nDireccion: "+ubcacion+"\nNit: "+nit+"\nLista de mascotas: "+listaMascotas;
    }

    /**
     * Metodo que permite registrar una mascota
     * @param mascota
     * @return
     */
    public String registrarMascota(Mascota mascota){
        if(mascota.getNombre()== null || mascota.getCodigo()== null || mascota.getColor()== null || mascota.getEdad() <= 0 || mascota.getEspecie()== null || mascota.getPeso() <= 0 || mascota.getRaza() == null||mascota.getNombre().equals("") || mascota.getCodigo().equals("") || mascota.getColor().equals("") || mascota.getEspecie().equals("") || mascota.getRaza().equals("") || mascota.getColor().equalsIgnoreCase("rosa")|| mascota.getColor().equalsIgnoreCase("rosado")|| mascota.getColor().equalsIgnoreCase("azul")|| mascota.getColor().equalsIgnoreCase("verde")){
            return "Error, ha ingresado datos invalidos";
        }
        String resultado = "Mascota registrada con exito";
        Mascota mascotaEncontrada= null;
        mascotaEncontrada= buscarMascota(mascota.getCodigo());
        if(mascotaEncontrada == null){
            listaMascotas.add(mascota);
        }else{
            resultado= "La mascota con codigo "+mascota.getCodigo()+" ya esta registrada";
        }
        return resultado;
    }

    /**
     *
     * @param codigo
     * @return
     */
    public String eliminarMascota(String codigo){
        String resultado = "Mascota eliminada con exito";
        Mascota mascotaEncontrada= null;
        mascotaEncontrada= buscarMascota(codigo);
        if(mascotaEncontrada != null){
            listaMascotas.remove(mascotaEncontrada);
        }else{
            resultado= "La mascota con codigo "+codigo+" no esta registrada";
        }
        return resultado;
    }

    /**
     * Metodo para buscar una mascota
     * @param codigo
     * @return
     */
    public Mascota buscarMascota(String codigo){
        Mascota resultado = null;
        for (Mascota mascota : listaMascotas) {
            if(mascota.getCodigo().equals(codigo)){
                resultado = mascota;
                return resultado;
            }
        }
        return resultado;
    }

    /**
     * Metodo para actualizar una mascota
     * @param mascota
     * @param nombre
     * @param especie
     * @param raza
     * @param edad
     * @param color
     * @param peso
     * @return
     */
    public String actualizarMascota(Mascota mascota, String nombre, String especie, String raza, int edad, String color, double peso) {
        String resultado = "Mascota actualizada con exito";
        Mascota mascotaEncontrada = null;
        mascotaEncontrada = buscarMascota(mascota.getCodigo());
        if (mascotaEncontrada != null) {
            mascota.setNombre(nombre);
            mascota.setEspecie(especie);
            mascota.setRaza(raza);
            mascota.setEdad(edad);
            mascota.setColor(color);
            mascota.setPeso(peso);
        }else{
            resultado= "La mascota "+mascota.getNombre()+" no esta registrada";
        }
        return resultado;
    }




    public ArrayList<Mascota> getMascotas() {
        return listaMascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.listaMascotas = mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbcacion() {
        return ubcacion;
    }

    public void setUbcacion(String ubcacion) {
        this.ubcacion = ubcacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
