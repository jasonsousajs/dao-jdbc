package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer Id;
	private String Name;
	private String Email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department departamet;
	
	public Seller() {}

	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary, Department departamet) {
		Id = id;
		Name = name;
		Email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.departamet = departamet;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartamet() {
		return departamet;
	}

	public void setDepartamet(Department departamet) {
		this.departamet = departamet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + ", departamet=" + departamet + "]";
	}
	
	
	
}
