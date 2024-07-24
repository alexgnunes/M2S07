package br.com.futurodev.pokedex.dao;

import br.com.futurodev.pokedex.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokedexRepository extends JpaRepository<Pokemon, Long> {
}
