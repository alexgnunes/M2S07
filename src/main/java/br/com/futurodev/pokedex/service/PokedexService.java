package br.com.futurodev.pokedex.service;

import br.com.futurodev.pokedex.models.Pokemon;

import java.util.Optional;

public interface PokedexService {

    Pokemon cadastrar(Pokemon pokemon);

    Optional<Pokemon> atualizar(Long numero, Pokemon pokemon);

    boolean deletar(Long numero);

    Optional<Pokemon> buscarPorNumero(Long numero);
}
