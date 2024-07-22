package br.com.futurodev.pokedex.models;

import jakarta.persistence.*;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero;
    @Column (nullable = false, length = 100)
    private String nome;
    @Column ( length = 200)
    private String descricao;
    @Column(length = 100)
    private String imagem;
    @Column(length = 100)
    private String tipo;
    @Column(length = 100)
    private String categoria;
    @Column(length = 100)
    private String areaHabita;
    private Float altura;
    private Float peso;
}

