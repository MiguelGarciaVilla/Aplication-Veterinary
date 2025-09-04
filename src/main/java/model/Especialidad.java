package model;

public class Especialidad {
    private Integer medicinaInterna;
    private Integer cirugia;
    private Integer dematologia;


    public Especialidad(Integer medicinaInterna, Integer cirugia, Integer dematologia) {
        this.medicinaInterna = medicinaInterna;
        this.cirugia = cirugia;
        this.dematologia = dematologia;
    }

    public Integer getMedicinaInterna() {
        return medicinaInterna;
    }

    public void setMedicinaInterna(Integer medicinaInterna) {
        this.medicinaInterna = medicinaInterna;
    }

    public Integer getCirugia() {
        return cirugia;
    }

    public void setCirugia(Integer cirugia) {
        this.cirugia = cirugia;
    }

    public Integer getDematologia() {
        return dematologia;
    }

    public void setDematologia(Integer dematologia) {
        this.dematologia = dematologia;
    }
}
