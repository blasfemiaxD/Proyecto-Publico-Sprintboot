package cl.crud.user.crudUser.models;

import javax.persistence.*;

@Entity               //Es un modelo real
@Table(name = "user") //cambio el nombre de la tablasss
public class UserModel {

    @Id                                                 // Es un ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se genera automaticamente y se auto incrementa
    @Column(unique = true, nullable = false)            //Es unico y no nulo*/
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}