package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.TableGenerator;


@Entity
@Table (name = "lokacija")
public class Lokacija
	{



	 /* @TableGenerator(name = "taksi_gen", table="id_gen",
	  pkColumnName= "gen_name", valueColumnName= "gen_value",
	 allocationSize = 1, pkColumnValue = "taksi_gen")
	 @Id
	 @GeneratedValue (strategy = GenerationType.TABLE,generator = "taksi_gen")*/
	
	   @Id
	   @Column(name="idlokacija")
	   private int lokacijaid;

	
	   @Column (name = "lokacija_naziv")
	   private String naziv_lokacije;

	   @Column (name="adresa")
	   private String adresa;
	  
	   

	  
	  public Lokacija()	  

	  {

	  }
		

	  public Lokacija(int lokacijaid, String naziv_lokacije, String adresa)

	  {
 		
	    this.setId(lokacijaid);
		this.setNaziv(naziv_lokacije);
		this.setAdresa(adresa);
		
		
	  }


	  public void setId(int lokacijaid)
	  {
		this.lokacijaid = lokacijaid;
		
	  }


	public void setNaziv(String naziv_lokacije)
	{
		this.naziv_lokacije = naziv_lokacije;
		
	}


	public void setAdresa(String adresa)
	{
		this.adresa = adresa;
		
	}
	
	

	public int getId()  
	{
		return lokacijaid;
	}

	  public String getNaziv() 
	{
	 	return naziv_lokacije;
	}

	  public String getAdresa()
	{
		return adresa;
	}

	
	  
	@Override

	  public String toString()
	{
		return "Lokacija id=" + lokacijaid + ", " + "Naziv lokacije:" + naziv_lokacije + ", " + "Adresa:" + adresa;
	}
	}

