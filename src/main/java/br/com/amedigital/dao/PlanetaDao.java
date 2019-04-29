package br.com.amedigital.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.amedigital.entidade.Planeta;

public interface PlanetaDao extends JpaRepository<Planeta, Integer> {

	@Query("FROM Planeta p")
	Page<Planeta> listar(Pageable pageable);

	List<Optional<Planeta>> findByIdOrNome(Integer id, String nome);
}
