package br.com.amedigital.entidade;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetaApi {

	private String name;
	private Integer rotation_period; 
	private Integer orbital_period; 
	private Integer diameter; 
	private String climate;
	private String gravity; 
	private String terrain; 
	private List<String> residents;
	private List<String> films;
	private LocalDate created; 
	private LocalDate edited; 
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRotation_period() {
		return rotation_period;
	}

	public void setRotation_period(Integer rotation_period) {
		this.rotation_period = rotation_period;
	}

	public Integer getOrbital_period() {
		return orbital_period;
	}

	public void setOrbital_period(Integer orbital_period) {
		this.orbital_period = orbital_period;
	}

	public Integer getDiameter() {
		return diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public List<String> getResidents() {
		return residents;
	}

	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	public List<String> getFilms() {
		return films;
	}

	public void setFilms(List<String> films) {
		this.films = films;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public LocalDate getEdited() {
		return edited;
	}

	public void setEdited(LocalDate edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
