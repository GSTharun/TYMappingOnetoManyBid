package com.ty.OnetoMany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long numb;
	private String address;
	@OneToMany(mappedBy = "phone")
	List<Sim> sim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumb() {
		return numb;
	}

	public void setNumb(long numb) {
		this.numb = numb;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

}
