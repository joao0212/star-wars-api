package br.com.amedigital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.amedigital.dao.PlanetaDao;
import br.com.amedigital.entidade.Planeta;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StarWarsApiApplicationTests {

	private PlanetaDao planetaDaoMock;

	@Test
	public void testarMetodosDeBuscaELista() {
		planetaDaoMock = mock(PlanetaDao.class);
		Optional<Planeta> planetaSalvo = planetaDaoMock.findById(50);
		if(planetaSalvo.isPresent()) {
			assertNotNull(planetaDaoMock.findByIdOrNome(planetaSalvo.get().getId(), null));
			assertNotNull(planetaDaoMock.findByIdOrNome(null, planetaSalvo.get().getNome()));
		}
		assertEquals(Optional.empty(), planetaSalvo);
	}
}
