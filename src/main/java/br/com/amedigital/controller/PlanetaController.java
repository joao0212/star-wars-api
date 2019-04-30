package br.com.amedigital.controller;

import java.util.List;
import java.util.Optional;

import javax.naming.ServiceUnavailableException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.amedigital.dao.PlanetaApiDao;
import br.com.amedigital.dao.PlanetaDao;
import br.com.amedigital.entidade.Planeta;
import br.com.amedigital.entidade.PlanetaApi;
import br.com.amedigital.service.PlanetaService;

@RestController
@RequestMapping("/planetas")
public class PlanetaController {

	@Autowired
	private PlanetaService planetaService;

	@Autowired
	private PlanetaDao planetaDao;

	@Autowired
	private PlanetaApiDao planetaApiDao;

	@GetMapping
	public Page<Planeta> listar(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
			@RequestParam(value = "size", required = false, defaultValue = "5") int size) {
		return planetaService.listar(page, size);
	}

	@GetMapping("/planeta")
	public List<Optional<Planeta>> buscarPorIdOuPorNome(@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "id", required = false) Integer id) {
		return planetaDao.findByIdOrNome(id, nome);
	}

	@GetMapping("/api")
	public List<PlanetaApi> listarPlanetasApi() throws ServiceUnavailableException {
		List<PlanetaApi> planetasApi = planetaApiDao.listar().getBody().getResults();
		return planetasApi;
	}

	@PostMapping
	public Planeta adicionar(@RequestBody Planeta planeta) {
		return planetaDao.save(planeta);
	}

	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		planetaDao.deleteById(id);
	}
}
