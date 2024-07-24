package br.com.futurodev.pokedex.controller;

import br.com.futurodev.pokedex.models.Pokemon;
import br.com.futurodev.pokedex.service.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<Pokemon> atualizar(@PathVariable ("id") Long numero, @RequestBody Pokemon pokemon) {
        Optional<Pokemon> response = pokedexService.atualizar(numero, pokemon);
        return response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pokemon> deletar(@PathVariable ("id") Long numero) {
         return pokedexService.deletar(numero) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}

