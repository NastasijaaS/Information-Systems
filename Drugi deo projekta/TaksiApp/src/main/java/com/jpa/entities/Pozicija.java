package com.jpa.entities;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "pozicija")
public class Pozicija
	{



	 /* @TableGenerator(name = "taksi_gen", table="id_gen",
	  pkColumnName= "gen_name", valueColumnName= "gen_value",
	 allocationSize = 1, pkColumnValue = "taksi_gen")
	 @Id
	 @GeneratedValue (strategy = GenerationType.TABLE,generator = "taksi_gen")*/
	
	  
	  @Column (name = "taksi_id")
	   private String taksiid;
	
	  @Id
	   @Column(name="idlokacija")
	   private int lokacijaid;


	  
	  public Pozicija()	  

	  {

	  }
		

	  public Pozicija(String taksiid, int lokacijaid)

	  {
		this.setTaksiId(taksiid);
	    this.setLokacijaId(lokacijaid);
		
	  }


	  public void setTaksiId(String taksiid)
		{
			this.taksiid = taksiid;
			
		}
	  
	  public void setLokacijaId(int lokacijaid)
		{
			this.lokacijaid = lokacijaid;
			
		}

	
	
	public String getTaksiId() 
	{
	 	return taksiid;
    }
	  
	public int getLokacijaId()  
	{
		return lokacijaid;
	}

	

	
	
	  
	@Override

	  public String toString()
	{
		return "Lokacija id=" + lokacijaid + ", " + "Taksi id:" + taksiid;
	}
	}
