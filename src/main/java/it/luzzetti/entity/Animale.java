package it.luzzetti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String specie;

	public Animale() {
		super();
	}

	public Animale(String nome, String specie) {
		this.nome = nome;
		this.specie = specie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	@Override
	public String toString() {
		return "Animale [id=" + id + ", nome=" + nome + ", specie=" + specie + "]";
	}

}
