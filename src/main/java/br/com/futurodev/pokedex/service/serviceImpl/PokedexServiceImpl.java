package br.com.futurodev.pokedex.service.serviceImpl;

import br.com.futurodev.pokedex.dao.PokedexRepository;
import br.com.futurodev.pokedex.models.Pokemon;
import br.com.futurodev.pokedex.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokedexServiceImpl implements PokedexService {

    PokedexRepository pokedexRepository;

    PokedexServiceImpl(PokedexRepository pokedexRepository) {
        this.pokedexRepository = pokedexRepository;
    }

    @Override
    public Pokemon cadastrar(Pokemon pokemon) {
        return this.pokedexRepository.save(pokemon);
    }

    @Override
    public Optional<Pokemon> atualizar(Long numero, Pokemon pokemon) {
        Optional<Pokemon> response = this.pokedexRepository.findById(numero);
        if(response.isPresent()){
            response.get().atualizarPokemon(pokemon);
            return Optional.of(pokedexRepository.save(response.get()));
        }
        return Optional.empty();
    }

    @Override
    public boolean deletar(Long numero) {
        Optional<Pokemon> response = this.pokedexRepository.findById(numero);
        if(response.isPresent()) {
            pokedexRepository.deleteById(numero);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Optional<Pokemon> buscarPorNumero(Long numero) {
        return this.pokedexRepository.findById(numero);
    }

    @Override
    public List<Pokemon> listar() {
        return this.pokedexRepository.findAll();
    }

}
