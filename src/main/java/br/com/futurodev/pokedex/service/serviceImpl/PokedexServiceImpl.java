package br.com.futurodev.pokedex.service.serviceImpl;

import br.com.futurodev.pokedex.dao.PokedexRepository;
import br.com.futurodev.pokedex.models.Pokemon;
import br.com.futurodev.pokedex.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokedexServiceImpl implements PokedexService {

    PokedexRepository pokedexRepository;

    PokedexServiceImpl(PokedexRepository pokedexRepository) {
        this.pokedexRepository = pokedexRepository;
    }

    @Override
    public Pokemon cadastrar(Pokemon pokemon) {
        return pokedexRepository.save(pokemon);
    }
}
