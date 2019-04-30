package br.com.amedigital.dao;

import java.util.Arrays;
import javax.naming.ServiceUnavailableException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import br.com.amedigital.entidade.ResultsApi;

@Repository
public class PlanetaApiDao {

	final static String url = "https://swapi.co/api/planets/";

	public ResponseEntity<ResultsApi> listar() throws ServiceUnavailableException {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.exchange(url, HttpMethod.GET, configurarHeaders(), ResultsApi.class);
	}

	private HttpEntity<String> configurarHeaders() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		httpHeaders.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
		HttpEntity<String> httpEntity = new HttpEntity<String>("parameters", httpHeaders);
		return httpEntity;
	}

}
