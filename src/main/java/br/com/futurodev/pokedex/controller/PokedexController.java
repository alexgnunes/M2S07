package br.com.futurodev.pokedex.controller;

import br.com.futurodev.pokedex.models.Pokemon;
import br.com.futurodev.pokedex.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {

    PokedexService pokedexService;

    PokedexController(PokedexService pokedexService) {
        this.pokedexService = pokedexService;
    }

    @PostMapping
    public ResponseEntity<Pokemon> cadastrar(@RequestBody Pokemon pokemon) {
        return ResponseEntity.ok(pokedexService.cadastrar(pokemon));
    }
}

