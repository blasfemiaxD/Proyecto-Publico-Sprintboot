package cl.crud.user.crudUser.models;

import java.util.Date;

public class PersonalInformationModel {

    private Long id;
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    private Date birthDate;
    private int rut;
    private char rutDv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaternalSurname() {
        return paternalSurname;
    }

    public void setPaternalSurname(String paternalSurname) {
        this.paternalSurname = paternalSurname;
    }

    public String getMaternalSurname() {
        return maternalSurname;
    }

    public void setMaternalSurname(String maternalSurname) {
        this.maternalSurname = maternalSurname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public char getRutDv() {
        return rutDv;
    }

    public void setRutDv(char rutDv) {
        this.rutDv = rutDv;
    }
}