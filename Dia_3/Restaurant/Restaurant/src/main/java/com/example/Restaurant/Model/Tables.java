package com.example.Restaurant.Model;

import jakarta.persistence.*;

@Entity
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true)
    private int numero_mesa;

    private boolean ocupada;

    public Tables(){}

    public Tables(int id, int numero_mesa, Boolean ocupada){
        this.id = id;
        this.numero_mesa = numero_mesa;
        this.ocupada = ocupada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_mesa() {
        return numero_mesa;
    }

    public void setNumero_mesa(int numero_mesa) {
        this.numero_mesa = numero_mesa;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }
}
