package br.com.amedigital.entidade;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsApi {

	private List<PlanetaApi> results;

	public List<PlanetaApi> getResults() {
		return results;
	}

	public void setResults(List<PlanetaApi> results) {
		this.results = results;
	}
}
