package br.com.futurodev.pokedex.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;
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

    public void atualizarPokemon(Pokemon pokemon){
       this.nome =  pokemon.nome != null ? pokemon.nome : this.nome;
       this.descricao = pokemon.descricao != null ? pokemon.descricao : this.descricao;
       this.imagem = pokemon.imagem != null ? pokemon.imagem : this.imagem;
       this.tipo = pokemon.tipo!= null ? pokemon.tipo : this.tipo;
       this.categoria = pokemon.categoria != null ? pokemon.categoria : this.categoria;
       this.areaHabita = pokemon.areaHabita != null ? pokemon.areaHabita : this.areaHabita;
       this.altura = pokemon.altura != null ? pokemon.altura : this.altura;
       this.peso = pokemon.peso != null ? pokemon.peso : this.peso;
    }
}

