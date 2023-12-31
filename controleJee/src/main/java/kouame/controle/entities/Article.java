package kouame.controle.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateProduction;
	@ManyToOne
   private Categorie categorie ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateProduction() {
		return dateProduction;
	}
	public void setDateProduction(Date dateProduction) {
		this.dateProduction = dateProduction;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Article(String nom, Date dateProduction, Categorie categorie) {
		super();
		this.nom = nom;
		this.dateProduction = dateProduction;
		this.categorie = categorie;
	}
	public Article() {
		super();
	}
}
