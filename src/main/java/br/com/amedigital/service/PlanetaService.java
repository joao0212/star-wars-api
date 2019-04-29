package br.com.amedigital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import br.com.amedigital.dao.PlanetaDao;
import br.com.amedigital.entidade.Planeta;

@Service
public class PlanetaService {

	@Autowired
	private PlanetaDao planetaDao;

	public Page<Planeta> listar(int page, int size) {
		PageRequest pageRequest = PageRequest.of(page, size);
		return planetaDao.listar(pageRequest);
	}
}
