package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.TableGenerator;


@Entity
@Table(name= "taksivozilo")
public class TaksiVozilo
	{


	
	   @Id
	   @Column(name="registracija")
	   private String registracija;

	
	   @Column (name = "imevlasnika")
	   private String ime_vlasnika;

	   @Column (name="adresa_stanovanja_vlasnika")
	   private String adresaVlasnika;

	   @Column (name="status")
           private String status;
	   

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public String getIme_vlasnika() {
		return ime_vlasnika;
	}

	public void setIme_vlasnika(String ime_vlasnika) {
		this.ime_vlasnika = ime_vlasnika;
	}

	public String getAdresaVlasnika() {
		return adresaVlasnika;
	}

	public void setAdresaVlasnika(String adresaVlasnika) {
		this.adresaVlasnika = adresaVlasnika;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TaksiVozilo(String registracija, String ime_vlasnika, String adresaVlasnika, String status) {
		super();
		this.registracija = registracija;
		this.ime_vlasnika = ime_vlasnika;
		this.adresaVlasnika = adresaVlasnika;
		this.status = status;
	}
	  
	   

	public TaksiVozilo() 
	{
		
	}
	}


