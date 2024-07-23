package br.com.futurodev.pokedex.models;

import jakarta.persistence.*;

import java.util.Objects;

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

    public Pokemon(Integer numero, String nome, String descricao, String imagem, String tipo, String categoria, String areaHabita, Float altura, Float peso) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.tipo = tipo;
        this.categoria = categoria;
        this.areaHabita = areaHabita;
        this.altura = altura;
        this.peso = peso;
    }

    public Pokemon() {

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAreaHabita() {
        return areaHabita;
    }

    public void setAreaHabita(String areaHabita) {
        this.areaHabita = areaHabita;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(numero, pokemon.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", imagem='" + imagem + '\'' +
                ", tipo='" + tipo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", areaHabita='" + areaHabita + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}

